package ListaEstudiantes;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Menu {
    Scanner entrada = new Scanner(System.in);
    UserManager userManager = new  UserManager(new ConectionSql("root", "root"));
    FilterUserData filtre = new FilterUserData();
    UserVerification verifiedInformation;
    ConectionSql conected = new ConectionSql("root","root");
    
    private String Input(String a){
        System.out.println(a);
        return entrada.next();
    }

    public void Start(){
        boolean exit = true;
        String option;
        
        do{
            System.out.println(" 1:Adicionar usuario \n 2:Eliminar usuario \n 3:Mostrar \n 4:Buscar usuario \n 5:Salir");
            option = entrada.next();
            if (filtre.ValidationDataNumber(option)) {            
                switch(Integer.parseInt(option)) {
                    case 1: userManager.AddUser(Input("Digite el id para el usuario"),Input("Digite el cargo para el usuario"),Input("Digite el nombre para el usuario"),Input("Digite el apellido para el usuario"),Integer.parseInt(Input("Digite el salario")));
                        break;
                    case 2: verifiedInformation.UserDeleted(Input("Digite el id a eliminar"));
                        break;
                    case 3: userManager.ShowUsers();
                        break;
                    case 4: userManager.ShowSearchUser(Input("Digite el apellido a buscar"));
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
