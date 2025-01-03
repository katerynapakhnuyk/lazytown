package com.example.inventory;

import com.example.inventory.model.Product;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FileStorageService {
    private final String FILE_PATH = "products.json";
    private List<Product> products = new ArrayList<>();
    private final ObjectMapper objectMapper = new ObjectMapper();

    @PostConstruct
    public void init() {
        loadProducts();
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Product addProduct(Product product) {
        // Генерація нового ID
        Long newId = products.stream()
                .mapToLong(Product::getId)
                .max()
                .orElse(0L) + 1;
        product.setId(newId);
        products.add(product);
        saveProducts();
        return product;
    }

    public void deleteProduct(Long id) {
        products.removeIf(p -> p.getId().equals(id));
        saveProducts();
    }

    public Optional<Product> getProductById(Long id) {
        return products.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();
    }

    private void loadProducts() {
        try {
            File file = new File(FILE_PATH);
            if (file.exists()) {
                products = objectMapper.readValue(file, new TypeReference<List<Product>>() {});
            } else {
                products = new ArrayList<>();
            }
        } catch (IOException e) {
            e.printStackTrace();
            products = new ArrayList<>();
        }
    }

    private void saveProducts() {
        try {
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(FILE_PATH), products);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
