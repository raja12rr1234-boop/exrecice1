package com.exrcice.tp1.service.impl;

import com.exrcice.tp1.dto.mapper.MapperP;
import com.exrcice.tp1.dto.response.ResponseP;
import com.exrcice.tp1.modul.Product;
import com.exrcice.tp1.repository.RepositoryP;
import com.exrcice.tp1.respository.RepositoryP;
import com.exrcice.tp1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
@Autowired
    private final ResponseP responseP ;
    private final  MapperP mapperP ;
    private final com.exrcice.tp1.respository.RepositoryP repositoryP ;


    @Override
    public List<ResponseP> findAll() {
        return repositoryP.findAll()
                .stream()
                .map(mapperP::toResponseP)
                .toList();
    }

    public List<ResponseP> findbyid(String id) {
        Product product = repositoryP.findById(id)
                .orElseThrow(()-> new RuntimeException(" id is not fund"+id));

                 return mapperP.toResponseP(product);
    }
}