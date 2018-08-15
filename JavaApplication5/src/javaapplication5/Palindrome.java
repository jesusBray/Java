
package javaapplication5;

public class Palindrome {
    
   final private String datoEntrante;
   
   public Palindrome(String datoEntrante){
       this.datoEntrante=datoEntrante;
   }
   
   public  boolean  VerifieldIfPalindrome() {
       String resultado = "";
       for (int i = this.datoEntrante.length(); i > 0; i--) {
          resultado = resultado +this.datoEntrante.charAt((i-1));
       }
       if (this.datoEntrante.equals(resultado)) 
           return true;
       return false;
   }

    public final static boolean VerifieldIfPalindrome(String datoEntrante){
        String resultado ="";
        for (int i = datoEntrante.length() ; i > 0; i--) {
             resultado = resultado + (datoEntrante.charAt((i-1)));
        }
        if (datoEntrante.equals(resultado)) {
            return true;
        }
        return false;
    }
}
