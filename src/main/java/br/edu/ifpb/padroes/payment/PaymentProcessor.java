package br.edu.ifpb.padroes.payment;

import br.edu.ifpb.padroes.domain.Property;

public abstract class PaymentProcessor implements PaymentProcessorHandler {

    private PaymentProcessor next;

    public PaymentProcessor linkWith(PaymentProcessor next){
        this.next = next;
        return next;
    }

    public abstract boolean process(Property property);

    protected boolean checkNext(Property property){
        if(next == null){
            return true;
        }
        return next.process(property);
    }
}
