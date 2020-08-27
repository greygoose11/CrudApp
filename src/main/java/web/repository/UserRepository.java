package web.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import web.Model.User;

import java.util.List;
@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
