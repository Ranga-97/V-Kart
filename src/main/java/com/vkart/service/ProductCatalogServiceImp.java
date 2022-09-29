package com.vkart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vkart.dao.ProductCatalogDao;
import com.vkart.entity.ProductCatalog;
@Service
public class ProductCatalogServiceImp implements ProductCatalogService{
	@Autowired
	private ProductCatalogDao productCatalogDao;
	@Override
	public ProductCatalog saveProductCatalog(ProductCatalog productcatalog) {
	
		return productCatalogDao.save(productcatalog);
	}

	@Override
	public ProductCatalog updateProductCatalog(ProductCatalog productCatalog) {
		
		return productCatalogDao.save(productCatalog);
	}

	@Override
	public boolean deleteProductCatalog(int id) {
		productCatalogDao.deleteById(id);
		return false;
	}

	@Override
	public List<ProductCatalog> getProductCatalogs(ProductCatalog productCatalog) {
	
		return productCatalogDao.findAll();
	}

	@Override
	public ProductCatalog getbyId(int id, ProductCatalog productCatalog) {
	
		return productCatalogDao.findById(id).get();
	}

}
