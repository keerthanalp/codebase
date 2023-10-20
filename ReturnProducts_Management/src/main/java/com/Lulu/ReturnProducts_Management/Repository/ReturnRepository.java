package com.Lulu.ReturnProducts_Management.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Lulu.ReturnProducts_Management.Entity.DamagedProducts;


public interface ReturnRepository extends JpaRepository<DamagedProducts, Integer> {

}
