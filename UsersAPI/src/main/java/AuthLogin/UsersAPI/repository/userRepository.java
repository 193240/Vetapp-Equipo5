package AuthLogin.UsersAPI.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import AuthLogin.UsersAPI.model.User;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.List;

public interface userRepository extends CrudRepository<User, Integer> {
    User findByIdUsuario(int idUser);
    User save(User user);
    List<User> findAll();
    User findByUser(String user);
}
