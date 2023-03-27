package com.msrhpayroll.payrollrh.services;

import com.msrhpayroll.payrollrh.entities.Payment;
import com.msrhpayroll.payrollrh.entities.Worker;
import com.msrhpayroll.payrollrh.feignclients.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private WorkerFeignClient workerFeignClient;

    public Payment getPayment(long workerId, int days){
        Worker worker = workerFeignClient.findById(workerId).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
    
}
