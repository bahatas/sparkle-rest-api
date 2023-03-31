package com.accounting.sparklerestapi.controller;
import com.accounting.sparklerestapi.repository.CategoryRepository;
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
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//@SpringBootTest
//@AutoConfigureTestDatabase
//@SqlGroup({ @Sql(value = "classpath:data1.sql", executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)})
@WebMvcTest
@ContextConfiguration(classes = CategoryController.class)
//@ExtendWith(MockitoExtension.class)
class CategoryControllerTest {
//    @InjectMocks
//    private CategoryServiceImpl categoryService;
    @MockBean
    private MapperUtil mapperUtil;
    @MockBean
    private CategoryRepository categoryRepository;
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


////     @Test
//    @ParameterizedTest
//    @ValueSource(longs = {1, 2})
//    void findById_Test(Long id) {
//
//        // Given (Preparation)
//        Category category = new Category();
//
//        when(categoryRepository.findById(id)).thenReturn(Optional.of(category));   // Optional<Task>
//        when(mapperUtil.convert(category, new CategoryDto())).thenReturn(new CategoryDto());
//
//        // When (Action is happening)
//        categoryServiceImpl.findById(id);// We are not defining this will be the method I want to test.
//
//        // Then (Assertion and verification checks)
//        verify(categoryRepository).findById(id);
//        verify(mapperUtil).convert(category, new CategoryDto());
//
//    }

    }




