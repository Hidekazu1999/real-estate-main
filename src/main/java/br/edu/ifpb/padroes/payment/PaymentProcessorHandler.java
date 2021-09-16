package br.edu.ifpb.padroes.payment;

import br.edu.ifpb.padroes.domain.Property;

public interface PaymentProcessorHandler {

    public abstract boolean process(Property property);

}
