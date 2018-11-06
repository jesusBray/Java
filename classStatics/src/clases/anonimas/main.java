package clases.anonimas;

public class main {
    
    String nombreFestivo;
    public main(String nombreFestivo){
        this.nombreFestivo=nombreFestivo;
    }
    
    public void fechaConmemorativa() {
        
        claseAbstracta c = new claseAbstracta() {
            @Override
            int dia() {
                return 25;
            }

            @Override
            int mes() {
                return 12;
            }

            @Override
            String diaFestivo(String diaFestivo) {
                if(diaFestivo.equals("navidad")){
                    return diaFestivo+", "+dia()+" / "+mes();
                }
                else{
                    return "dia no asignado!";
                }
            }
        };
        System.out.println(this.nombreFestivo + c.diaFestivo("navidad"));
    }

    public static void main(String[] args) {
        main m = new main("Temporada navidenia! ");
        m.fechaConmemorativa();
    }
}
