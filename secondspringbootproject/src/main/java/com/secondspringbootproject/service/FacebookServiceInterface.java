package com.secondspringbootproject.service;

import java.util.List;

import com.secondspringbootproject.entity.Product;

public interface FacebookServiceInterface {

	int createProductService(Product p1);

	List<Product> displayallproduct();

	int deleteProductService(long l);

	int editProductService(Product p1);

	Product displayProductService(long l);

}
