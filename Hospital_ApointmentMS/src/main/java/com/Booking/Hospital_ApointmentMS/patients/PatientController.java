package com.Booking.Hospital_ApointmentMS.Patients;

import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/patients")
@RequiredArgsConstructor
public class PatientController {

    private final PatientService service;

    @GetMapping
    public List<Patient> GetAllPatient(){
        return service.GetAllPatient();
    }

}
