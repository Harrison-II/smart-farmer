package com.Final.Year.repositories;

import com.Final.Year.models.ClusterModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClusterRepository extends JpaRepository<ClusterModel, Long> {
}
