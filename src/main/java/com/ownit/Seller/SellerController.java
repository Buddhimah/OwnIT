package com.ownit.Seller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Buddhima on 8/22/2018.
 */
@Controller
@RequestMapping("seller")
@ResponseBody
public class SellerController {
    @Autowired
    private SellerService sellerService;
    @RequestMapping(method= RequestMethod.POST,consumes= MediaType.APPLICATION_JSON_VALUE)
    public  boolean addSeller(@RequestBody Seller seller){


        return  sellerService.createSeller(seller);



    }
    @RequestMapping(value="alert/{SellerIDANDTransactionID}",method= RequestMethod.PUT)
    public  boolean alert(@PathVariable String SellerIDANDTransactionID){

        return  sellerService.addalert( SellerIDANDTransactionID);



    }
    @RequestMapping(value="alert/{SellerID}",method= RequestMethod.GET)
    public  String getAlert(@PathVariable String SellerID){

        return  sellerService.getAlert(SellerID);



    }
    @RequestMapping(value="telephone/{SellerID}",method= RequestMethod.GET)
    public  String getTelephone(@PathVariable String SellerID){

        return   sellerService.getTelephone(SellerID);



    }
    @RequestMapping(value="address/{SellerID}",method= RequestMethod.GET)
    public  String getAddress(@PathVariable String SellerID){

        return   sellerService.getAddress(SellerID);



    }
}
