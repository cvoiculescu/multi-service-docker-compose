package org.voiculescu.s2s.user.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.voiculescu.s2s.user.repository.RoleRepository;
import org.voiculescu.s2s.user.repository.UserRepository;
import org.voiculescu.s2s.user.repository.entity.Role;
import org.voiculescu.s2s.user.repository.entity.User;

import java.util.List;

@Service
@Slf4j
@Transactional
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    @Override
    public User saveUser(User u) {
        log.info("Saving user {}", u.getUsername());
        return userRepository.save(u);
    }

    @Override
    public Role saveRole(Role r) {
        log.info("Saving role {}", r.getName());
        return roleRepository.save(r);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
        log.info("Adding role {} to user {}", roleName, username);
        User user = userRepository.findByUsername(username);
        Role role = roleRepository.findByName(roleName);
        user.getRoles().add(role);
    }

    @Override
    public User getUser(String username) {
        log.info("Fetching user by name {}", username);
        return userRepository.findByUsername(username);
    }

    @Override
    public User getUser(Long id) {
        log.info("Fetching user by id {}", id);
        return userRepository.getReferenceById(id);
    }

    @Override
    public void deleteUser(Long id) {
        log.info("Deleting user by id {}", id);
        userRepository.deleteById(id);
    }

    @Override
    public List<User> getUsers() {
        log.info("Fetching all users");
        return userRepository.findAll();
    }
}
