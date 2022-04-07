package AuthLogin.UsersAPI.controller;

import AuthLogin.UsersAPI.user.UserDTO;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import AuthLogin.UsersAPI.model.User;
import AuthLogin.UsersAPI.repository.userRepository;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;


@RestController
@CrossOrigin(origins = "http://localhost:3000/")

public class userController {
    @Autowired
    userRepository userRepository;

    @Autowired
    RestTemplate restTemplate;

    @GetMapping(value="/user/findId/{idUsuario}")
    public User getUser(@PathVariable("idUsuario") int idUsuario){
        System.out.println("entro");
        return userRepository.findByIdUsuario(idUsuario);
    }

    @GetMapping(value="/user/{user}")
    public User getUsuario(@PathVariable("user") String user){
        System.out.println("entro busqueda");
        return userRepository.findByUser(user);
    }

    @PostMapping(value = "/user/add")
    public User addUser(@RequestBody User user){
        System.out.println("AGREGO USUARIO");
        return userRepository.save(user);
    }

    @GetMapping(value = "/listUser")
    public List<User> getUser(){
        System.out.println("LISTA DE USUARIOS");
        return userRepository.findAll();
    }

    @Transactional
    @PostMapping(value = "/user/delete/{idUsuario}")
    public int deleteUser(@PathVariable("idUsuario") int idUsuario){
        System.out.println("ELIMINO USUARIO");
        userRepository.deleteById(idUsuario);
        return idUsuario;
    }

    @PostMapping(value = "/user/edit")
    public User editUser(@RequestBody User user){
        System.out.println("EDITO USUARIO");
        return userRepository.save(user);
    }

    @PostMapping("/user/login")
    public UserDTO login(@RequestParam("user") String username, @RequestParam("password") String pwd) {
        UserDTO user = new UserDTO();
        User usuario = userRepository.findByUser(username); //obtenemos el usuario por el user
        if (username.equals(usuario.getUser()) && pwd.equals(usuario.getPassword())){
            String token = getJWTToken(username,usuario.getTipoU());
            user.setUser(username);
            user.setToken(token);
            user.setTipo(usuario.getTipoU());
        }
        System.out.println(user.toString());
        return user;
    }



    private String getJWTToken(String username,String rol) {
        String secretKey = "secreto";
        List<GrantedAuthority> grantedAuthorities = AuthorityUtils
                .commaSeparatedStringToAuthorityList(rol);
        String token = Jwts
                .builder()
                .setId("petJWT")
                .setSubject(username)
                .claim("authorities",
                        grantedAuthorities.stream()
                                .map(GrantedAuthority::getAuthority)
                                .collect(Collectors.toList()))
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 6000000))
                .signWith(SignatureAlgorithm.HS512,
                        secretKey.getBytes()).compact();
        return "Bearer " + token;
    }
}
