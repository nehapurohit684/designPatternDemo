package designpattern.behavioral.interpreter;

import java.util.Stack;
import java.util.StringTokenizer;

public class InterpreterDemo {

    public static void main(String[] args) {
        Expression exp = buildExpression();
        System.out.println(exp.interpret("Lion"));

        //MathExpression
        String evaluate = "2 * 8 + 9 * 10";
        StringTokenizer tokenizer = new StringTokenizer(evaluate);
        Stack<MathExpression> stack = new Stack<>();
        while (tokenizer.hasMoreElements()){
            String temp = tokenizer.nextToken();
            if(!MathParser.isOperator(temp)) {
                MathExpression numberExpression = new NumberExpression(Integer.parseInt(temp));
                stack.push(numberExpression);
            }else if(MathParser.isOperator(temp)){
                MathExpression ex1 = stack.pop();
                MathExpression ex2;
                if(stack.isEmpty()) {
                  ex2 = new NumberExpression(Integer.parseInt(tokenizer.nextToken()));
                }else {ex2 =stack.pop();}
                MathExpression resExpression = MathParser.getExpressionObject(ex1,ex2,temp);
                NumberExpression resNumber = new NumberExpression(resExpression.interpret());
                stack.push(resNumber);
            }
        }
        System.out.println(stack.pop().interpret());
    }

    private static Expression buildExpression() {
        Expression ex1 = new TerminalExpression("Lion");
        Expression ex2 = new TerminalExpression("Kushagra");

        return new OrExpression(ex1,ex2);
    }
}
