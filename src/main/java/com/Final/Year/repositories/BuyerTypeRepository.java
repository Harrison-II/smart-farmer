package com.Final.Year.repositories;

import com.Final.Year.models.BuyerTypeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuyerTypeRepository extends JpaRepository<BuyerTypeModel, Long> {
}
