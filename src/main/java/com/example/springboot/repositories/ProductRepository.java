package com.example.springboot.repositories;

import com.example.springboot.models.ProductsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;
@Repository
public interface ProductRepository extends JpaRepository<ProductsModel, UUID> {

}
