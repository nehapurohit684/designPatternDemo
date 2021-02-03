package designpattern.creational.builder;

public class BuilderDemo {

    public static void main(String[] args) {
        ButtonDescription.Builder builder= new ButtonDescription.Builder();
        builder.expression("exp").objectId("id");

        ButtonDescription description = new ButtonDescription(builder);
        System.out.println(description.getExpression());
    }
}
