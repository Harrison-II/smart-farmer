package com.Final.Year.service;

import com.Final.Year.models.FarmerModel;
import com.Final.Year.repositories.FarmerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FarmerService {

    private final FarmerRepository farmerRepository;

    public FarmerService(FarmerRepository farmerRepository) {
        this.farmerRepository = farmerRepository;
    }

    public FarmerModel saveFarmer(FarmerModel farmer) {
        return farmerRepository.save(farmer);
    }

    public FarmerModel getFarmer(long id) {
        return farmerRepository.findById(id).get();
    }

    public List<FarmerModel> getAllFarmers() {
        return farmerRepository.findAll();
    }

    public FarmerModel updateFarmer(FarmerModel farmer) {
        return farmerRepository.save(farmer);
    }

    public void deleteFarmerById(long id) {
        farmerRepository.deleteById(id);
    }

    public void deleteAllFarmers() {
        farmerRepository.deleteAll();
    }
}
