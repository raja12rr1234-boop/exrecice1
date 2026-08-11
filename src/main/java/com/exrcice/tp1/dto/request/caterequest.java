package com.exrcice.tp1.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * caterequest
 */
@Data
@NoArgsConstructor
@AllArgsConstructor

public class caterequest {

    private Long id;

    @NotBlank(message = "السمية د المنتج ما خاصهاش تكون خاوية")
    private String name;

    @NotBlank(message = "le descrption is not fund")
    private String descrption;

    @NotBlank(message = "سمية الـ Category ضرورية")
    private String ProductName;
}