package com.vkart.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vkart.entity.ProductCatalog;
@Repository
public interface ProductCatalogDao extends JpaRepository<ProductCatalog, Integer> {

}
