package com.ecommerce.controller;

import com.ecommerce.dto.CategoryDto;
import com.ecommerce.service.CategoryService;
import com.ecommerce.service.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CategoryController {

    @Autowired
    public CategoryService categoryService;

    @GetMapping(value = "/searchCategory")
    public ResponseEntity<Response> searchCategory() {
        Response response = new Response();
        response.setData(this.categoryService.searchCategory());
        response.setMessage("Search Complete");
        response.setStatus(true);
        return new ResponseEntity<Response>(response, HttpStatus.OK);
    }

    @PostMapping(value = "/insertCategory")
    public ResponseEntity<Response> insertCategory(@RequestBody CategoryDto dto) {
        Response response = new Response();
        this.categoryService.insertCategory(dto);
        return new ResponseEntity<Response>(response, HttpStatus.OK);
    }

    @PostMapping(value = "/updateCategory")
    public ResponseEntity<Response> updateCategory(@RequestBody CategoryDto dto) {
        Response response = new Response();
        this.categoryService.updateCategory(dto);
        return new ResponseEntity<Response>(response, HttpStatus.OK);
    }
}
