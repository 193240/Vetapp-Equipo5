package AuthLogin.UsersAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import AuthLogin.UsersAPI.model.User;
import AuthLogin.UsersAPI.model.Duenio;
import AuthLogin.UsersAPI.repository.userRepository;



@RestController
@CrossOrigin(origins = "http://localhost:3000/")
public class userController {
    @Autowired
    userRepository userRepository;

   /* @Autowired
    RestTemplate restTemplate;


    @GetMapping(value = "/duenioConMascotas/{idDuenio}")
    public DuenioMascota getDuenioConMascotas(@PathVariable("idDuenio") int idDuenio){
        Duenio duenio =  duenioRepository.findByIdDuenio(idDuenio);
        DuenioMascota duenioMascota= null;
        if (duenio != null){
            duenioMascota = new DuenioMascota(duenio.getIdDuenio(), duenio.getNombre(), duenio.getTelefono(), duenio.getDireccion());
            Mascota[] mascotas  =restTemplate.getForObject("http://localhost:9998/listByIdDuenio/"+duenioMascota.getIdDuenio(), Mascota[].class);
            duenioMascota.setMascotas(mascotas);
        }
        return duenioMascota;
    }*/

    @GetMapping(value="/user/{idUsuario}")
    public User getUser(@PathVariable("idUsuario") int idUsuario){
        return userRepository.findByIdUser(idUsuario);
    }


    @PostMapping(value = "/user/add")
    public User addUser(@RequestBody User user){
        return userRepository.save(user);
    }


}
