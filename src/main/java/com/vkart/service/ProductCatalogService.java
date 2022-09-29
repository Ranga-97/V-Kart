package com.vkart.service;

import java.util.List;

import com.vkart.entity.ProductCatalog;

public interface ProductCatalogService {
	public ProductCatalog saveProductCatalog(ProductCatalog productcatalog);
	public ProductCatalog updateProductCatalog(ProductCatalog productCatalog);
	public boolean deleteProductCatalog(int id);
	public List<ProductCatalog> getProductCatalogs(ProductCatalog productCatalog);
	public ProductCatalog getbyId(int id,ProductCatalog productCatalog);
}
