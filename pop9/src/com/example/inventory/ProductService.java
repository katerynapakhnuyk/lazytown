package com.example.inventory;

import com.example.inventory.model.Product;
import com.example.inventory.repository.ProductRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository repository = new ProductRepository();

    public List<Product> getAllProducts() {
        return repository.getAllProducts();
    }

    public void addProduct(Product product) {
        List<Product> products = repository.getAllProducts();
        products.add(product);
        repository.saveProducts(products);
    }

    public Optional<Product> getProductById(Long id) {
        return repository.getAllProducts().stream().filter(p -> p.getId().equals(id)).findFirst();
    }

    public void updateProduct(Long id, Product updatedProduct) {
        List<Product> products = repository.getAllProducts();
        products.forEach(product -> {
            if (product.getId().equals(id)) {
                product.setName(updatedProduct.getName());
                product.setQuantity(updatedProduct.getQuantity());
                product.setPrice(updatedProduct.getPrice());
            }
        });
        repository.saveProducts(products);
    }

    public void deleteProduct(Long id) {
        List<Product> products = repository.getAllProducts();
        products.removeIf(product -> product.getId().equals(id));
        repository.saveProducts(products);
    }
}
