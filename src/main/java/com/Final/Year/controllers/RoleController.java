package com.Final.Year.controllers;

import com.Final.Year.service.RoleService;
import org.springframework.stereotype.Controller;

@Controller
public class RoleController {

    private final RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }
}
