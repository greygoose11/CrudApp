package web.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import web.Model.User;

import java.util.List;
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
//    public void addUser(User user);
//    public void updateUser(User user);
//    public void removeUser(long id);
//    public User getUserById(long id);
//    public List<User> listUsers();
}
