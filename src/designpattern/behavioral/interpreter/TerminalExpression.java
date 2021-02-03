package designpattern.behavioral.interpreter;

import java.util.StringTokenizer;

public class TerminalExpression implements Expression{

    String data;

    TerminalExpression(String data){
        this.data =data;
    }

    @Override
    public boolean interpret(String context) {
        StringTokenizer tokenizer = new StringTokenizer(context);
        while (tokenizer.hasMoreElements()){
            if (tokenizer.nextToken().equals(context))return true;
        }
        return false;
    }
}
