package com.Final.Year.controllers;

import com.Final.Year.service.ClusterService;
import org.springframework.stereotype.Controller;

@Controller
public class ClusterController {

    private final ClusterService clusterService;

    public ClusterController(ClusterService clusterService) {
        this.clusterService = clusterService;
    }
}
