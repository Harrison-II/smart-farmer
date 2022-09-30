package com.Final.Year.controllers;

import com.Final.Year.models.ConnectionModel;
import com.Final.Year.service.ConnectionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ConnectionController {

    private final ConnectionService connectionService;

    public ConnectionController(ConnectionService connectionService) {
        this.connectionService = connectionService;
    }


    @GetMapping("/connections")
    public String getMyConnections(Model model) {
        model.addAttribute("connection", connectionService.getAllConnections());
        return "connections";
    }

    @GetMapping("/connections/new")
    public String newConnection(Model model) {
        ConnectionModel connection = new ConnectionModel();
        model.addAttribute("connection", connection);

        return "connections";
    }

    @PostMapping("/connections")
    public String saveConnection(@ModelAttribute("connection") ConnectionModel connection) {
        connectionService.saveConnection(connection);
        return "redirect:/connections";
    }

    @GetMapping("/connections/delete/{id}")
    public String deleteConnection(@PathVariable long id) {
        connectionService.deleteConnectionById(id);

        return "redirect:/connections";
    }
}
