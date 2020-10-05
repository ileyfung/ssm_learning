package com.lifeng.service;

import com.lifeng.dao.DoorMapper;
import com.lifeng.pojo.Door;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//标注该类是业务类，并将该类的对象创建交给容器
@Service
public class DoorServiceImpl implements DoorService{

	//自动注入(由spring创建mapper对象并为属性赋值)
	@Autowired
	DoorMapper doorMapper;

	//根据id更新
	public void doorUpdate(Door door) {
		doorMapper.doorUpdate(door);
	}

	//根据id查询
	public Door doorInfo(Integer id) {
		return doorMapper.doorInfo(id);
	}
	//根据id删除
	public void doorDelete(Integer id) {
		doorMapper.doorDelete(id);
	}

	//新增门店
	public void doorAdd(Door door) {
		doorMapper.doorAdd(door);
	}
	//查询所有门店
	public List<Door> findAll() {
		return doorMapper.findAll();
	}
}
