package com.ownit.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Buddhima on 8/18/2018.
 */

@Controller
@RequestMapping("customer")
@ResponseBody
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @RequestMapping(method= RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE)
    public  boolean addCustomer(@RequestBody Customer customer){

       return  customerService.createCustomer(customer);



    }
    @RequestMapping(value="{CustomerID}",method= RequestMethod.GET)
    public  int getRating(@PathVariable String CustomerID){

        return  customerService.getRating(CustomerID);



    }
    @RequestMapping(value="address/{CustomerID}",method= RequestMethod.GET)
    public  String getAddress(@PathVariable String CustomerID){

        return  customerService.getAddress(CustomerID);



    }
    @RequestMapping(value="telephone/{CustomerID}",method= RequestMethod.GET)
    public  String getTelephone(@PathVariable String CustomerID){

        return  customerService.getTelephone(CustomerID);



    }

}
