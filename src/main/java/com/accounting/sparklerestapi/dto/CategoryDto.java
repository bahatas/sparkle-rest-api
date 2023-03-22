package com.accounting.sparklerestapi.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CategoryDto {
    private Long id;

    private String description;
    private String company;
    private boolean hasProduct;

}
