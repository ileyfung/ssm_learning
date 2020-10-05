package com.lifeng.test;

import com.lifeng.dao.DoorMapper;
import com.lifeng.pojo.Door;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class MybatisTest {
	public static void main(String[] args) throws Exception{
		//读取核心配置文件
		InputStream resourceAsStream = Resources.getResourceAsStream("mybatis/mybatis-config.xml");
		//创建SQLSession工厂
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(resourceAsStream);
		//获取SQLSession
		SqlSession sqlSession = factory.openSession();
		//调用接口实现类方法访问数据库
		DoorMapper mapper = sqlSession.getMapper(DoorMapper.class);
		List<Door> doors = mapper.findAll();
		for (Door door : doors) {
			System.out.println(door.getName());
		}
	}
}
