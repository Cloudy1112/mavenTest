package vn.iotstar.dao.impl;

import java.util.List;

import jakarta.persistence.*;
import vn.iotstar.configs.JPAConfig;
import vn.iotstar.dao.IBookDao;
import vn.iotstar.entity.Books;



public class BookDaoImpl implements IBookDao{

	@Override
	public List<Books> findByName(String bookname) {
		EntityManager enma = JPAConfig.getEntityManager();
		String queryStr = "SELECT u FROM Books u WHERE u.title LIKE :bookname";
        TypedQuery<Books> query = enma.createQuery(queryStr, Books.class);
        query.setParameter("bookname", "%" + bookname + "%");
        return query.getResultList();
	}

	@Override
	public List<Books> findByid(int id) {
		EntityManager enma = JPAConfig.getEntityManager();
		String queryStr = "SELECT u FROM Books u WHERE u.id LIKE :id";
        TypedQuery<Books> query = enma.createQuery(queryStr, Books.class);
        query.setParameter("id", "%" + id + "%");
        return query.getResultList();
	}

	@Override
	public int count() {
		EntityManager enma = JPAConfig.getEntityManager();
		String jpql = "SELECT count(c) FROM Books c";
		Query query = enma.createQuery(jpql);
		return ((Long) query.getSingleResult()).intValue();
	}

	@Override
	public List<Books> findAll(int page, int pagesize) {
		EntityManager enma = JPAConfig.getEntityManager();
		String queryStr = "SELECT u FROM Books u";
        TypedQuery<Books> query = enma.createQuery(queryStr, Books.class);
        query.setFirstResult((page - 1) * pagesize);
        query.setMaxResults(pagesize);
        return query.getResultList();
	}

}
