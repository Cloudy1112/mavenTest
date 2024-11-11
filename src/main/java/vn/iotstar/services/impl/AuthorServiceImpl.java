package vn.iotstar.services.impl;

import java.util.List;

import vn.iotstar.dao.IAuthorDao;
import vn.iotstar.dao.impl.AuthorDaoImpl;
import vn.iotstar.entity.Author;
import vn.iotstar.services.IAuthorService;

public class AuthorServiceImpl implements IAuthorService {

	IAuthorDao authorDao = new AuthorDaoImpl();
	
	@Override
	public List<Author> findAll(int page, int pagesize) {
		return authorDao.findAll(page, pagesize);
	}

	@Override
	public List<Author> findByName(String authorname) {
		return authorDao.findByName(authorname);
	}

	@Override
	public List<Author> findAll() {
		return authorDao.findAll();
	}

	@Override
	public Author findById(int authorid) {
		return authorDao.findById(authorid);
	}

	@Override
	public void delete(int authorid) throws Exception {
		authorDao.delete(authorid);
	}

	@Override
	public void update(Author author) {
		authorDao.update(author);
		
	}

	@Override
	public void insert(Author author) {
		authorDao.insert(author);
		
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return authorDao.count();
	}

}
