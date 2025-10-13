package org.voiculescu.s2s.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.voiculescu.s2s.product.repository.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
