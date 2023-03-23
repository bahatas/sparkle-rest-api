package com.accounting.sparklerestapi.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

import javax.persistence.Table;

@Entity
@NoArgsConstructor
@Table(name = "categories")
@Getter
@Setter
public class Category  extends BaseEntity{

    public String description;

    private String company;
}
