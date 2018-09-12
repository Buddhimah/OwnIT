package com.ownit.Carrier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Buddhima on 8/22/2018.
 */
@Controller
@RequestMapping("carrier")
@ResponseBody
public class CarrierController {
    @Autowired
    private CarrierService carrierService;
    @RequestMapping(method= RequestMethod.POST,consumes= MediaType.APPLICATION_JSON_VALUE)
    public  boolean addCarrier(@RequestBody Carrier carrier){

        return  carrierService.createCarrier(carrier);



    }
    @RequestMapping(value="{CarrierID}",method= RequestMethod.GET)
    public  int getRating(@PathVariable String CarrierID){

        return  carrierService.getRating(CarrierID);



    }
    @RequestMapping(value="status/{CarrierID}",method= RequestMethod.PUT)
    public  boolean endTransaction(@PathVariable String CarrierID){

        return  carrierService.changeStatus(CarrierID);



    }
    @RequestMapping(value="telephone/{CarrierID}",method= RequestMethod.GET)
    public  String getTelephone(@PathVariable String CarrierID){

        return  carrierService.getTelephone(CarrierID);



    }
    @RequestMapping(value="list",method= RequestMethod.GET)
    public  List<Carrier> getAll(){

        Iterable<Carrier> result = carrierService.getAllCarrier();
        List<Carrier> qe = new ArrayList<Carrier>();
        for(Carrier i : result){
            qe.add(i);
        }


        return qe;


    }
    @RequestMapping(value="alert/{CarrierIDANDTransactionID}",method= RequestMethod.PUT)
    public  boolean alert(@PathVariable String CarrierIDANDTransactionID){

        return  carrierService.addalert( CarrierIDANDTransactionID);



    }
    @RequestMapping(value="alert/{CarrierID}",method= RequestMethod.GET)
    public  String getAlert(@PathVariable String CarrierID){

        return  carrierService.getAlert(CarrierID);



    }

}
