package org.voiculescu.s2s.product.repository.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Entity
@Getter
@Setter
@Accessors(chain = true)
@Table(name = "products", indexes = {
        @Index(name = "idx_name", columnList = "name"),
        @Index(name = "idx_price", columnList = "price")
})
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prod_seq_gen")
    @SequenceGenerator(name = "prod_seq_gen", sequenceName = "products_id_seq", allocationSize = 1)
    private Long id;
    private String name;
    private double price;
}
