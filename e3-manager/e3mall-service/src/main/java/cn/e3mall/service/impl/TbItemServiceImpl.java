package cn.e3mall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.e3mall.mapper.TbItemMapper;
import cn.e3mall.pojo.TbItem;
import cn.e3mall.service.TbItemService;
@Service
public class TbItemServiceImpl implements TbItemService {

	@Autowired
	private TbItemMapper itemMapper;
	
	public TbItem findById(Long id) {
		return itemMapper.selectByPrimaryKey(id);
	}

}
