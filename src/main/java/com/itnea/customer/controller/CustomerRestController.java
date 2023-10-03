package com.itnea.customer.controller;

import com.itnea.customer.entities.Customer;
import com.itnea.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerRestController {
    @Autowired
    CustomerRepository customerRepository;

    @GetMapping()
    public List<Customer> finAll(){
        return customerRepository.findAll();
    }

    @GetMapping("/{id}")
    public Customer get(@PathVariable String id){
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> put(@PathVariable String id, @RequestBody Customer input){
        return null;
    }

    @PostMapping()
    public ResponseEntity<?> post(@RequestBody Customer input){
        Customer save = customerRepository.save(input);
        return ResponseEntity.ok(save);
    }
}
