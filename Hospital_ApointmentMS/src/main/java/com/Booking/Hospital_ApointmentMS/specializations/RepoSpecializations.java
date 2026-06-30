package com.Booking.Hospital_ApointmentMS.specializations;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoSpecializations extends JpaRepository<Specialization,Long> {


}
