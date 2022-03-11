package AuthLogin.UsersAPI.controller;

import AuthLogin.UsersAPI.user.UserDTO;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import AuthLogin.UsersAPI.model.User;
import AuthLogin.UsersAPI.repository.userRepository;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@RestController
@CrossOrigin(origins = "http://localhost:3000/")
public class userController {
    @Autowired
    userRepository userRepository;

    @Autowired
    RestTemplate restTemplate;

    @GetMapping(value="/user/{idUsuario}")
    public User getUser(@PathVariable("idUsuario") int idUsuario){
        return userRepository.findByIdUsuario(idUsuario);
    }

    @GetMapping(value="/user/{user}")
    public User getUser(@PathVariable("user") String user){
        return userRepository.findByUser(user);
    }

    @PostMapping(value = "/user/add")
    public User addUser(@RequestBody User user){
        //System.out.println(user.toString());
        return userRepository.save(user);
    }

    @GetMapping(value = "/listUser")
    public List<User> getUser(){
        return userRepository.findAll();
    }

    @PostMapping("/user")
    public UserDTO login(@RequestParam("user") String username, @RequestParam("password") String pwd) {
        UserDTO user = new UserDTO();
       User usuario = userRepository.findByUser(username);
        if(usuario== null){

        }else{
            if (pwd==usuario.getPassword()){
                String token = getJWTToken(username);
                user.setUser(username);
                user.setToken(token);
            }
        }
        return user;
    }

    private String getJWTToken(String username) {
        String secretKey = "secreto";
        List<GrantedAuthority> grantedAuthorities = AuthorityUtils
                .commaSeparatedStringToAuthorityList("ROLE_USER");

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
