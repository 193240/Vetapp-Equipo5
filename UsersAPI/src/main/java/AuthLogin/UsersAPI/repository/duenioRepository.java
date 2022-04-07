package AuthLogin.UsersAPI.repository;
import AuthLogin.UsersAPI.model.Duenio;
import org.springframework.data.repository.CrudRepository;
import AuthLogin.UsersAPI.model.User;
import java.util.List;

public interface duenioRepository extends CrudRepository<Duenio, Integer> {
    //Duenio findByIdDuenio(int idDuenio);
    Duenio save(Duenio duenio);
    List<Duenio> findAll();
    Duenio findByIdUsuario(int idUser);
}