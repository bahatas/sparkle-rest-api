package com.accounting.sparklerestapi.service.imp;

import com.accounting.sparklerestapi.dto.CategoryDto;
import com.accounting.sparklerestapi.entity.Category;
import com.accounting.sparklerestapi.repository.CategoryRepository;
import com.accounting.sparklerestapi.service.CategoryService;
import com.accounting.sparklerestapi.util.MapperUtil;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl implements CategoryService {
    private MapperUtil mapperUtil;

    public CategoryServiceImpl(MapperUtil mapperUtil, CategoryRepository categoryRepository) {
        this.mapperUtil = mapperUtil;
        this.categoryRepository = categoryRepository;
    }

    private final CategoryRepository categoryRepository;

    @Override
    public CategoryDto findById(Long id) {

        Optional<Category> byId = categoryRepository.findById(id);

        return mapperUtil.convert(byId, new CategoryDto());
    }

    @Override
    public CategoryDto save(CategoryDto categoryDto) {
        return null;
    }


//
//    @Override
//    public CategoryDto save(CategoryDto categoryDTO) {
//        CompanyDto companyDto = companyService.getCompanyByLoggedInUser();
//        categoryDTO.setCompany(companyDTO);
//        Category category = mapperUtil.convert(categoryDTO, new Category());
//        List<Category> list = categoryRepository.findAllByIsDeletedAndCompanyId(false, companyDto.getId());
//        List<String> descList1 = list.stream().map(Category::getDescription).collect(Collectors.toList());
//        List<String> descList=descList1.stream().map(String::toLowerCase).collect(Collectors.toList());
//        Category savedCategory;
//        if (!(descList.contains(category.getDescription().toLowerCase()))) {
//            savedCategory = categoryRepository.save(category);
//            return mapperUtil.convert(savedCategory, new CategoryDto());
//        } else{
//            return categoryDTO;
//        }

    }
//
//
//
//
//    @Override
//    public CategoryDTO update(CategoryDTO categoryDTO) {
//
//        CompanyDTO companyDTO = companyService.getCompanyByLoggedInUser();
//        categoryDTO.setCompany(companyDTO);
//
//        Category convertedCategory = mapperUtil.convert(categoryDTO, new Category());
//        convertedCategory.setId(categoryDTO.getId());
//        Category updatedCategory = categoryRepository.save(convertedCategory);
//
//        return mapperUtil.convert(updatedCategory, new CategoryDTO());
//
//
//    }
//
//    @Override
//    public void delete(Long id) {
//
//        Optional<Category> foundCategory = categoryRepository.findById(id);
//        boolean result = checkIfCategoryCanBeDeleted(foundCategory.get());
//        if (result) {
//            foundCategory.get().setIsDeleted(true);
//            categoryRepository.save(foundCategory.get());
//        } else {
//            CategoryDTO categoryDTO = mapperUtil.convert(foundCategory.get(), new CategoryDTO());
//            categoryDTO.setHasProduct(true);
//        }
//
//
//    }
//
//    @Override
//    public List<CategoryDTO> listAllCategory() {
//        CompanyDTO companyDTO = companyService.getCompanyByLoggedInUser();
//        Company company = mapperUtil.convert(companyDTO, new Company());
//
//        List<Category> listCategory = categoryRepository.findAllByIsDeletedAndCompanyId(false, company.getId());
//        List<CategoryDTO> categoryDTOList = listCategory.stream().map(category -> mapperUtil.convert(category, new CategoryDTO()))
//                .collect(Collectors.toList());
//        for (int i = 0, j = 0; i < categoryDTOList.size(); i++, j++) {
//            if (!(checkIfCategoryCanBeDeleted(listCategory.get(i)))) {
//                (categoryDTOList.get(i)).setHasProduct(true);
//            }
//        }
//        return categoryDTOList;
//    }
//
//    @Override
//    public boolean isCategoryExist(CategoryDTO categoryDTO, CompanyDTO companyDTO) {
//        Company company = mapperUtil.convert(companyDTO, new Company());
//        Category category = mapperUtil.convert(categoryDTO, new Category());
//        List<Category> list = categoryRepository.findAllByIsDeletedAndCompanyId(false, company.getId());
//        return list.contains(category);
//
//    }
//
//
//    private boolean checkIfCategoryCanBeDeleted(Category category) {
//        List<Product> productList = productRepository.findProductByCategory(category);
//        if (productList.size() == 0) {
//            return true;
//        } else {
//            return false;
//
//
//        }
//
//
//    }


