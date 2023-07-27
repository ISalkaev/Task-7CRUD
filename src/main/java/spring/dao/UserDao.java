package spring.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import spring.model.User;

import java.util.List;

@Repository
@Transactional
public interface UserDao {
    List<User> getAllUsers();

    void save(User user);

    User getUser(Long id);

    void delete(Long id);
}
