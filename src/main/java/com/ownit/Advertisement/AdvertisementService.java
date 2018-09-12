package com.ownit.Advertisement;

import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import com.ownit.Transaction.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
/**
 * Created by Buddhima on 8/22/2018.
 */
@Service
public class AdvertisementService {

    @Autowired
    AdvertisementRepository daoImp;

    public Iterable<Advertisement> getAllAdvertisements() {

        return daoImp.findAll(PageRequest.of(0, 20));
    }

    public boolean createAdvertisement(Advertisement advertisement) {
        return daoImp.save(advertisement) == null ? false : true;
    }

    public String getSeller(String adid) {
        return (daoImp.findByAdid(adid).size() == 0) ? "Nan" : daoImp.findByAdid(adid).get(0).getSeller();
    }

    public Advertisement getAdd(String adid) {
        return (daoImp.findByAdid(adid).size() == 0) ? null : daoImp.findByAdid(adid).get(0);
    }

    public boolean changeQ(String value) {
        String[] CT = value.split(",");
        Advertisement temp;

        if (daoImp.findByAdid(CT[0]).size() == 0) {
            return false;
        } else {
            temp = daoImp.findByAdid(CT[0]).get(0);
            int x = new Integer(CT[1]);
            temp.setQuantityavailable(x);
        }

        return daoImp.save(temp) == null ? false : true;

    }
}
