package GraficosJava;
import javax.swing.*;
import java.awt.*;
public class PanelText extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawString("Bienvenido a su panel de control general",100,100);
        
    }
}