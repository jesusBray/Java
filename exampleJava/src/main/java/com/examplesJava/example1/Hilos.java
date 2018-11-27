package com.examplesJava.example1;

public class Hilos extends Thread{

    @Override
    public void run(){
        System.out.println("Esto son una muesras de los hilos");
        for (int i = 0; i <= 10; ++i) {
            try {
                Thread.sleep(3000);
                System.out.println(": "+i+" "+getName());
            } catch (Exception e) {
                System.out.println("Error en la class thread "+e.getMessage());
            }
        }
        System.out.println("Fin de la secuencia");
    }

}