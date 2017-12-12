package com.MRibhiAlGhiffary.kuis1101.repo;

import com.MRibhiAlGhiffary.kuis1101.entity.Customer;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Hendro Steven
 */
public interface CustomerRepo extends CrudRepository<Customer, Long> {

    @Query("select c from Customer c")
    public List<Customer> findAllCustomer();
}
