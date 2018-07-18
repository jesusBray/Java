
package ListaEstudiantes;

import java.util.ArrayList;

public class UserManager {
    ArrayList<Usuario> lista = new ArrayList<>();
    
    public ArrayList<Usuario> GetLista(){
        return lista;
    }
    
// principios de SOLID 
    private boolean ValidationData(String value) {
        for (int i = 0; i < value.length(); i++) {
            if (!Character.isLetter(value.charAt(i))) {
                System.out.println("Error en "+value);
                return false;
            }
        }
        return true;
    }
    
    public boolean ValidationDataNumber(String data) {
        for (int i = 0; i < data.length(); i++) {
            if (!Character.isDigit(data.charAt(i))) {
                System.out.println("Error en "+data);
                return false;
            }
        }
        return true;
    }

    private boolean ValidationDataAge(String age) {
        int numberAge = Integer.parseInt(age);
        if (numberAge > 0 && numberAge < 100) {
            for (int i = 0; i < age.length(); i++) {
                if (!Character.isDigit(age.charAt(i))) {
                    System.out.println("Error en "+age);
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    //validacion en datos;
    public boolean ValidateName(String name) {
        return ValidationData(name);
    }

    public boolean ValidateLastName(String lastName) {
        return ValidationData(lastName);
    }
    
    public boolean ValidateAge(String age) {
        return ValidationDataNumber(age);
    }
    
    public boolean ValidateDirecction(String direcction) {
        return ValidationDataNumber(direcction);
    }
    
    private boolean ValidateParameters(String name, String lastName, String age, String direc) {
        if (ValidateName(name) && ValidateLastName(lastName) && ValidateAge(age) && ValidateDirecction(direc))
            return true;
        return false;
    }
    
    public void FillingFields(Usuario user) {
        lista.add(user);
    }
    
    public void CreateUser(String a, String b, String c, String d) {
        if (ValidateParameters(a, b, c, d)) {
           //crear usuario
           FillingFields(new Usuario(a, b, c, d));
        }else{
           System.out.println("error in filling data!");
           //erroe al crear usuario
        }
//           FillingFields(new Usuario(a, b, c, d));
    }
    
    public void DeleteUsers(int userDelet) {
        lista.remove((userDelet-1));
    }
   
    public void ShowList() {
        int i = 0;
        for (Usuario usuario : lista) {
            i++;
            System.out.println("N#"+i+": "+usuario.VerInfo());
        }
    }
}

