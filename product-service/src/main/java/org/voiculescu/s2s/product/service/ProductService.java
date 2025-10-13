package org.voiculescu.s2s.product.service;

import org.springframework.stereotype.Service;
import org.voiculescu.s2s.product.repository.entity.Product;
import org.voiculescu.s2s.product.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository repo;

    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    public List<Product> all() {
        return repo.findAll();
    }

    public Product get(Long id) {
        return repo.findById(id).orElseThrow();
    }

    public Product save(Product p) {
        return repo.save(p);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
