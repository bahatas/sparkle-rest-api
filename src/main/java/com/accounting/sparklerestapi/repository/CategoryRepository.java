package com.accounting.sparklerestapi.repository;


import com.accounting.sparklerestapi.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {


    List<Category> findAllByIsDeleted(Boolean isDeleted);




}
