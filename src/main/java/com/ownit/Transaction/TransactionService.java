package com.ownit.Transaction;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Buddhima on 8/22/2018.
 */
@Service
public class TransactionService {
    @Autowired
    TransactionRepository daoImp;
    public boolean createTransaction(Transaction transaction) {
        return  daoImp.save(transaction) ==null ? false : true;
    }
    public boolean endTransaction(String transactionID) {
        Transaction temp;
        if(daoImp.findByTransactionID(transactionID).size() ==0 ){
            return false;
        }else{
            temp=daoImp.findByTransactionID(transactionID).get(0);
            temp.setActive(0);
            return daoImp.save(temp) ==null ? false : true;
        }

    }

    public int monitorTransaction(String transactionID) {
        if(daoImp.findByTransactionID(transactionID).size() ==0 ){
            return 0;
        }else{
            return daoImp.findByTransactionID(transactionID).get(0).isActive();

        }
    }

    public Transaction getTransaction(String transactionID) {
        if(daoImp.findByTransactionID(transactionID).size() ==0 ){
            return null;
        }else{
            return daoImp.findByTransactionID(transactionID).get(0);

        }
    }
}
