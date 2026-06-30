package com.Booking.Hospital_ApointmentMS.Patients;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientService {
    private final PatientRepository repository;

    public List<Patient> GetAllPatient(){

        return repository.findAll();
    }

}
