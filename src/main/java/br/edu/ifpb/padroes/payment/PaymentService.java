package br.edu.ifpb.padroes.payment;

import br.edu.ifpb.padroes.domain.Apartment;
import br.edu.ifpb.padroes.domain.Bungalow;
import br.edu.ifpb.padroes.domain.Property;
import br.edu.ifpb.padroes.domain.Tenement;
import br.edu.ifpb.padroes.payment.processors.GovernmentTaxesPayment;
import br.edu.ifpb.padroes.payment.processors.PropertyPayment;
import br.edu.ifpb.padroes.payment.processors.RealEstatePayment;

public class PaymentService {

    public void pay(Property sale, Bungalow bungalow, Tenement tenament) {
        // TODO - implementar Chain of Responsibility para que ordem dos métodos de pagamento seja dinâmica (definida em tempo de execução)

        PaymentProcessor paymentProcessor = new PropertyPayment();
        paymentProcessor.linkWith(new GovernmentTaxesPayment())
                        .linkWith(new PropertyPayment())
                        .linkWith(new RealEstatePayment());

        paymentProcessor.process(sale);

    }
}
