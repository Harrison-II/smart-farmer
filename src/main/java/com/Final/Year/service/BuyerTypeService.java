package com.Final.Year.service;

import com.Final.Year.models.BuyerTypeModel;
import com.Final.Year.repositories.BuyerTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuyerTypeService {

    private final BuyerTypeRepository buyerTypeRepository;

    public BuyerTypeService(BuyerTypeRepository buyerTypeRepository) {
        this.buyerTypeRepository = buyerTypeRepository;
    }

    public BuyerTypeModel saveBuyerType(BuyerTypeModel buyerType) {
        return buyerTypeRepository.save(buyerType);
    }

    public BuyerTypeModel getBuyerType(long id) {
        return buyerTypeRepository.findById(id).get();
    }

    public List<BuyerTypeModel> getAllBuyerTypes() {
        return buyerTypeRepository.findAll();
    }

    public BuyerTypeModel updateBuyerType(BuyerTypeModel buyerType) {
        return buyerTypeRepository.save(buyerType);
    }

    public void deleteBuyerTypeById(long id) {
        buyerTypeRepository.deleteById(id);
    }

    public void deleteAllBuyerTypes() {
        buyerTypeRepository.deleteAll();
    }
}
