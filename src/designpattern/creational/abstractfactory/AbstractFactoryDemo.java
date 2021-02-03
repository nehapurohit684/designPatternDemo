package designpattern.creational.abstractfactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        CreditCardFactory factory1 = CreditCardFactory.getCreditCardFactory(750);
        CreditCard card1  = factory1.getCreditCard(CreditCardType.GOLD);
        System.out.println(card1);
        factory1 = CreditCardFactory.getCreditCardFactory(600);
        CreditCard card2  = factory1.getCreditCard(CreditCardType.GOLD);
        System.out.println(card2);
    }
}
