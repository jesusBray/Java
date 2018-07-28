package ListaEstudiantes;

public class UserVerification {
    FilterUserData filtrado;
    ConectionSql coneccion;
    UserManager user;
    
    public UserVerification (){}
    
    public boolean ValidateUsers(String user,String pasword){
        if (true) {
            
        }
        return false;
    }
    
    public void UserDBChecker(String user,String pasword){
        System.out.println("verifcando filtros");
        String alertaLogin="error datos invalidos";
        if (filtrado.ValidationData(user) && filtrado.ValidationData(pasword)) {
            alertaLogin = "datos validos!";
            System.out.println(alertaLogin+"\nBienvenido a su base de datos!");
        }
        else{
            System.out.println(alertaLogin);
        }
    }
    
    public void AddUsuario(String id_usuario,String cargo,String nombre,String app, int sueldo){
        System.out.println("verifcando datos al crear usuario");
        new ConectionSql("root","root");
        if (filtrado.ValidationData(id_usuario)&&filtrado.ValidationData(cargo)&&filtrado.ValidationData(nombre)&&filtrado.ValidationData(app)) {
            user.AddUser(id_usuario, cargo, nombre, app, sueldo);
        }
        
    }
    
    public void UserDeleted(String removeUser) {
        System.out.println(" filtrando datos");
        if (filtrado.ValidationDataNumber(removeUser)) {
            user.RemoveUser(removeUser);
            System.out.println("Se a eliminado al usuario");
        }
        else{
            System.out.println("Error caracter no valido");
        }
    }
    
    public void ShowResultSearch(String userSearch) {
        System.out.println("filtrando datos ");
        if (filtrado.ValidationData(userSearch)) {
            user.ShowSearchUser(userSearch);
        }
    }   
}