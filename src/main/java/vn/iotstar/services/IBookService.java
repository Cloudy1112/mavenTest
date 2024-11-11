package vn.iotstar.services;

import java.util.List;

import vn.iotstar.entity.Books;

public interface IBookService {
	
	List<Books> findAll(int page, int pagesize);
	int count();
	List<Books> findByid(int id);
	List<Books> findByName(String bookname);
	
	
}
