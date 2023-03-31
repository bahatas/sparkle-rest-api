package com.accounting.sparklerestapi.service;

import com.accounting.sparklerestapi.dto.CategoryDto;

import java.util.List;

public interface CategoryService {


    CategoryDto findById(Long Id);

   CategoryDto save(CategoryDto categoryDto);

//    CategoryDTO update(CategoryDTO categoryDTO);
//
//    void delete(Long id);
//
//    List<CategoryDTO> listAllCategory();
//
//    boolean isCategoryExist(CategoryDTO categoryDTO, CompanyDTO companyDTO);



}
