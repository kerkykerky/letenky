package com.example.letenky.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String destination;

    private String placeOfDeparture;

    private String placeOfArrival;

    private LocalDate departureDate;

    private LocalDate arrivalDate;

    @ManyToOne
    private UserDetails userDetails;
}
