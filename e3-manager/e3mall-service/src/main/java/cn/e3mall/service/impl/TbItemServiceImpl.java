package cn.e3mall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.e3mall.mapper.TbItemMapper;
import cn.e3mall.pojo.DatagridResult;
import cn.e3mall.pojo.TbItem;
import cn.e3mall.pojo.TbItemExample;
import cn.e3mall.service.TbItemService;
@Service
public class TbItemServiceImpl implements TbItemService {

	@Autowired
	private TbItemMapper itemMapper;
	
	public TbItem findById(Long id) {
		return itemMapper.selectByPrimaryKey(id);
	}

	public DatagridResult findAll(int page, int rows) {
		PageHelper.startPage(page, rows);
		
		TbItemExample example = new TbItemExample();
		List<TbItem> list = itemMapper.selectByExample(example);
		
		PageInfo<TbItem> pageInfo = new PageInfo<>(list);
		long total = pageInfo.getTotal();
		DatagridResult result = new DatagridResult();
		result.setTotal((int)total);
		result.setRows(list);
		return result;
	}

}
