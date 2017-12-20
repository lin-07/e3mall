package cn.e3mall.service;

import cn.e3mall.pojo.DatagridResult;
import cn.e3mall.pojo.TbItem;

public interface TbItemService {

	TbItem findById(Long id);
	
	DatagridResult findAll(int page,int rows);
	
	
}
