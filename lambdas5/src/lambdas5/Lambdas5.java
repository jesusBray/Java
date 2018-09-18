
package lambdas5;

import javax.swing.JOptionPane;

public class Lambdas5 {

    private static int  numeroArbitrario=0;
    
    public int suma(int num1,int num2){
        
        operacion1 op  = new operacion1() {
            @Override
            public int operacion(int num1, int num2) {
                return num1+num2;
            }
        };
        return numeroArbitrario = op.operacion(num1, num2);
    }
    
    
    public static void main(String[] args) {
        Lambdas5 lm = new Lambdas5();
        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "digite un primer numero! "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "digite un segundo numero! "));
        JOptionPane.showMessageDialog(null, "La suma es: "+lm.suma(num1, num2));
    }
    
    
}
