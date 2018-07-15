package DistanciaDosPuntos;

import javax.swing.JOptionPane;

public class Asignar2{

    private double y1, y2;

    public Asignar2(double y1, double y2){
        this.y1 = y1;
        this.y2 = y2;
    }

    public void setY1(double y1){
        if(this.y1 == y1){
            this.y1 = y1;
        }
        else{
            JOptionPane.showMessageDialog(null, "Error, solo numeros!");
        }
    }
    public void setY2(double y2) {
        if(this.y2 == y2) {
            this.y2 = y2;
        }

        else {

            JOptionPane.showMessageDialog(null, "Error, Solo numeros!");
        }
    }
}