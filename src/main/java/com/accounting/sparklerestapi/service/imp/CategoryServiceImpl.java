package com.accounting.sparklerestapi.service.imp;

import com.accounting.sparklerestapi.dto.CategoryDto;
import com.accounting.sparklerestapi.entity.Category;
import com.accounting.sparklerestapi.repository.CategoryRepository;
import com.accounting.sparklerestapi.service.CategoryService;
import com.accounting.sparklerestapi.util.MapperUtil;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class CategoryServiceImpl implements CategoryService {
    private MapperUtil mapperUtil;

    public CategoryServiceImpl(MapperUtil mapperUtil, CategoryRepository categoryRepository) {
        this.mapperUtil = mapperUtil;
        this.categoryRepository = categoryRepository;
    }

    private CategoryRepository categoryRepository;

    @Override
    public CategoryDto findById(Long id) {

        Optional<Category> byId = categoryRepository.findById(id);

        return mapperUtil.convert(byId, new CategoryDto());
    }
}
