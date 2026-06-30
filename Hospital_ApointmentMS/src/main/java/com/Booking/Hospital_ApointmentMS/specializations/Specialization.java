package com.Booking.Hospital_ApointmentMS.specializations;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "specializations")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Specialization {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false, length = 50)
    private String name;

    @Column (length = 100)
    private String description;

}
