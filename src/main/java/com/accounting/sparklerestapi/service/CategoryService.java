package com.accounting.sparklerestapi.service;

import com.accounting.sparklerestapi.dto.CategoryDto;

import java.util.List;

public interface CategoryService {


    CategoryDto findById(Long Id);

   CategoryDto save(CategoryDto categoryDto);

    void  update(Long id, CategoryDto categoryDto);

    void delete(Long id);

    List<CategoryDto> listAllCategory();



//
//    boolean isCategoryExist(CategoryDTO categoryDTO, CompanyDTO companyDTO);



}
