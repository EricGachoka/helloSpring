package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/suppliers")
public class SupplierController {
    private SupplierServices supplierServices;

    @Autowired
    public SupplierController(SupplierServices supplierServices) {
        this.supplierServices = supplierServices;
    }

    @GetMapping
    public String getAllSuppliers(Model model) {
        model.addAttribute("suppliers", this.supplierServices.getAllSuppliers());
        return "suppliers";
    }
}
