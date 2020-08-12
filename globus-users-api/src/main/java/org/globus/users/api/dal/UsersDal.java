package org.globus.users.api.dal;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersDal extends JpaRepository<User, Long> {
}
