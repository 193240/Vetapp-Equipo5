package AuthLogin.UsersAPI.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import AuthLogin.UsersAPI.model.User;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;


public interface userRepository extends CrudRepository<User, Integer> {
    User findByIdUser(int idUser);


    /*@Query("SELECT user FROM User user WHERE user.idUsuario =:id")
    @Transactional(readOnly = true)
    User findUserId(@Param("id") Integer id);*/
}
