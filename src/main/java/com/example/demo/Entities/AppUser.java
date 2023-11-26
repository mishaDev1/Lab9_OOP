package com.example.demo.Entities;

import java.time.LocalDate;
import java.time.Period;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AppUser {
    @Id
    private long id;
    private LocalDate dob;
    @Column(unique = true)
    private String email;
    @Transient
    public Period getAge() {
        return Period.between(dob, LocalDate.now());
    }
}
