package br.edu.ifpb.padroes.payment.processors;

import br.edu.ifpb.padroes.domain.Property;
import br.edu.ifpb.padroes.payment.PaymentProcessor;

public class RealEstatePayment extends PaymentProcessor {

    @Override
    public boolean process(Property property) {
        double realStateComission = property.getPrice()*0.10;
        System.out.println(String.format("Pay %f for real state", realStateComission));
        return checkNext(property);
    }
}

