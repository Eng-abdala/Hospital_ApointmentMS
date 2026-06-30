package com.Booking.Hospital_ApointmentMS.Users;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepo repository;

    public List<User> getALLUsers(){
        return repository.findAll();
    }

    public User getUserByid(Long id){
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    public void SaveUser(User user){
        repository.save(user);

    }

    public void deleteUser(long id){
        repository.deleteById(id);
    }
}
