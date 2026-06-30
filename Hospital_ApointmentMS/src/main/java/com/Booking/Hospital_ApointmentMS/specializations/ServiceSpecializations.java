package com.Booking.Hospital_ApointmentMS.specializations;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ServiceSpecializations {
    private final RepoSpecializations repo;

    public List<Specialization> getALLSpecializations(){
        return repo.findAll();
    }

    public Specialization GetByID(Long id){
        return repo.findById(id)
                .orElseThrow(()-> new RuntimeException("specialization not found"));
    }

    public void inserSpecializations(Specialization spec){
        repo.save(spec);
    }

    public void deleteSpecializations(Long id){
        repo.deleteById(id);

    }



}
