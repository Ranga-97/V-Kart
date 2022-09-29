package com.vkart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vkart.dao.BooksDao;
import com.vkart.entity.Books;
@Service
public class BookServiceImp implements BooksService{
	
	@Autowired
	private BooksDao bookDao;

	@Override
	public Books saveBook(Books books) {
	
		return bookDao.save(books);
	}

	@Override
	public Books updateBook(Books books) {
		
		return bookDao.save(books);
	}

	@Override
	public boolean deleteBook(int id) {
		bookDao.deleteById(id);
		return true ;
	}

	@Override
	public List<Books> getBooks(Books books) {
		
		return bookDao.findAll();
	}

	@Override
	public Books getbyId(int id, Books books) {
		
		return bookDao.findById(id).get();
	}

}
