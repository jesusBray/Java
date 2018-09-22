
package lambdas8;

public class Lambdas8 implements IOperaciones1,IOperaciones2{

    @Override
    public void anuncio1() {
        IOperaciones1.super.anuncio1(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void anuncio2() {
        IOperaciones2.super.anuncio2(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void anuncio3() {
        IOperaciones1.super.anuncio3(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void metodo1(){
        IOperaciones3 op3 = (id,nombre,cargo)-> {
            return 
        new Usuario(id, nombre, cargo);};
        Usuario user = op3.crearUsuario(1, "jesus", "viceprecidente junior");
        System.out.println(user.toString());
    }
    
    public static void main(String[] args) {
        
        Lambdas8 lm = new Lambdas8();
        lm.anuncio1();
        lm.anuncio2();
        lm.anuncio3();
        lm.metodo1();
        
    }
    
}
