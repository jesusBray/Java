
package example.palindromo;
import java.util.Scanner;

public class ExamplePalindromo {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un palindromo");
        String datoEntrante = entrada.next(),datoSaliente = "";
        
        for (int i = datoEntrante.length()-1; i >= 0; i--) {
            datoSaliente+= datoEntrante.charAt(i);
            
        }
        if (!datoEntrante.equals(datoSaliente)) {
            System.out.println("No es un palindromo");
        }
        else{
            System.out.println("si es un palindromo ");
        }
    }
    
}
