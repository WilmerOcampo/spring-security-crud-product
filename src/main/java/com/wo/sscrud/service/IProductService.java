package com.wo.sscrud.service;

import com.wo.sscrud.entity.Product;

import java.util.List;
import java.util.Optional;

public interface IProductService {
    List<Product> findAll();

    Optional<Product> findById(Integer id);

    Product save(Product product);

    void deleteById(Integer id);
}
