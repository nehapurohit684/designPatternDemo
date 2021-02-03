package designpattern.creational.abstractfactory;

public abstract class CreditCardFactory {

    public  static CreditCardFactory getCreditCardFactory(int creditScore){
    if(creditScore>650){
        return new VisaCreditCardFactory();
    }
    else return new MasterCreditCardFactory();
    }

    abstract CreditCard getCreditCard(CreditCardType type);

}
