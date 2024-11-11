package vn.iotstar.dao;

import java.util.List;

import vn.iotstar.entity.Users;

public interface IUserDao {
	List<Users> findAll(int page, int pagesize);
	List<Users> findByName(String username);
	List<Users> findAll();
	Users findById(int userid);
}
