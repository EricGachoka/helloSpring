package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {
    private SupplierServices supplierServices;

    @Autowired
    public ApiController(SupplierServices supplierServices){
        this.supplierServices = supplierServices;
    }

    @GetMapping("/suppliers")
    public List<Supplier> getAllSuppliers() {
        return this.supplierServices.getAllSuppliers();
    }
}
