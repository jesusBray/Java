package ListaEstudiantes;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Menu {
    Scanner entrada = new Scanner(System.in);
    UserManager userManager = new UserManager(new ConectionSql("root","root"));
    FilterUserData um = new FilterUserData();
    
    private String Input(String a){
        System.out.println(a);
        return entrada.next();
    }
    
    private void DataEntry() {      
        um.CreateUser(Input("Digite el nombre"), Input("Digite el apellido"), Input("Digite la edad"), Input("Digite la direccion"));    
    }
    
    private void Print() {
        for (Usuario usuario : um.GetLista()) {
            System.out.println(": "+usuario.VerInfo());
        }
    }
   
    public void Start(){
        boolean exit = true;
        String option;
        do{
            System.out.println(" 1:Adicionar usuario \n 2:Eliminar usuario \n 3:Mostrar \n 4:Buscar usuario \n 5:Salir");
            option = entrada.next();
            if (um.ValidationDataNumber(option)) {            
                switch(Integer.parseInt(option)) {
                    case 1: DataEntry();
                    
                        break;
                    case 2: um.DeleteUsers(Integer.parseInt(Input("Ingrese el numero del usuario a eliminar")));
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
