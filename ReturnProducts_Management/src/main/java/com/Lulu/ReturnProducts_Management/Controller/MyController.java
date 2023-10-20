package com.Lulu.ReturnProducts_Management.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Lulu.ReturnProducts_Management.Entity.DamagedProducts;
import com.Lulu.ReturnProducts_Management.Repository.ReturnRepository;


import jakarta.persistence.EntityNotFoundException;
@RestController 
public class MyController {
	@Autowired

	ReturnRepository productRepository;


	@GetMapping("/ssp/getProduct")

	public List<DamagedProducts> getJPQL() {

 

		return productRepository.findAll(); // select * from <TableName>;

 

	}


	@PostMapping("/ssp/addProduct")

	public DamagedProducts createuser(@RequestBody DamagedProducts prod) {

		return productRepository.save(prod);

	}
	///Delete Operations  @PathVariable..

			@DeleteMapping("/ssp/deleteProduct/{id}")
			public void deletProduct(@PathVariable("id") Integer id  ) {

		 

				productRepository.deleteById(id); // select * from <TableName>;

		 
}


			@PutMapping("/ssp/updatesport/{id}")

			 

					public DamagedProducts updatePurchase(@PathVariable int id, @RequestBody DamagedProducts updatedProduct) {

			 

					    java.util.Optional<DamagedProducts> existingProduct = productRepository.findById(id);

		

			 

					    if (existingProduct.isPresent()) {

			 
					    	DamagedProducts productToUpdate = existingProduct.get();

			 

					        

			 

					        // Update the fields of the existing product with the new data

			 

					        if (updatedProduct.getProduct_name() != null) {

			 

					            productToUpdate.setProduct_name(updatedProduct.getProduct_name());

			 

					        }

			 

			 

					        if (updatedProduct.getReasontoreturn() != null) {

			 

					            productToUpdate.setReasontoreturn(updatedProduct.getReasontoreturn());

			 

					        }

			 
					        if (updatedProduct.getCustomer_name() != null) {

								 

					            productToUpdate.setCustomer_name(updatedProduct.getCustomer_name());

			 

					        }

				

			 

					        // Save the updated product to the repository

			 

					        return productRepository.save(productToUpdate);

			 

					    } else {

			 

					        // Handle the case where the product with the given ID doesn't exist

			 

					        throw new EntityNotFoundException("Sports Product with ID " + id + " not found");

			 

					    }

			 

					}
}
