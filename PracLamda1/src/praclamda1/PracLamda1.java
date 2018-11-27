package praclamda1;

import java.util.Optional;

public class PracLamda1 {
    
    public String auxOrElse(String valor) {
       Optional<String> op = Optional.ofNullable(valor);
       return op.orElse("dato externo! ");
    }
    
    public void orElseThrow(String valor) {
        Optional<String> op = Optional.ofNullable(valor);
        op.orElseThrow(NumberFormatException::new);
    }
    
    public static void main(String[] args) {
        PracLamda1 p = new PracLamda1();
        p.orElseThrow(null);
    }
    
}
