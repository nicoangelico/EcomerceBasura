/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pichon.memo.servicio;

import com.pichon.memo.modelo.Categories;
import com.pichon.memo.repositorio.CategoryRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Pichonarsenal
 */
@Service
public class CategoryService {
    
    @Autowired
    private CategoryRepository categoryRepository;
    
    //Products
    public List<Categories> getAllCategory(){
        return categoryRepository.findAll();
    }

    public Categories getCategoryById(long id){
        return categoryRepository.getOne(id);
    }

    public Categories saveCategory(Categories category){
        return categoryRepository.save(category);
    }

    public void removeCategory(Categories category){
        categoryRepository.delete(category);
    }
    
}
