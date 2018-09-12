package com.ownit.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Buddhima on 8/18/2018.
 */
public interface CustomerRepository extends CrudRepository<Customer,Integer> {
    Customer save(Customer customer);
    List<Customer> findByCustomerID(String CustomerID);
}
