package com.ownit.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Buddhima on 8/18/2018.
 */
@Service
public class CustomerService {
    @Autowired
    CustomerRepository daoImp;


    public boolean createCustomer(Customer customer){


        return  daoImp.save(customer) ==null ? false : true;
    }


    public int getRating(String customerID) {
        return  (daoImp.findByCustomerID(customerID).size()==0)? -1 :daoImp.findByCustomerID(customerID).get(0).getRating() ;
    }

    public String getAddress(String customerID) {
        return  (daoImp.findByCustomerID(customerID).size()==0)? "Does not exist" :daoImp.findByCustomerID(customerID).get(0).getAddress() ;
    }

    public String getTelephone(String customerID) {
        return  (daoImp.findByCustomerID(customerID).size()==0)? "Does not exist" :daoImp.findByCustomerID(customerID).get(0).getTelephone() ;
    }
}
