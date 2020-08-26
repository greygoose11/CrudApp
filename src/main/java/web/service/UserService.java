package web.service;

import web.Model.User;

import java.util.List;

public interface UserService {
    //    public void addUser(User user);
//    public void updateUser(User user);
//    public void removeUser(long id);
//    public User getUserById(long id);
//    public List<User> listUsers();
    List<User> listAll();

    void save(User user);

    User get(long id);

    void delete(long id);
}
