package designpattern.creational.abstractfactory;

public class VisaCreditCardFactory extends CreditCardFactory {

    @Override
    CreditCard getCreditCard(CreditCardType type) {
        switch (type){
            case GOLD: return new GoldVisaCard();
            case PLATINUM: return new PlatinumVisaCard();
            default:return null;
        }
    }
}
