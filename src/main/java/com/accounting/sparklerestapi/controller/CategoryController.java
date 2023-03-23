package com.accounting.sparklerestapi.controller;

import com.accounting.sparklerestapi.dto.CategoryDto;
import com.accounting.sparklerestapi.service.CategoryService;
import com.accounting.sparklerestapi.util.MapperUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/v1/categories")
public class CategoryController {

    public CategoryController(CategoryService categoryService, MapperUtil mapperUtil) {
        this.categoryService = categoryService;
        this.mapperUtil = mapperUtil;
    }

    private final CategoryService categoryService;
    private final MapperUtil mapperUtil;

    @GetMapping("/{id}")
    public ResponseEntity<CategoryDto> getCategoryById(@PathVariable String id) {
        return ResponseEntity.ok(CategoryDto.builder().id(1L).company("Apple").description("MacBook").build());
    }


}







