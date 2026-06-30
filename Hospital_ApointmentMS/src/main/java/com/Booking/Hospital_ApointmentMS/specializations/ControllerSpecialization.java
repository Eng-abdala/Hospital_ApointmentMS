package com.Booking.Hospital_ApointmentMS.specializations;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/specialization")
public class ControllerSpecialization {
    private final ServiceSpecializations service;

    @GetMapping
    public List<Specialization> getSpecialization(){
        return service.getALLSpecializations();
    }
    @GetMapping("/{id}")
    public Specialization getByid(@PathVariable Long id){
        return service.GetByID(id);
    }

    @PostMapping
    public void createSpecialization(@RequestBody Specialization spec){
        service.inserSpecializations(spec);
    }

    @DeleteMapping("/{id}")
    public void deleteSpecialization(@PathVariable Long id){
        service.deleteSpecializations(id);
    }

}
