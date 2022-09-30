package com.Final.Year.repositories;

import com.Final.Year.models.FarmerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FarmerRepository extends JpaRepository<FarmerModel, Long> {
}
