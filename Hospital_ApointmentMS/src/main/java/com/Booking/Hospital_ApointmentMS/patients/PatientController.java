package com.Booking.Hospital_ApointmentMS.Patients;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/patients")
public class PatientController {

    private final PatientService service;

    @PostMapping
    public void SavePatient(@RequestBody Patient patient) {
        service.addPatient(patient);
    }

    @GetMapping
    public List<Patient> GetAllPatient() {
        return service.getAllPatients();
    }

    @GetMapping("/{id}")
    public Patient getById(@PathVariable Long id) {
        return service.getPatientById(id);
    }

    @PutMapping("/{id}")
    public Patient updatePatient(@PathVariable Long id, @RequestBody Patient patient) {
        return service.updatePatient(id, patient);
    }

    @DeleteMapping("/{id}")
    public void deletePatient(@PathVariable Long id) {
        service.deletePatient(id);
    }
}
