package org.testing.Service;

import org.testing.entity.User;
import org.testing.repo.UserRepository;

public class UserService {

    private UserRepository userRepository;

    // Constructor Injection
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findUser(int id) {
        return userRepository.findById(id);
    }

    public void saveUser(String name) {
        User user = new User(0, name); // assigning default ID
        userRepository.save(user);
    }
}

