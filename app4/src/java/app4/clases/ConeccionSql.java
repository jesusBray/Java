package app4.clases;
    
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class ConeccionSql {
    
    public String server,dataBase,port,user,pass,extra="?useUnicode=yes&characterEncoding=UTF-8&useSSL=false";
    public ConeccionSql() {
        ConfigProperties conf = new ConfigProperties("config.properties");
        server = conf.getDatosDB("serverDB");
        dataBase = conf.getDatosDB("dataBase");
        port = conf.getDatosDB("portDB");
        user = conf.getDatosDB("userDB");
        pass = conf.getDatosDB("passDB");
    }
    
    public Connection startConnection() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://"+server+":"+port+"/"+dataBase+extra,user,pass);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("error en startConnection: "+e.getMessage());
            return null;
        }
    }
    
    public String getUserDB(){
        return user;
    }
    
    public static void main(String[] args) {
        ConeccionSql c = new ConeccionSql();
        System.out.println(c.dataBase+", "+c.pass);
    }
}
