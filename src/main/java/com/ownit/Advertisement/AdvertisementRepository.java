package com.ownit.Advertisement;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Buddhima on 8/22/2018.
 */
public interface AdvertisementRepository extends CrudRepository<Advertisement,Integer> {
    Advertisement save(Advertisement advertisement);
    Page<Advertisement> findAll(Pageable pageable);
    List<Advertisement> findByAdid(String adid);


}
