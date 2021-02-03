package designpattern.creational.builder;

public class ButtonDescription {

    String objectName;
    String objectId;
    String expression;

    ButtonDescription(Builder builder){
        this.objectName =builder.objectName;
        this.objectId =builder.objectId;
        this.expression =builder.expression;
    }

    public static class Builder{
        String objectName;
        String objectId;
        String expression;

        public Builder objectName(String objectName){
            this.objectName = objectName;
            return this;
        }

        public Builder objectId(String objectId){
            this.objectId = objectId;
            return this;
        }

        public Builder expression(String expression){
            this.expression = expression;
            return this;
        }

    }

    public String getObjectName() {
        return objectName;
    }

    public String getObjectId() {
        return objectId;
    }

    public String getExpression() {
        return expression;
    }
}
