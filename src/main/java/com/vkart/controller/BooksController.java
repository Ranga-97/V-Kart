package com.vkart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vkart.entity.Books;
import com.vkart.service.BooksService;

@RestController
@RequestMapping("/api/books")
public class BooksController {
	@Autowired
	private BooksService booksService;
	
	@PostMapping("/add")
	public Books saveBooks(@RequestBody Books books) {
		return booksService.saveBook(books);
	}
	@PutMapping("/update")
	public Books updateBooks(@RequestBody Books books) {
		return booksService.saveBook(books);
	}
	@DeleteMapping("/delete/{id}")
	public boolean deleteBooks(@PathVariable int id) {
		booksService.deleteBook(id);
		return true;
	}
	@GetMapping("/get")
	public List<Books> getAllBooks(@RequestBody Books books){
		return booksService.getBooks(books);
	}
	@GetMapping("/get/{id}")
	public Books getByBook(@RequestBody Books books,@PathVariable int id) {
		return booksService.getbyId(id, books);
	}
}
