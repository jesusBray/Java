public class MyException extends Throwable{
    
    String nota;
    public MyException(String nota){
        this.nota=nota;
    }
    
    @Override
    public String getMessage(){
        return String.format("Error: %s", nota);
    }
}
