package com.ownit.Transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Buddhima on 8/22/2018.
 */
@Controller
@RequestMapping("transaction")
@ResponseBody
public class TransactionController {
    @Autowired
    private TransactionService transactionService;
    @RequestMapping(method= RequestMethod.POST,consumes= MediaType.APPLICATION_JSON_VALUE)
    public  boolean addTransaction(@RequestBody Transaction transaction){

        return  transactionService.createTransaction(transaction);



    }
    @RequestMapping(value="{TransactionID}",method= RequestMethod.PUT)
    public  boolean endTransaction(@PathVariable String TransactionID){

        return  transactionService.endTransaction(TransactionID);



    }
    @RequestMapping(value="monitor/{TransactionID}",method= RequestMethod.GET)
    public  int monitorTransaction(@PathVariable String TransactionID){

        return  transactionService.monitorTransaction(TransactionID);



    }
    @RequestMapping(value="{TransactionID}",method= RequestMethod.GET)
    public  Transaction getTransaction(@PathVariable String TransactionID){

        return  transactionService.getTransaction(TransactionID);



    }

}
