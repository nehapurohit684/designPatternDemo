package designpattern.behavioral.interpreter;

public class MathParser {

    public static boolean isOperator(String symbol){
        return (symbol.equals("+")|symbol.equals("-")|symbol.equals("*"));
    }

    public static MathExpression getExpressionObject(MathExpression firstExpression,MathExpression secondExpression,String symbol){
        if(symbol.equals("+"))
            return new AddNumberExpression(firstExpression,secondExpression);
        else if(symbol.equals("-"))
            return new SubtractNumberExpression(firstExpression,secondExpression);
        else
            return new MultiplyNumberExpression(firstExpression,secondExpression);
    }
}
