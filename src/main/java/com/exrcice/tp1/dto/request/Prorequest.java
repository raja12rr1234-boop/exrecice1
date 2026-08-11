package com.exrcice.tp1.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Prorequest {

    private Long id;

    @NotBlank(message = "erourr message is not found")
    private String name;

    @NotNull(message = "price is note found ")
    private Double price;

    @NotNull(message = "stouck is not found")
    private Integer stouck;
    @NotBlank(message = "category is not found")
    private String categoryname;
}
