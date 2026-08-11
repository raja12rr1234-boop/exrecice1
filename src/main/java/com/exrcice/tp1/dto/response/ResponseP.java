package com.exrcice.tp1.dto.response;

///reponse de Product
public record ResponseP(
        Long id,
        String name,
        Double price,
        Integer stock,
        String categoryName) {

}
