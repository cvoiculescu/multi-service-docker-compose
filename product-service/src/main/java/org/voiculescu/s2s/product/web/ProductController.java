package org.voiculescu.s2s.product.web;

import org.springframework.web.bind.annotation.*;
import org.voiculescu.s2s.product.repository.entity.Product;
import org.voiculescu.s2s.product.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService svc;

    public ProductController(ProductService svc) {
        this.svc = svc;
    }

    @GetMapping
    public List<Product> getAll() {
        return svc.all();
    }

    @GetMapping("/{id}")
    public Product get(@PathVariable Long id) {
        return svc.get(id);
    }

    @PostMapping
    public Product create(@RequestBody Product p) {
        return svc.save(p);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        svc.delete(id);
    }
}
