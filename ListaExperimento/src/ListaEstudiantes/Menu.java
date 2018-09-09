package ListaEstudiantes;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Menu {
    String option;
    Scanner entrada = new Scanner(System.in);
    //esta instancia abre una ruta donde se almasena el usuario y contrasenia
    DBConfig path = new DBConfig("/home/jesus/Desktop/texto.txt");
    //usamos los metodos "getUser","getgetPasswor" para signar el usuarioy su contrasena 
    
    UserManager userManager = new  UserManager(new ConectionSql(path.getUser(),path.getPassword()));
    Usuario user = new Usuario();
    FilterUserData filtre = new FilterUserData();
    
    //este metodo es para imprimir por scanner;
    private String Input(String a){
        System.out.println(a);
        return entrada.next();
    }
    
    //este metodo imprime los datos mediante una ventana emergente 
    private String MessageOP(String mensaje){
        return JOptionPane.showInputDialog(mensaje);
    }
    
    private int MessageOp(String mensaje){
        return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
    }
    
    public void Start(){
        boolean exit = true;
        do{
            option = MessageOP(" 1:Adicionar usuario \n 2:Eliminar usuario \n 3:Mostrar \n 4:Buscar usuario \n 5:Editar usurio \n 6:Salir");
            if (filtre.ValidationDataNumber(option)) {            
                switch(Integer.parseInt(option)) {
//                    case 1: userManager.AddUser(user(MessageOP("Digite el id para el usuario"),MessageOP("Digite el cargo para el usuario"),MessageOP("Digite el nombre para el usuario"),MessageOP("Digite el apellido para el usuario"),MessageOp("Digite el salario"));
                    case 1: userManager.AddUser(new Usuario(option, option, option, option, 0));
                        break;
                    case 2: userManager.RemoveUser(MessageOP("Digite el id a eliminar"));
                        break;
                    case 3: userManager.ShowUsers();
                        break;
                    case 4: userManager.ShowSearchUser(MessageOP("Digite el apellido a buscar"));
                        break;
                    case 5: userManager.EditUser(new Usuario(MessageOP("Digite el id del usuario a editar"), MessageOP("Digite un nuevo nombre"), MessageOP("Digite un nuevo apellido"), MessageOP("Digite un nombre nuevo"), MessageOp("Digite un digito para el sueldo")));
                        break;
                    case 6: exit = false;
                        System.out.println("www.Yesvill.com");
                        break;
                    default : System.out.println("Digito no valido intente denuevo");
                }
            } 
        }while(exit);
    }
}