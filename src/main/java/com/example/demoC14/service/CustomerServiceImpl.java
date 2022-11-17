package com.example.demoC14.service;

import com.example.demoC14.domain.Customer;
import com.example.demoC14.exception.CustomerNotFoundException;
import com.example.demoC14.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    CustomerRepository customerRepository;
    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer addUser(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer findByCustomerNameAndPassword(String customerName, String password) throws CustomerNotFoundException {
        Customer customer = customerRepository.findByCustomerNameAndPassword(customerName,password);
        if(customer ==null){
            throw new CustomerNotFoundException();
        }
        return customer;
    }

    @Override
    public List<Customer> getAllUser() {
        return (List<Customer>) customerRepository.findAll();
    }
}
