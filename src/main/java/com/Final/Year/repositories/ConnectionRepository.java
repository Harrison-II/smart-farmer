package com.Final.Year.repositories;

import com.Final.Year.models.ConnectionModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConnectionRepository extends JpaRepository<ConnectionModel, Long> {
}
