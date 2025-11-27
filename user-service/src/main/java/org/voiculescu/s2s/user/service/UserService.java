package org.voiculescu.s2s.user.service;

import org.voiculescu.s2s.user.repository.entity.Role;
import org.voiculescu.s2s.user.repository.entity.User;

import java.util.List;

public interface UserService {
    User saveUser(User u);

    Role saveRole(Role r);
    void deleteUser(Long id);
    void addRoleToUser(String username, String roleName);

    User getUser(String username);
    User getUser(Long id);

    List<User> getUsers();
}
