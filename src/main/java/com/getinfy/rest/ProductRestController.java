package com.getinfy.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.getinfy.entity.ProductEntity;
import com.getinfy.repo.ProductRepo;

@RestController
public class ProductRestController {
	
	@Autowired
	private ProductRepo repo;
	
	@PostMapping("/saveProduct")
	public ResponseEntity<?> saveProduct(@RequestBody ProductEntity entity) {
		ProductEntity save = repo.save(entity);
		
		
		return new ResponseEntity<>("Product saved successfully", HttpStatus.CREATED);
		
	}

}
