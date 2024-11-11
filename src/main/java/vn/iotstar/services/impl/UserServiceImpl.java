package vn.iotstar.services.impl;

import java.util.List;

import vn.iotstar.dao.IUserDao;
import vn.iotstar.dao.impl.UserDaoImpl;
import vn.iotstar.entity.Users;
import vn.iotstar.services.IUserService;

public class UserServiceImpl implements IUserService {

	IUserDao userDao = new UserDaoImpl();
	
	@Override
	public List<Users> findAll(int page, int pagesize) {
		// TODO Auto-generated method stub
		return userDao.findAll(page, pagesize);
	}

	@Override
	public List<Users> findByName(String username) {
		// TODO Auto-generated method stub
		return userDao.findByName(username);
	}

	@Override
	public List<Users> findAll() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}

	@Override
	public Users findById(int userid) {
		// TODO Auto-generated method stub
		return userDao.findById(userid);
	}

}
