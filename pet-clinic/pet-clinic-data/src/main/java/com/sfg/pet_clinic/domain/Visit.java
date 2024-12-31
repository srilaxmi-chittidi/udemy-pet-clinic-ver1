package com.sfg.pet_clinic.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="visits")
public class Visit extends BaseEntity{

    @Column(name = "date")
    private LocalDate date;
    @Column(name="description")
    private String description;
    @ManyToOne
    private Pet pet;

}
