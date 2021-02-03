package designpattern.behavioral.interpreter;

public class NumberExpression implements MathExpression{

    int number ;

    NumberExpression(int number){
        this.number = number;
    }

    @Override
    public int interpret() {
        return this.number;
    }
}
