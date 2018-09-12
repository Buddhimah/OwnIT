package com.ownit.Carrier;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Buddhima on 8/22/2018.
 */
public interface CarrierRepository extends CrudRepository<Carrier,Integer> {
    Carrier save(Carrier carrier);
    Page<Carrier> findAll(Pageable pageable);

    List<Carrier> findByCarrierID(String carrierID);
}
