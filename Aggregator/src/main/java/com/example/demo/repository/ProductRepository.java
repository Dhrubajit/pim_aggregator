package com.example.demo.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Product;


public interface ProductRepository extends CrudRepository<Product, Integer> {
	public List<Product> findAllByCreateddate(Date date);
}
