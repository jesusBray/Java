package com.examplesJava.example1;

public class ClaseAnidad{

    private int numer1 = 1;
    int numer2 = 2;

    class ClaseHija extends Thread{

        private int numer1 = 1;
        private int numer2 = 2;
        public void metodoClaseHija(){
            System.out.println("hola desde una clase anidada hija! \n"
                                +"Variable: clase pabre global: "+ClaseAnidad.this.numer1
                                +"Variable: clase pabre global: "+ClaseAnidad.this.numer2
                                +"\nVariable: clase anidad hija: "+this.numer1
                                +"Variable: clase anidad hija: "+this.numer2);
        }

    }

    public static class ClaseHijaEstatica{

        public void metodoClaseHijaEstatica(){
            System.out.println("hola desde una clase anidad hija estatica!");
        }
    }

    public void metodo1(){
        class num1{
            public int uno=1;
        }
        num1 n = new num1();
        int resipiente = n.uno;
        System.out.println(resipiente);
    }

}
