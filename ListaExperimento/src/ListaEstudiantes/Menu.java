package ListaEstudiantes;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Menu {
    String option;
    Scanner entrada = new Scanner(System.in);
    UserManager userManager = new  UserManager(new ConectionSql("root", "root"));
    FilterUserData filtre = new FilterUserData();
    UserVerification verifiedInformation;
    //ConectionSql conected = new ConectionSql("root","root");
    IGListas iu;
    private String Input(String a){
        System.out.println(a);
        return entrada.next();
    }
    
    private String MessageOP(String mensaje){
        return JOptionPane.showInputDialog(mensaje);
    }
    
    private int MessageOp(String mensaje){
        return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
    }
    
    public void Start(){
        boolean exit = true;
        do{
            option = MessageOP(" 1:Adicionar usuario \n 2:Eliminar usuario \n 3:Mostrar \n 4:Buscar usuario \n 5:Salir");
            if (filtre.ValidationDataNumber(option)) {            
                switch(Integer.parseInt(option)) {
                    case 1: userManager.AddUser(MessageOP("Digite el id para el usuario"),MessageOP("Digite el cargo para el usuario"),MessageOP("Digite el nombre para el usuario"),MessageOP("Digite el apellido para el usuario"),MessageOp("Digite el salario"));
                        break;
                    case 2: userManager.RemoveUser(MessageOP("Digite el id a eliminar"));
                        break;
                    case 3: userManager.ShowUsers();
                        break;
                    case 4: userManager.ShowSearchUser(MessageOP("Digite el apellido a buscar"));
                        break;
                    case 5: exit = false;
                        System.out.println("www.Yesvill.com");
                        break;
                    default : System.out.println("Digito no valido intente denuevo");
                }
            }
        }while(exit);
    }
}