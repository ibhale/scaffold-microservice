package com.scaffold.microservice.repository;

import com.scaffold.microservice.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long>  {
}
