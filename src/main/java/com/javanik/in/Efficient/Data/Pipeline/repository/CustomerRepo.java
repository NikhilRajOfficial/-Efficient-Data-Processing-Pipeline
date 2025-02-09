package com.javanik.in.Efficient.Data.Pipeline.repository;

import com.javanik.in.Efficient.Data.Pipeline.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer,Integer> {
}
