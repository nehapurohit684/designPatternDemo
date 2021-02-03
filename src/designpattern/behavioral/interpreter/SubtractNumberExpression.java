package designpattern.behavioral.interpreter;

public class SubtractNumberExpression implements MathExpression{

    MathExpression m1 =null;
    MathExpression m2 =null;

    SubtractNumberExpression(MathExpression m1,MathExpression m2){
        this.m1 = m1;
        this.m2 = m2;
    }

    @Override
    public int interpret() {
        return m1.interpret()-m2.interpret();
    }
}