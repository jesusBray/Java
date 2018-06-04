package GraficosJava;
import javax.swing.*;
public class Marco extends JFrame{
    PanelText pt = new PanelText();
    public Marco(){
        setVisible(true);
        setSize(600,400);
        setLocation(250,250);
        add(pt);
    }
}