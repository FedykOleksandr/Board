package com.example.board.entity;

import lombok.Getter;

@Getter
public enum Category{

    CATEGORY_1("Category 1"),
    CATEGORY_2("Category 2"),
    CATEGORY_3("Category 3"),
    CATEGORY_4("Category 4"),
    CATEGORY_5("Category 5");

    private final String name;

    Category(String name) {
        this.name = name;
    }
}
