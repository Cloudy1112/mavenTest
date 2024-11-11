package vn.iotstar.services.impl;

import java.util.List;

import vn.iotstar.dao.IBookDao;
import vn.iotstar.dao.impl.BookDaoImpl;
import vn.iotstar.entity.Books;
import vn.iotstar.services.IBookService;

public class BookServiceImpl implements IBookService {

	IBookDao bookDao = new BookDaoImpl();
	
	@Override
	public List<Books> findAll(int page, int pagesize) {
		// TODO Auto-generated method stub
		return bookDao.findAll(page, pagesize);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return bookDao.count();
	}

	@Override
	public List<Books> findByid(int id) {
		// TODO Auto-generated method stub
		return bookDao.findByid(id);
	}

	@Override
	public List<Books> findByName(String bookname) {
		// TODO Auto-generated method stub
		return bookDao.findByName(bookname);
	}

}
