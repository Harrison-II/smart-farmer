package com.Final.Year.repositories;

import com.Final.Year.models.ProductCategoryModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCategoryRepository extends JpaRepository<ProductCategoryModel, Long> {
}
