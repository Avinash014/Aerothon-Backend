package com.backend.repository;

import com.backend.model.FabricationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FabricationRepository extends JpaRepository<FabricationEntity, Long> {
}
