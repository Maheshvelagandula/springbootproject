package com.secondspringbootproject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.secondspringbootproject.entity.Product;

@Repository
public interface FacebookDAOInterface extends JpaRepository<Product,Long>{
    
}
