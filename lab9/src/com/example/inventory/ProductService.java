package com.example.inventory;

import com.example.inventory.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final FileStorageService fileStorageService;

    @Autowired
    public ProductService(FileStorageService fileStorageService) {
        this.fileStorageService = fileStorageService;
    }

    public List<Product> getAllProducts() {
        return fileStorageService.getAllProducts();
    }

    public Product addProduct(Product product) {
        return fileStorageService.addProduct(product);
    }

    public void deleteProduct(Long id) {
        fileStorageService.deleteProduct(id);
    }

    public Optional<Product> getProductById(Long id) {
        return fileStorageService.getProductById(id);
    }
}
