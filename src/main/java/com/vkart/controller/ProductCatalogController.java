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

import com.vkart.entity.ProductCatalog;
import com.vkart.service.ProductCatalogService;
@RestController
@RequestMapping("/api/Products")
public class ProductCatalogController {
	@Autowired
	private ProductCatalogService productCatalogService;
	
	@PostMapping("/add")
	public ProductCatalog saveProductCatalog(@RequestBody ProductCatalog productCatalog) {
		return productCatalogService.saveProductCatalog(productCatalog);
	}
	@PutMapping("/update/{id}")
	public ProductCatalog updateCatalog(@RequestBody ProductCatalog productCatalog, @PathVariable int id ) {
		productCatalog.setId(id);
		return productCatalogService.updateProductCatalog(productCatalog);
	}
	@DeleteMapping("/delete/{id}")
	public boolean deleteProductCatalog(@PathVariable int id) {
		productCatalogService.deleteProductCatalog(id);
		return true;
	}
	@GetMapping("/get")
	public List<ProductCatalog> getAllCatalogs(@RequestBody ProductCatalog productCatalogs){
		return productCatalogService.getProductCatalogs(productCatalogs);
	}
	@GetMapping("/get/{id}")
	public ProductCatalog getbyProductCatalog( @PathVariable int id, @RequestBody ProductCatalog productCatalog ) {
		return productCatalogService.getbyId(id, productCatalog);
	}
}
