package com.exrcice.tp1.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.exrcice.tp1.modul.Category;

@Repository
public interface RepositoryC extends  JpaRepository<Category, Long> {
    
    
}
