
package javaapplication5;

public class ShowPalindrome {
    
    Palindrome palindrome ;
    
    public ShowPalindrome(Palindrome p){
        this.palindrome = p;
    }
    public ShowPalindrome(){}
    
    public void ShowPalindrome() {
        
        if (palindrome.VerifieldIfPalindrome()==true) {
            System.out.println("Es un palindromo");
        }
        else{
            System.out.println("No es un palindromo");
        }
        long endTime = System.nanoTime();
        System.out.println(endTime);
  
    }
    
    public void ShowPalindrome(String datoEntrante){
        if (Palindrome.VerifieldIfPalindrome(datoEntrante)==true) {
            System.out.println("Es un palindromo");
        }
        else{
            System.out.println("No es un palindromo");
        }
        long endTime = System.nanoTime();
        System.out.println(endTime);
    }
    
}
