package Test;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestUserManager {
    String name = "jorge",lastName = "cruz",age="20",direcction = "300";
    
    @Test
    public void TestValidationData(){
        String cadena = "jorge";
        String validationNameExpected = "jorge";
        assertEquals(validationNameExpected, cadena);
    }
    
    @Test
    public void TestValidationDataNumber(){
        String cadena = "123";
        String validationNumberExpected = "123";
        assertEquals(validationNumberExpected, cadena);
    }
    
    @Test
    public void TestValidationDataAge(){
        String validationAgeExpected = "jorge";
        assertEquals(validationAgeExpected, age);
    }
    
    @Test
    public void TestValidateName(){
        String validationNameExpected = "23";
        assertEquals(validationNameExpected, name);
    }
    
    @Test
    public void TestValidateAge(){
        String validationAgeExpected = "23";
        assertEquals(validationAgeExpected, age);
    }
    
    
    @Test
    public void ValidateDirecction() {
        String validationDirectionExpected = "2300";
        assertEquals(validationDirectionExpected, direcction);
    }
    
    @Test
    public void ValidateParameters() {
        String validationParametersExpected = "2300";
        assertEquals(validationParametersExpected, direcction);
    }
    
    @Test
    public void TestName() {
        String name = "jesus";
        String expectedName = "jesus";
        assertEquals(expectedName, name);
    }
    
    @Test
    public void TestLastname() {
        String lastName = "jesus";
        String expectedLasName = "jesus";
        assertEquals(expectedLasName, lastName);
    }
    
    @Test
    public void TestAge() {
        int age = 22;
        int expectedAge = 22;
        assertEquals(expectedAge,age);
    }
    
    @Test
    public void TestDirection() {
        int direction = 300;
        int expectedDirection = 300;
        assertEquals(expectedDirection,direction);
    }
    
    @Test
    public void TestUssers() {
        String nombre = "jesus";
        String apellido = "paye";
        int edad = 22;
        int direccion = 333;
        String nombreEsperado = "jesus", apellidoEsperado = "paye";
        int edadEsperado= 22, direccionEsperado = 333;
        
        assertEquals(nombreEsperado, nombre);
        assertEquals(apellidoEsperado, apellido);
        assertEquals(edadEsperado, edad);
        assertEquals(direccionEsperado, direccion);
    }
    
    @Test
    public void TestMenu() {
        int opcion = 1;
        int optiocExpected = 1;
        assertEquals(optiocExpected, opcion);
    }
    
    
}
