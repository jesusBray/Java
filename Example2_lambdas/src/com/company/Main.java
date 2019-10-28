package com.company;

public class Main {

    private Operation operation;
    public static void main(String[] args) {
        Main m = new Main();
        m.EjecuteMethodStatic().Print();
    }

    public static void MethodStatic(){
        System.out.println("test text!!");
    }

    public Operation EjecuteMethodStatic(){
        this.operation = Main::MethodStatic;
        return operation;
    }
}
