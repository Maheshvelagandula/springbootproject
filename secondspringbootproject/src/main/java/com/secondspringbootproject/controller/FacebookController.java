package com.secondspringbootproject.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.secondspringbootproject.entity.Product;
import com.secondspringbootproject.service.FacebookServiceInterface;

@RestController
public class FacebookController {
	@Autowired
	private FacebookServiceInterface fs;
	@GetMapping("showallproduct")
	
	public List<Product> Total(){
		return fs.displayallproduct();
		 
	}
	
	@GetMapping("display/{productid}")
	public Product display(@PathVariable("productid") long l) {
		return fs.displayProductService(l);
	}
	@PostMapping("createproduct")
		public String create(@RequestBody Product p1) {
		
		int i=fs.createProductService(p1);
		if(i>0) {
			return "product created sucessfully";
		}else {
			return "could not created" ;
		}
	}
		@PutMapping("editproduct/{productid}")
		public String edit(@PathVariable("productid") long l,@RequestBody Product p1) {
			p1.setPid(l);
			int i=fs.editProductService(p1);
			if(i>0) {
				return "product edited sucessfully";
			}else {
				return "could not edit" ;
			}
		}
		
		@DeleteMapping("deleteproduct/{productid}")
		public String delete(@PathVariable("productid") long l ) {
			int i=fs.deleteProductService(l);
			if(i>0) {
				return "product deleted sucessfully";
			}else {
				return "could not deleted" ;
			}
		}
}
