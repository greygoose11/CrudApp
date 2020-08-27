package web.service;

import web.Model.User;

import java.util.List;

public interface UserService {

    List<User> listAll();

    void save(User user);

    User get(long id);

    void delete(long id);
}
