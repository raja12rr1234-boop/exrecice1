package com.exrcice.tp1.dto.mapper;

import org.springframework.stereotype.Component;

import com.exrcice.tp1.dto.request.caterequest;
import com.exrcice.tp1.dto.response.ResponseC;
import com.exrcice.tp1.modul.Category;

@Component
public class MapperC {

    public ResponseC toResponseC(Category category) {
        if (category == null) {
            return null;
        }
        return new ResponseC(
                category.getId(),
                category.getName(),
                category.getDescription());
    }

    public Category toEntyte(caterequest request) {
        if (request == null) {
            return null;
        }
        Category category = new Category();
        category.setId(request.getId());
        category.setName(request.getName());
        category.setDescription(request.getDescrption());
        return category;
    }
}
