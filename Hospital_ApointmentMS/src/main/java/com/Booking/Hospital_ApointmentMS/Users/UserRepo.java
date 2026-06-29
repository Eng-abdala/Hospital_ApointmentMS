package com.Booking.Hospital_ApointmentMS.Users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UserRepo extends JpaRepository<User,Long> {
    boolean existsByUsername(String username);

    boolean existsByEmail(String email);

}
