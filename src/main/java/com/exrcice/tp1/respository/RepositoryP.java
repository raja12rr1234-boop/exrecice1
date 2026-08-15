package com.exrcice.tp1.respository;
import com.exrcice.tp1.modul.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List; // ⚠️ لاحظ: java.util.List ماشي org.hibernate.mapping.List

@Repository
public interface RepositoryP extends JpaRepository<Product, Long> {

    @Query("SELECT p FROM Product p WHERE p.price >= :minorite")
    List<Product> findProductsBy(@Param("minorite") Double minorite);

}