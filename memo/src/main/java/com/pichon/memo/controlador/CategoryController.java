/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pichon.memo.controlador;

import com.pichon.memo.modelo.Categories;
import com.pichon.memo.servicio.CategoryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Pichonarsenal
 */
@RestController
public class CategoryController {
    
    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value="/category", method=RequestMethod.GET)
    public ResponseEntity<List<Categories>> getAllCategory(){
        return new ResponseEntity<List<Categories>>(categoryService.getAllCategory(), HttpStatus.OK);
    }
    
}
