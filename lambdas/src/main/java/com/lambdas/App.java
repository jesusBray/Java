package com.lambdas;

public class App {
    operacionesF op;
    operaciones2F op2;

    public double practica1(double b1,double b2) {
        op = () -> { return (b1+b2) /2;
        };
        return op.promedio();
    }

    public double practica1(){
        op2 = (a,b) -> (a+b) / 2;
        return op2.promedio(2,1);
    }

    public static void main( String[] args ) {
        App a = new App();
        System.out.println(a.practica1(10,10));

        System.out.println(a.practica1());
    }
}
