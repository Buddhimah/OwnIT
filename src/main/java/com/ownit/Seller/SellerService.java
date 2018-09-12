package com.ownit.Seller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Buddhima on 8/22/2018.
 */
@Service
public class SellerService {
    @Autowired
    SellerRepository daoImp;
    public boolean createSeller(Seller seller) {
        return  daoImp.save(seller) ==null ? false : true;
    }

    public boolean addalert(String sellerIDANDTransactionID) {
        String[] ST =sellerIDANDTransactionID.split(",");
        Seller temp;
        //ST[1] is Transaction ID

        if(daoImp.findBySellerID(ST[0]).size() ==0 ){
            return false;
        }else{
            temp=daoImp.findBySellerID(ST[0]).get(0);
            temp.setAlert(ST[1]);
            return daoImp.save(temp) ==null ? false : true;
        }
    }

    public String getAlert(String sellerID) {
        return  (daoImp. findBySellerID(sellerID).size()==0)? "Nan":daoImp. findBySellerID(sellerID).get(0).getAlert();
    }

    public String getTelephone(String sellerID) {
        return  (daoImp. findBySellerID(sellerID).size()==0)? "Nan":daoImp. findBySellerID(sellerID).get(0).getTelephone();
    }

    public String getAddress(String sellerID) {
        return  (daoImp. findBySellerID(sellerID).size()==0)? "Nan":daoImp. findBySellerID(sellerID).get(0).getAddress();
    }
}
