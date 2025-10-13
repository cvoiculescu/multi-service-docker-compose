package org.voiculescu.s2s.user.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.voiculescu.s2s.user.repository.entity.User;
import org.voiculescu.s2s.user.repository.UserRepository;

import java.util.List;

@Service
@Slf4j
public class UserService {
    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public List<User> all() {
        log.info("Service: Get all users");
        return repo.findAll();
    }

    public User get(Long id) {
        return repo.findById(id).orElseThrow();
    }

    public User save(User u) {
        return repo.save(u);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
