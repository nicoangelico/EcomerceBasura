/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pichon.memo.servicio;

import com.pichon.memo.modelo.Products;
import com.pichon.memo.repositorio.ProductsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Pichonarsenal
 */
@Service
public class ProductsService {
    
@Autowired
    private ProductsRepository productsRepository;
    
    //Products
    public List<Products> getAllProducts(){
        return productsRepository.findAll();
    }

    public Products getProductsById(long id){
        return productsRepository.getOne(id);
    }

    public Products saveProducts(Products products){
        return productsRepository.save(products);
    }

    public void removeProducts(Products products){
        productsRepository.delete(products);
    }
    
}
