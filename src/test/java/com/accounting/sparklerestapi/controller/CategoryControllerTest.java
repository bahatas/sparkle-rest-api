package com.accounting.sparklerestapi.controller;

import com.accounting.sparklerestapi.service.CategoryService;
import com.accounting.sparklerestapi.util.MapperUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
@ContextConfiguration(classes = CategoryController.class)
class CategoryControllerTest {
    @MockBean
    private  CategoryService categoryService;
    @MockBean
    private  MapperUtil mapperUtil;
    @Autowired
    private MockMvc mockMvc;

    @Test
    void getCategoryById() throws Exception {

        mockMvc.perform(MockMvcRequestBuilders
                        .get("/api/v1/categories/{id}", 1L)
                        .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.description").isNotEmpty());
    }
}