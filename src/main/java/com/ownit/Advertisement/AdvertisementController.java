package com.ownit.Advertisement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Buddhima on 8/22/2018.
 */
@Controller
@RequestMapping("advertisement")
@ResponseBody
public class AdvertisementController {
    @Autowired
    AdvertisementService advertisementService;

    @RequestMapping(method= RequestMethod.POST,consumes= MediaType.APPLICATION_JSON_VALUE)
    public  boolean addCarrier(@RequestBody Advertisement advertisement){

        return  advertisementService.createAdvertisement(advertisement);



    }

    @RequestMapping(value="list",method= RequestMethod.GET)
    public List<Advertisement> getAll(){

        Iterable<Advertisement> result = advertisementService.getAllAdvertisements();

        if(result != null) {
            List<Advertisement> qe = new ArrayList<Advertisement>();
            for (Advertisement i : result) {
                qe.add(i);
            }

            return qe;
        }else{
            return null;
        }


    }
    @RequestMapping(value="seller/{Adid}",method= RequestMethod.GET)
    public  String getSeller(@PathVariable String Adid){

        return  advertisementService.getSeller(Adid);



    }

    @RequestMapping(value="{Adid}",method= RequestMethod.GET)
    public  Advertisement getAdd(@PathVariable String Adid){

        return  advertisementService.getAdd(Adid);



    }
    @RequestMapping(value="quentity/{IDvalue}",method= RequestMethod.PUT)
    public  boolean changeQ(@PathVariable String IDvalue){

        return  advertisementService.changeQ( IDvalue);



    }
}
