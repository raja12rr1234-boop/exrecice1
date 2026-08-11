package com.exrcice.tp1.modul;

import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Category")
public class Category {
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "descrption")
    private String description;
   
   @OneToMany(mappedBy="category")
    private List<Product> products ;
}
