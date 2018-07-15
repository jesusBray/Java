package Exsepciones;
import java.util.Scanner;
public class Excepcion1{
    private int num1,num2,result=0;
    public Excepcion1(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }
    Scanner entrada = new Scanner(System.in);
    public int getNum1(){
        try{
            System.out.println("Digite el primer numero");
            num1 = entrada.nextInt();
            System.out.println("Digite el segundo numero");
            num2 = entrada.nextInt();
            result = num1/num2;
        }catch(ArithmeticException  e){
            System.out.println("Error");
        }finally{
            System.out.println("Segiga con el proceso?");
        }

        return result;
    }
    
    
}