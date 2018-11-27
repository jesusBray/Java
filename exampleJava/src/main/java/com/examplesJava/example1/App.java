package com.examplesJava.example1;

public class App
{

    public static void main( String[] args )
    {

        Hilos a = new Hilos();
        Hilos b = new Hilos();

        a.start();
        b.start();
        
        ClaseAnidad c = new ClaseAnidad();
        ClaseAnidad.ClaseHija ca = c.new ClaseHija();
        ca.metodoClaseHija();
        
        ClaseAnidad.ClaseHijaEstatica ce = new ClaseAnidad.ClaseHijaEstatica();
        ce.metodoClaseHijaEstatica();
        
        
    }
}
