package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import web.Model.User;
import web.repository.UserRepository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

//    public void setRepository(UserRepository repository) {
//        this.repository = repository;
//    }
    @Autowired
    private UserRepository repository;

    @Override
    public List<User> listAll() {
        return (List<User>) repository.findAll();
    }

    @Override
    public void save(User user) {
        repository.save(user);
    }

    @Override
    public User get(long id) {
        return repository.findById(id).get();
    }

    @Override
    public void delete(long id) {
        repository.deleteById(id);
    }

//    @Override
//    @Transactional
//    public void addUser(User user) {
//        this.repository.addUser(user);
//    }
//
//    @Override
//    @Transactional
//    public void updateUser(User user) {
//        this.repository.updateUser(user);
//    }
//
//    @Override
//    @org.springframework.transaction.annotation.Transactional
//    public void removeUser(long id) {
//        this.repository.removeUser(id);
//    }
//
//    @Override
//    @org.springframework.transaction.annotation.Transactional
//    public User getUserById(long id) {
//        return this.repository.getUserById(id);
//    }
//
//    @Override
//    public List<User> listUsers() {
//        return this.repository.listUsers();
//    }
//
//    public UserServiceImpl() {
//    }


//    @Autowired
//    public UserServiceImpl(UserRepository repository) {
//        super();
//        this.repository = repository;
//    }
//
//    @Override
//    public List<User> getAllUsers() {
//        List list = new ArrayList();
//        repository.findAll().forEach(e -> list.add(e));
//        return list;
//    }
//
//    @Override
//    public User getUserById(Long id) {
//        User user = repository.findById(id).get();
//        return user;
//    }
//
//    @Override
//    public boolean saveUser(User user) {
//        try {
//            repository.save(user);
//            return true;
//        }catch(Exception ex) {
//            return false;
//        }
//    }
//
//    @Override
//    public boolean deleteUserById(Long id) {
//        try {
//            repository.deleteById(id);
//            return true;
//        }catch(Exception ex) {
//            return false;
//        }
//    }
}
