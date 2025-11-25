package org.voiculescu.s2s.user.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.voiculescu.s2s.dto.ProductDto;

@FeignClient(name = "product-service", url = "${feign.client.product-service.url}")
public interface ProductServiceClient {

    @GetMapping("/products/{id}")
    ProductDto getProductById(@PathVariable("id") Long id);

}
