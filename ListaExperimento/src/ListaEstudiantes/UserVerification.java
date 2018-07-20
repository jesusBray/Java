package ListaEstudiantes;

public class UserVerification {
    FilterUserData filtrado;
    ConectionSql coneccion;
    UserManager user;
    
    public UserVerification (){}
    
    public boolean UserDBChecker(String user,String pasword){
        String alertaLogin="error datos invalidos";
        if (filtrado.ValidationData(user) && filtrado.ValidationData(pasword)) {
            if (new ConectionSql(user,pasword).isConnected()) {
                System.out.println("Bienvenido a su base de datos!");
                return true;
            }
        }
//        else{
//            return false;
//        }
        return false;
    }
    
    public void AddUsuario(String id_usuario,String cargo,String nombre,String app, int sueldo){
        new ConectionSql("root","root");
        if (filtrado.ValidationData(id_usuario)&&filtrado.ValidationData(cargo)&&filtrado.ValidationData(nombre)&&filtrado.ValidationData(app)) {
            user.AddUser(id_usuario, cargo, nombre, app, sueldo);
        }
        
    }
    
    public void UserDeleted(String removeUser) {
        if (filtrado.ValidationDataNumber(removeUser)) {
            if (user.RemoveUser(removeUser)>0) {
                System.out.println("Se a eliminado al usuario");
            }
            else{
                System.out.println("dato no valido!");
            }
        }
        else{
            System.out.println("Error caracter no valido");
        }
    }
    
    public void ShowResultSearch(String userSearch) {
        if (filtrado.ValidationData(userSearch)) {
            user.ShowSearchUser(userSearch);
        }
    }
    
}
