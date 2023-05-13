package com.backend.controller;

import com.backend.model.FabricationEntity;
import com.backend.repository.FabricationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/fabrications")
public class FabricationController {
    @Autowired
    private FabricationRepository fabricationRepository;

    @GetMapping("/")
    public List<FabricationEntity> getAllUsers() {
        return fabricationRepository.findAll();
    }

    @PostMapping("/")
    public FabricationEntity saveSingleFabrication(@RequestBody FabricationEntity entity) {
        FabricationEntity fabricationEntity = new FabricationEntity();
        fabricationEntity.setItemId(entity.getItemId());
        fabricationEntity.setItem(entity.getItem());
        fabricationEntity.setInDate(entity.getInDate());
        fabricationEntity.setOutDate(entity.getOutDate());
        fabricationEntity.setQuantity(entity.getQuantity());
        fabricationEntity.setRawMaterial(entity.getRawMaterial());
        return fabricationRepository.save(fabricationEntity);
    }

    @PostMapping("/saveAll")
    public List<FabricationEntity> saveAllFabrication(@RequestBody List<FabricationEntity> fabricationEntityList) {
        return fabricationRepository.saveAll(fabricationEntityList);
    }

}
