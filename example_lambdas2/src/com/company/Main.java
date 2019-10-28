package com.company;

public class Main {
    double a,b;

    public Main (int value1,int value2){
       this.a = value1;
       this.b = value2;
    }

    public static void main(String[] args) {

        new Main(3,2).Print((value1, value2) -> value1+value2);
    }

    public void Print(Operation<Double> op) {
        System.out.println(op.calcular(this.a,this.b));
    }
}
