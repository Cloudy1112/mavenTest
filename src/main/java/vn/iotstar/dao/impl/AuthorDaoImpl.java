package vn.iotstar.dao.impl;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import vn.iotstar.configs.JPAConfig;
import vn.iotstar.dao.IAuthorDao;
import vn.iotstar.entity.Author;

public class AuthorDaoImpl implements IAuthorDao {

	
	
	@Override
	public List<Author> findAll(int page, int pagesize) {
		EntityManager enma = JPAConfig.getEntityManager();
		String queryStr = "SELECT u FROM Author u";
        TypedQuery<Author> query = enma.createQuery(queryStr, Author.class);
        query.setFirstResult((page - 1) * pagesize);
        query.setMaxResults(pagesize);
        return query.getResultList();
	}

	@Override
	public List<Author> findByName(String authorname) {
		EntityManager enma = JPAConfig.getEntityManager();
		String queryString ="select u from author where u.authorname like :authorname ";
		TypedQuery<Author> query = enma.createQuery(queryString, Author.class );
		query.setParameter("authorname","%"+ authorname +"%");
		return query.getResultList();
	}

	@Override
	public List<Author> findAll() {
		EntityManager enma = JPAConfig.getEntityManager();
		String queryStr = "SELECT u FROM Author u";
        TypedQuery<Author> query = enma.createQuery(queryStr, Author.class);
        return query.getResultList();
	}

	@Override
	public Author findById(int authorid) {
		EntityManager enma = JPAConfig.getEntityManager();
		return enma.find(Author.class, authorid);
	}

	@Override
	public void delete(int authorid) throws Exception {
		EntityManager enma = JPAConfig.getEntityManager();
		EntityTransaction trans = enma.getTransaction();
		try {
			trans.begin();
			// gọi phuong thức để insert, update, delete
			Author author = enma.find(Author.class, authorid);
			if (author != null) {
				enma.remove(author);
			} else {
				throw new Exception("Không tìm thấy");
			}
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
			throw e;
		} finally {
			enma.close();
		}
		
	}

	@Override
	public void update(Author author) {
		EntityManager enma = JPAConfig.getEntityManager();
		EntityTransaction trans = enma.getTransaction();
		try {
			trans.begin();
			// gọi phuong thức để insert, update, delete
			enma.merge(author);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
			throw e;
		} finally {
			enma.close();
		}
		
	}

	@Override
	public void insert(Author author) {
		EntityManager enma = JPAConfig.getEntityManager();
		EntityTransaction trans = enma.getTransaction();
		try {
			trans.begin();
			// gọi phuong thức để insert, update, delete
			enma.persist(author);
			trans.commit();
		} catch (Exception e) {
			e.printStackTrace();
			trans.rollback();
			throw e;
		} finally {
			enma.close();
		}
		
	}

	@Override
	public int count() {
		EntityManager enma = JPAConfig.getEntityManager();
		String jpql = "SELECT count(c) FROM Author c";
		Query query = enma.createQuery(jpql);
		return ((Long) query.getSingleResult()).intValue();
	}

}
