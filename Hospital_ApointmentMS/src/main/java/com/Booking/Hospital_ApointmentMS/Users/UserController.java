package com.Booking.Hospital_ApointmentMS.Users;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Locale;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/users")
public class UserController {
    private final UserService service;



    @PostMapping
    public void Saveuser(@RequestBody User user){
        service.SaveUser(user);
    }
    @GetMapping
    public List<User> getusers(){
        return service.getALLUsers();
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable Long id){
        return service.getUserByid(id);

    }

    @DeleteMapping
    public void deleteUser(@PathVariable Long id){
        service.deleteUser(id);
    }
}
