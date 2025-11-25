package org.voiculescu.s2s.product.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.voiculescu.s2s.dto.UserDto;
import org.voiculescu.s2s.product.client.UserServiceClient;
import org.voiculescu.s2s.product.repository.ProductRepository;
import org.voiculescu.s2s.product.repository.entity.Product;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class ProductService {
    private final ProductRepository repo;
    private final UserServiceClient userServiceClient;

    public List<Product> all() {
        UserDto userById = userServiceClient.getUserById(1L);
        log.info("userById={}", userById);
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
