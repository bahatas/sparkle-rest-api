package com.accounting.sparklerestapi.controller;

import com.accounting.sparklerestapi.dto.CategoryDto;
import com.accounting.sparklerestapi.service.CategoryService;
import com.accounting.sparklerestapi.util.MapperUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/categories")
public class CategoryController {

    private final CategoryService categoryService;
    private final MapperUtil mapperUtil;
    public CategoryController(CategoryService categoryService, MapperUtil mapperUtil) {
        this.categoryService = categoryService;
        this.mapperUtil = mapperUtil;
    }


    @GetMapping
    public ResponseEntity<List<CategoryDto>> getAllCategories(){
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("Version", "Cydeo.V2")
                .header("Operation", "Get List")
                .body(categoryService.listAllCategory());
    }



    @GetMapping("/{id}")
    public ResponseEntity<CategoryDto> getCategoryById(@PathVariable String id) {
        return ResponseEntity.ok(CategoryDto.builder().id(1L).company("Apple").description("MacBook").build());
    }

    @PostMapping
    public ResponseEntity<CategoryDto> createCategory(@RequestBody CategoryDto categoryDto) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .header("Operation", "Create")
                .body(categoryService.save(categoryDto));

    }
    @PutMapping("{id}")
    public ResponseEntity<CategoryDto> updateCategory(@PathVariable ("id") Long id, @RequestBody CategoryDto category){
        categoryService.update(id, category);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<CategoryDto> deleteCategory(@PathVariable("id") Long id){
        categoryService.delete(id);
        return  ResponseEntity.noContent().build();
    }


}





