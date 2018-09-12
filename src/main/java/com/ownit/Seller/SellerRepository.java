package com.ownit.Seller;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Buddhima on 8/22/2018.
 */
public interface SellerRepository extends CrudRepository<Seller,Integer> {
    Seller save(Seller seller);

    List<Seller> findBySellerID(String s);
}
