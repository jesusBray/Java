package com.proyect4.example4;

public class App extends Thread
{
    public App (String nombre){
        super(nombre);
    }
    
    public void run(){
        System.out.println("empezar con el hilo 1! "+getName());
        for (int i = 1; i <= 10; i++) {
            if (getName().equalsIgnoreCase("hilo uno")) {
                System.out.println(i+getName()+"--->");
            }
            else{
                System.out.println(i+getName()+"<---");
            }

            try {
                Thread.sleep(2000);
            } catch (Exception e ) {
                System.out.println("error en Thead.sleep");
            }
        }
        

        
        System.out.println("fin hilo! "+getName());
    }
    public static void main( String[] args )
    {
        App a = new App("hilo uno");
        App b = new App("hilo dos");
        a.start();
        b.start();

        System.out.println("fin del proyecto!");
    }
}
