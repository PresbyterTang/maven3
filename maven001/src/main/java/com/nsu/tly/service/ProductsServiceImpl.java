package com.nsu.tly.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nsu.tly.dao.ProductsDAO;
import com.nsu.tly.entity.Products;

@Service("productsService")
public class ProductsServiceImpl implements ProductsService {

	@Autowired
	private ProductsDAO productsDAO;
	
	@Override
	public int addProducts(Products products) {
		System.out.println("执行ProductsServiceImpl.productsAdd方法");
		this.productsDAO.save(products);
		return 0;
	}

}
