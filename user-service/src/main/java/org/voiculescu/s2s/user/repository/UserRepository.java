package org.voiculescu.s2s.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.voiculescu.s2s.user.repository.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
