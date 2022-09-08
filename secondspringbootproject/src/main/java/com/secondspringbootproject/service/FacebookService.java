package com.secondspringbootproject.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.secondspringbootproject.dao.FacebookDAOInterface;
import com.secondspringbootproject.entity.Product;



@Service
@Transactional
public class FacebookService implements FacebookServiceInterface{
     
	@Autowired
	 private FacebookDAOInterface fd;
	
	
	@Override
	public int createProductService(Product p1) {
		int i=0;
		fd.save(p1);
		i=1;
		return i;
	}


	@Override
	public List<Product> displayallproduct() {
		// TODO Auto-generated method stub
		return fd.findAll();
	}


	@Override
	public int deleteProductService(long l) {
		// TODO Auto-generated method stub
		int i=0;
		fd.deleteById(l);
		i=1;
		return i;
	}


	@Override
	public int editProductService(Product p1) {
		int i=0;
		fd.saveAndFlush(p1);
		i=1;
		return i;
	}


	@Override
	public Product displayProductService(long l) {
		Optional<Product> ll=fd.findById(l);
		Product p=null;
		if(ll.isPresent()) {
		p=ll.get();
		}
		return p;
	}

}
