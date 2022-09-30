package com.Final.Year.service;

import com.Final.Year.models.ClusterModel;
import com.Final.Year.repositories.ClusterRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClusterService {

    private final ClusterRepository clusterRepository;

    public ClusterService(ClusterRepository clusterRepository) {
        this.clusterRepository = clusterRepository;
    }

    public ClusterModel saveCluster(ClusterModel cluster) {
        return clusterRepository.save(cluster);
    }

    public ClusterModel getCluster(long id) {
        return clusterRepository.findById(id).get();
    }

    public List<ClusterModel> getAllClusters() {
        return clusterRepository.findAll();
    }

    public ClusterModel updateCluster(ClusterModel cluster) {
        return clusterRepository.save(cluster);
    }

    public void deleteClusterById(long id) {
        clusterRepository.deleteById(id);
    }

    public void deleteAllClusters() {
        clusterRepository.deleteAll();
    }
}
