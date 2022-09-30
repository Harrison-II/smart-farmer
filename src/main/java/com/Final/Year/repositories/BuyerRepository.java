package com.Final.Year.repositories;

import com.Final.Year.models.BuyerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuyerRepository extends JpaRepository<BuyerModel, Long> {
}
