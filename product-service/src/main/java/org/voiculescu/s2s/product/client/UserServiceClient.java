package org.voiculescu.s2s.product.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.voiculescu.s2s.dto.UserDto;

@FeignClient(name = "user-service", url = "${feign.client.user-service.url}")
public interface UserServiceClient {

    @GetMapping("/users/{id}")
    UserDto getUserById(@PathVariable("id") Long id);

}
