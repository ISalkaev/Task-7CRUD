package spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.dao.UserDao;
import spring.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Transactional(readOnly = true)
    public List<User> getAllUsers(){
        return userDao.getAllUsers();
    }

    @Override
    @Transactional
    public void save(User user){
        userDao.save(user);
    }

    @Override
    @Transactional
    public User getUser(Long id){
        return userDao.getUser(id);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        userDao.delete(id);
    }
}
