/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.MRibhiAlGhiffary.kuis1101.controller;

import com.MRibhiAlGhiffary.kuis1101.entity.Customer;
import com.MRibhiAlGhiffary.kuis1101.service.CustomerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Hendro Steven
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(method = RequestMethod.POST)
    public Customer insert(@RequestBody Customer customer) {
        return customerService.insert(customer);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Customer update(@RequestBody Customer customer) {
        return customerService.update(customer);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return customerService.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Customer getById(@PathVariable("id") Long id){
        return customerService.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Customer> getAll(){
        return customerService.getAll();
    }
}
