/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pichon.memo.repositorio;

import com.pichon.memo.modelo.Products;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Pichonarsenal
 */
public interface ProductsRepository extends JpaRepository<Products, Long>{
    
}
