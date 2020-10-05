package com.lifeng.service;

import com.lifeng.pojo.Door;

import java.util.List;

public interface DoorService {
	//根据id更新门店信息
	void doorUpdate(Door door);
	//根据id查询门店
	Door doorInfo(Integer id);
	//根据id删除门店
	void doorDelete(Integer id);
	//新增门店
	void doorAdd(Door door);
	//查询所有门店列表
	List<Door> findAll();
}
