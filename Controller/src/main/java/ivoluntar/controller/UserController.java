package ivoluntar.controller;

import ivoluntar.ServiceImpl;
import ivoluntar.Users.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    @Autowired
    private ServiceImpl service;

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User user) {
        boolean loggedIn = service.login(user);
        if (loggedIn) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }

    @RequestMapping("/logout")
    public void logout(@RequestBody User user) {
        service.logout(user);
    }

    @RequestMapping("/register")
    public void register(@RequestBody User user) {
        service.register(user);
    }

    @RequestMapping("/update")
    public void update(@RequestBody User user) {
        service.update(user);
    }

    @RequestMapping("/delete")
    public void delete(@RequestBody User user) {
        service.delete(user);
    }



}
