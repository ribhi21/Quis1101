/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.MRibhiAlGhiffary.kuis1101.service;

import com.MRibhiAlGhiffary.kuis1101.entity.Customer;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.MRibhiAlGhiffary.kuis1101.repo.CustomerRepo;

/**
 *
 * @author Hendro Steven
 */
@Service("customerService")
@Transactional
public class CustomerService {

    @Autowired
    private CustomerRepo repo;

    public Customer insert(Customer customer) {
        return repo.save(customer);
    }
    
    public Customer update(Customer customer) {
        return repo.save(customer);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public Customer getById(Long id){
        return repo.findOne(id);
    }
    
    public List<Customer> getAll(){
        return repo.findAllCustomer();
    }
}
