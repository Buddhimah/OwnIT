package com.ownit.Carrier;

import com.ownit.Customer.CustomerRepository;
import com.ownit.Transaction.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by Buddhima on 8/22/2018.
 */
@Service
public class CarrierService {
    @Autowired
    CarrierRepository daoImp;

    public boolean createCarrier(Carrier carrier) {

        return  daoImp.save(carrier) ==null ? false : true;
    }

    public int getRating(String carrierID) {
        return  (daoImp. findByCarrierID(carrierID).size()==0)? -1 :daoImp. findByCarrierID(carrierID).get(0).getRating() ;
    }

    public boolean changeStatus(String carrierID) {
        Carrier temp;
        if(daoImp.findByCarrierID(carrierID).size() ==0 ){
            return false;
        }else{
            temp=daoImp.findByCarrierID(carrierID).get(0);
            if(temp.getStatus()==1){
                temp.setStatus(0);
            }else{
                temp.setStatus(1);
            }

            return daoImp.save(temp) ==null ? false : true;
        }

    }

    public Iterable<Carrier> getAllCarrier() {


        return this.daoImp.findAll(PageRequest.of(0, 20));//first result , max results
    }

    public String getTelephone(String carrierID) {
        return  (daoImp. findByCarrierID(carrierID).size()==0)? "Nan":daoImp. findByCarrierID(carrierID).get(0).getTelephone() ;
    }

    public boolean addalert(String carrierIDANDTransactionID) {
        String[] CT = carrierIDANDTransactionID.split(",");
        Carrier temp;

        if(daoImp.findByCarrierID(CT[0]).size() ==0 ){
            return false;
        }else{
            temp=daoImp.findByCarrierID(CT[0]).get(0);
            if(temp.getStatus()==1){
                return false;
            }else{
                temp.setAlert(CT[1]);
            }

            return daoImp.save(temp) ==null ? false : true;
        }
    }

    public String getAlert(String carrierID) {
        return  (daoImp. findByCarrierID(carrierID).size()==0)? "Nan":daoImp. findByCarrierID(carrierID).get(0).getAlert() ;
    }
}
