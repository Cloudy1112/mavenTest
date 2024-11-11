package vn.iotstar.services;
import java.util.List;

import vn.iotstar.entity.Author;

public interface IAuthorService {
	List<Author> findAll(int page, int pagesize);
	List<Author> findByName(String authorname);
	List<Author> findAll();
	Author findById(int authorid);

	void delete(int authorid) throws Exception;

	void update(Author author);

	void insert(Author author);
	
	int count(); 
}
