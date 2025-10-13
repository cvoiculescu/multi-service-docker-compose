package org.voiculescu.service1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
    private final UserService svc;

    public UserController(UserService svc) {
        this.svc = svc;
    }

    @GetMapping(path = {"", "/"})
    public List<User> getAll() {
        log.info("Controller: Get all users");
        return svc.all();
    }

    @GetMapping("/{id}")
    public User get(@PathVariable Long id) {
        return svc.get(id);
    }

    @PostMapping(path = {"", "/"})
    public User create(@RequestBody User u) {
        return svc.save(u);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        svc.delete(id);
    }
}