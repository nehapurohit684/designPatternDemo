package designpattern.creational.abstractfactory;

public class MasterCreditCardFactory extends CreditCardFactory {


    @Override
    CreditCard getCreditCard(CreditCardType type) {
        switch (type){
            case GOLD: return new GoldMasterCard();
            case PLATINUM: return new PlatinumMasterCard();
            default:return null;
        }
    }
}
