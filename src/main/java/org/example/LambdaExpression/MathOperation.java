package org.example.LambdaExpression;

public class MathOperation {
    public static void main(String[] args) {
       Calculator add = (a,b)->a+b;
       int result = add.operate(10,20);
       System.out.println(result);
    }

}
