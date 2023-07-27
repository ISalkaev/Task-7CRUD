package spring.service;

import spring.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void save(User user);

    User getUser(Long id);

    void delete(Long id);
}
