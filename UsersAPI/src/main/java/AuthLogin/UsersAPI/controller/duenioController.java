package AuthLogin.UsersAPI.controller;
import AuthLogin.UsersAPI.model.Duenio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import AuthLogin.UsersAPI.repository.duenioRepository;
import org.springframework.web.client.RestTemplate;


@RestController
@CrossOrigin(origins = "http://localhost:3000/")

public class duenioController {
    @Autowired
    duenioRepository duenioRepository;

    @Autowired
    RestTemplate restTemplate;

    @PostMapping(value = "/duenio/add")
    public Duenio addDuenio(@RequestBody Duenio duenio){
        System.out.println("AGREGO DUEÑO");
        return duenioRepository.save(duenio);
    }

}
