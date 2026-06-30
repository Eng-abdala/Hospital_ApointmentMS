package com.Booking.Hospital_ApointmentMS.Doctors;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DoctorService {

    private final DoctorRepository repository;

    public List<Doctor> getAllDoctors() {
        return repository.findAll();
    }
}