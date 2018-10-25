
package com.clases;


public class GetDatosDB {
    
    private final String selectAll = "selct * from ?";
       
    private Autentificacion aut;
    public GetDatosDB(Autentificacion aut){
        this.aut = aut;
    }
    
    public String login(String user,String pass){
        try {
            
            
            return "coneccion establesida!";
        } catch (Exception e) {
            System.out.println("error en login! "+e.getMessage());
            return "no se pudo estableser coneccion!!";
        }
    }
    
    
    public static void main(String[] args) {
        String path = "jdbc:mysql://localhost:3306/users?useUnicode=yes&characterEncoding=UTF-8&useSSL=false";
        String user = "root";
        String pass = "root";
        GetDatosDB gd = new GetDatosDB(new Autentificacion(path, user, pass));
    }
}
//    public String login(String user,String pass) {
//        String nota="no se a encontrado al usuario!";
//        try {
//            PreparedStatement ps = consulta(selectAll);
//            ps.setString(1, "login");
//            ResultSet result = ejecutarConsulta(ps);
//            
//            while (result.next()) {                
//                if(user.equals(result.getString("user"))&&pass.equals(result.getInt("pass"))){
//                    return nota="Usuario valido !!";
//                }
//            }
//            return nota;
//        } catch (SQLException ex) {
//            System.out.println("error en login "+ex.getMessage());
//            return nota;
//        }
//    }