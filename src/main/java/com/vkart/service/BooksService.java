package com.vkart.service;


import java.util.List;

import com.vkart.entity.Books;

public interface BooksService {
	public Books saveBook(Books books);
	public Books updateBook(Books books);
	public boolean deleteBook(int id);
	public List<Books> getBooks(Books books);
	public Books getbyId(int id,Books books);
}
