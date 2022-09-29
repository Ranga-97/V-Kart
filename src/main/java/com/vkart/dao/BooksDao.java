package com.vkart.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vkart.entity.Books;

@Repository
public interface BooksDao extends JpaRepository<Books, Integer> {

}
