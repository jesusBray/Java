
package ListaEstudiantes;

public class FilterUserData {
   
    public FilterUserData(){}
    
    private void ErrorMessage(String dato){
        System.out.println("Error"+dato);
    }
// principios de SOLID 
    public boolean ValidationData(String value) {
        for (int i = 0; i < value.length(); i++) {
            if (!Character.isLetter(value.charAt(i))) {
                ErrorMessage(value);
                return false;
            }
        }
        return true;
    }
    
    public boolean ValidationDataNumber(String data) {
        for (int i = 0; i < data.length(); i++) {
            if (!Character.isDigit(data.charAt(i))) {
                ErrorMessage(data);
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
                    ErrorMessage(age);
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private void ValidateParameters3(String id_usuario, String lastName){
        if (ValidationData(id_usuario) && ValidationData(lastName))
            ErrorMessage("");
        else
            ErrorMessage("Error");
    }
    
    private void ValidateParameters4(String id_usuario, String cargo, int salario) {
        if (ValidationData(id_usuario) && ValidationData(cargo) && ValidationDataNumber(Integer.toString(salario)))
            ErrorMessage("");
        else
        ErrorMessage("Error");
    }
    
    private void ValidateParameters5(String id_usuario, String cargo, String nombre, String apellido,int salario) {
        if (ValidationData(id_usuario) && ValidationData(cargo)&& ValidationData(nombre) &&ValidationData(apellido) && ValidationDataNumber(Integer.toString(salario)))
        ErrorMessage("");
        else
        ErrorMessage("Error");
    }
    
    private void ValidateParameters6(String id_usuario, String cargo, String nombre, String apellido,int salario, String sexo) {
        if (ValidationData(id_usuario) && ValidationData(cargo)&& ValidationData(nombre) &&ValidationData(apellido) &&ValidationDataNumber(sexo) && ValidationDataNumber(Integer.toString(salario)))
            ErrorMessage("");
        else
            ErrorMessage("Error");
    }
}