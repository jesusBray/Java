
package ListaEstudiantes;

public class FilterUserData {
   
    public FilterUserData(){}
    
// principios de SOLID 
    public boolean ValidationData(String value) {
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
    

}

