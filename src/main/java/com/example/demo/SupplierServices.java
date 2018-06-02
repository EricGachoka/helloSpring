package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SupplierServices {
    private static List<Supplier> supplierList = new ArrayList<>();

    static {
        for (int i = 0; i < 10; i++) {
            supplierList.add(new Supplier(i,"supplier "+i, (byte) (20+i)));
        }
    }

    public List<Supplier> getAllSuppliers() {
        return supplierList;
    }
}
