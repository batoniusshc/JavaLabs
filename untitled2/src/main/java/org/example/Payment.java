package org.example;

public class Payment {
    double amount;
    PaymentMethod method;

    double getAmount(){ return amount;}
    PaymentMethod getMethod(){ return method;}
    void setAmount( double a){ amount = a;}
    void setMethod(PaymentMethod m){method = m;}

    Payment(double a, PaymentMethod m) {
        setAmount(a);
        setMethod(m);
    }
}
