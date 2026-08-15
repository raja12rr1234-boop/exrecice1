package com.exrcice.tp1.dto.mapper;

import org.springframework.stereotype.Component;

import com.exrcice.tp1.dto.request.Prorequest;
import com.exrcice.tp1.dto.response.ResponseP;
import com.exrcice.tp1.modul.Product;

@Component
public class MapperP {
    

    public ResponseP toResponseP(Product product){

        if(product == null){
            return null;
        }
        String categoryname = (product.getCategory() != null)? product.getCategory().getName():null;
    return new ResponseP(
                product.getId(),
                product.getName(),
                product.getPrice(),
                product.getStouck(),
                categoryname
              
        );
    }

    public Product toEntity(Prorequest request) {
        if (request == null) return null;

        Product product = new Product();
        product.setName(request.getName());
        product.setPrice(request.getPrice());
        product.setStouck(request.getStouck());
        
        return product;
    }
}
