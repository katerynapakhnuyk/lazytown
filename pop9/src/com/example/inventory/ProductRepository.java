package com.example.inventory;

import com.example.inventory.model.Product;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    private static final String FILE_PATH = "products.json";
    private final ObjectMapper objectMapper = new ObjectMapper();

    public List<Product> getAllProducts() {
        try {
            File file = new File(FILE_PATH);
            if (!file.exists()) return new ArrayList<>();
            return List.of(objectMapper.readValue(file, Product[].class));
        } catch (IOException e) {
            throw new RuntimeException("Error reading products file", e);
        }
    }

    public void saveProducts(List<Product> products) {
        try {
            objectMapper.writeValue(new File(FILE_PATH), products);
        } catch (IOException e) {
            throw new RuntimeException("Error writing products file", e);
        }
    }
}
