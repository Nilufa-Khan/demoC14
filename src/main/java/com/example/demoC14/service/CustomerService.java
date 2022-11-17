package com.example.demoC14.service;

import com.example.demoC14.domain.Customer;
import com.example.demoC14.exception.CustomerNotFoundException;

import java.util.List;

public interface CustomerService {
    public Customer addUser(Customer customer);
    public Customer findByCustomerNameAndPassword(String customerName, String password) throws CustomerNotFoundException;
    List<Customer> getAllUser();
}
