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

    public Doctor getDoctorById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Doctor not found"));
    }

    public Doctor saveDoctor(Doctor doctor) {
        return repository.save(doctor);
    }

    public Doctor updateDoctor(Long id, Doctor doctor) {

        Doctor existingDoctor = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Doctor not found"));

        existingDoctor.setUserId(doctor.getUserId());
        existingDoctor.setSpecializationId(doctor.getSpecializationId());
        existingDoctor.setFullName(doctor.getFullName());
        existingDoctor.setPhone(doctor.getPhone());
        existingDoctor.setConsultationFee(doctor.getConsultationFee());
        existingDoctor.setBio(doctor.getBio());

        return repository.save(existingDoctor);
    }

    public void deleteDoctor(Long id) {
        repository.deleteById(id);
    }
}