package vn.iotstar.dao.impl;

import java.util.List;

import jakarta.persistence.*;
import vn.iotstar.configs.JPAConfig;
import vn.iotstar.dao.IUserDao;
import vn.iotstar.entity.Users;

public class UserDaoImpl implements IUserDao {
	
	@Override
	public List<Users> findAll(int page, int pagesize) {
		EntityManager enma = JPAConfig.getEntityManager();
		String queryStr = "SELECT u FROM Users u";
        TypedQuery<Users> query = enma.createQuery(queryStr, Users.class);
        query.setFirstResult((page - 1) * pagesize);
        query.setMaxResults(pagesize);
        return query.getResultList();
	}

	@Override
	public List<Users> findByName(String username) {
		EntityManager enma = JPAConfig.getEntityManager();
		String queryStr = "SELECT u FROM Users u WHERE u.username LIKE :username";
        TypedQuery<Users> query = enma.createQuery(queryStr, Users.class);
        query.setParameter("username", "%" + username + "%");
        return query.getResultList();
	}

	@Override
	public List<Users> findAll() {
		EntityManager enma = JPAConfig.getEntityManager();
		String queryStr = "SELECT u FROM Users u";
        TypedQuery<Users> query = enma.createQuery(queryStr, Users.class);
        return query.getResultList();
	}

	@Override
	public Users findById(int userid) {
		EntityManager enma = JPAConfig.getEntityManager();
		return enma.find(Users.class, userid);
	}

}
