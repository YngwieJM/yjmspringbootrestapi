package com.juaracoding.yjmspringbootrestapi.dto.validation;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class ValProductsDTO {


//    private Long id;

    @NotNull
    @Pattern(regexp = "^[A-Za-z0-9 ]{1,100}$", message = "Name must be alphanumeric and up to 100 characters")
    private String name;

    @Pattern(regexp = "^[A-Za-z0-9 .,!?'-]{0,500}$", message = "Description must be up to 500 characters and can include basic punctuation")
    private String description;

    @NotNull
    @Pattern(regexp = "^[0-9]+(\\.[0-9]{1,2})?$", message = "Price must be a valid number with up to two decimal places")
    private Double price;

    @NotNull
    @Pattern(regexp = "^[0-9]+$", message = "Stock must be a non-negative integer")
    private Integer stock;
}
