package com.Final.Year.service;

import com.Final.Year.models.BuyerModel;
import com.Final.Year.repositories.BuyerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuyerService {

    private final BuyerRepository buyerRepository;

    public BuyerService(BuyerRepository buyerRepository) {
        this.buyerRepository = buyerRepository;
    }

    public BuyerModel saveBuyer(BuyerModel buyer) {
        return buyerRepository.save(buyer);
    }

    public BuyerModel getBuyer(long id) {
        return buyerRepository.findById(id).get();
    }

    public List<BuyerModel> getAllBuyers() {
        return buyerRepository.findAll();
    }

    public BuyerModel updateBuyer(BuyerModel buyer) {
        return buyerRepository.save(buyer);
    }

    public void deleteBuyerById(long id) {
        buyerRepository.deleteById(id);
    }

//    public void setBuyerType(BuyerModel buyer, Long id) {
//        BuyerType buyerType = buyerTypeRepository.findById(id).get();
//        buyer.setBuyerType(buyerType);
//    }

    public void deleteAllBuyers() {
        buyerRepository.deleteAll();
    }
}
