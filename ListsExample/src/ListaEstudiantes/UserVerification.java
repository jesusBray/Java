package ListaEstudiantes;

public class UserVerification {
    FilterUserData filtrado;
    ConexionSQL coneccion;
    UserManager userManager = null;
    String usuario="root",password="root",personal,contrasenia;
    public UserVerification (String usuario,String password){
        personal = usuario;
        contrasenia = password;
    }
    public boolean verific(){
        if (personal==usuario && this.password == contrasenia) {
            System.out.println("Bienvenido a su base de datos!");
            return true;
        }
        return false;
    }
    public UserManager UserDBChecker(){
        
        String alertaLogin="error datos invalidos";
        if (verific()) {
            coneccion= new ConexionSQL(usuario,password);
            coneccion.isConnected();
            return userManager = new UserManager(coneccion);
        }
        return userManager;
    }
    
    public void AddUsuario(String id_usuario,String cargo,String nombre,String app, int sueldo){
        new ConexionSQL("root","root");
        if (filtrado.ValidationData(id_usuario)&&filtrado.ValidationData(cargo)&&filtrado.ValidationData(nombre)&&filtrado.ValidationData(app)) {
            userManager.AddUser(id_usuario, cargo, nombre, app, sueldo);
        }
        
    }
    
    public void UserDeleted(String removeUser) {
        if (filtrado.ValidationDataNumber(removeUser)) {
            if (userManager.RemoveUser(removeUser)>0) {
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
            userManager.ShowSearchUser(userSearch);
        }
    }
    
}
