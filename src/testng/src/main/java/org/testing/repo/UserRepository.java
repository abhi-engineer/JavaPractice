package org.testing.repo;

import org.testing.entity.User;

public interface UserRepository {
    User findById(int id);
    void save(User user);
}

