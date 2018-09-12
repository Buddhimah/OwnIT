package com.ownit.Transaction;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Buddhima on 8/22/2018.
 */

public interface TransactionRepository extends CrudRepository<Transaction,Integer> {
    Transaction save(Transaction transaction);
    List<Transaction> findByTransactionID(String TransactionID);
}
