package com.scaffold.microservice.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Data
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long customerId;

    @NotBlank(message = "Name is mandatory")
    private String customerName;

    @NotBlank(message = "Email is mandatory")
    private String email;
}
