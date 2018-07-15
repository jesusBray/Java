package JFramesEjemplo;
import javax.swing.*;
public class Marco1 extends JFrame{
    public Marco1(){
        setBounds(250,250,250,250);
        //Este metodo ase que no se customisar la ventana esta bloqueada
        // con un tamanio determinado
        //setResizable(false);
        //
        //setExtendedState(Frame.MAXIMIZED_BOTH);
        setTitle("Mi ventana");
    }

}