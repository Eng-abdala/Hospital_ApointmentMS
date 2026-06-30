package com.Booking.Hospital_ApointmentMS.patients;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientService {

    private final PatientRepository repository;

    // Get All Patients
    public List<Patient> getAllPatients() {
        return repository.findAll();
    }

    public List<Patient> GetAllPatient() {
        return getAllPatients();
    }

    // Get Patient By Id
    public Patient getPatientById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Patient not found"));
    }

    // Insert Patient
    public void addPatient(Patient patient) {
        repository.save(patient);
    }

    // Update Patient
    public Patient updatePatient(Long id, Patient patient) {

        Patient existingPatient = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Patient not found"));

        existingPatient.setUserId(patient.getUserId());
        existingPatient.setFullName(patient.getFullName());
        existingPatient.setDateOfBirth(patient.getDateOfBirth());
        existingPatient.setGender(patient.getGender());
        existingPatient.setPhone(patient.getPhone());
        existingPatient.setAddress(patient.getAddress());

        return repository.save(existingPatient);
    }

    // Delete Patient
    public void deletePatient(Long id) {
        repository.deleteById(id);
    }
}
