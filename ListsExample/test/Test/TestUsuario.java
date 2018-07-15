
package Test;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestUsuario {
    String name = "jorge",lastName = "cruz",age="20",direcction = "300";
    
    @Test
    public void TestUsuario(){
        String nameExpected = "jorge";
        String lastNameExpected = "cruz";
        String ageExpected = "20";
        String directionExpected = "300";
        assertEquals(nameExpected, name);
        assertEquals(lastNameExpected, lastName);
        assertEquals(ageExpected, age);
        assertEquals(directionExpected, direcction);
    }
    
    @Test
    public void TestUsuarioFail(){
        String nameExpectedFail = "100";
        String lastNameExpectedFail = "cruz1";
        String ageExpectedFail = "20c";
        String directionExpectedFail = "300x";
        assertEquals(nameExpectedFail, name);
        assertEquals(lastNameExpectedFail, lastName);
        assertEquals(ageExpectedFail, age);
        fail(directionExpectedFail);
    }
    
    @Test
    public void TestGetName(){
        String nameExpected = "jorge";
        assertEquals(nameExpected, name);
    }
    
    @Test
    public void TestGetNameFail(){
        String nameExpectedFail = "100";
        fail(nameExpectedFail);
    }
    
    
    @Test
    public void TestSetName(){
        String name = "jorge";
        String nameExpected = "jorge";
        assertEquals(nameExpected, name);
    }
    
    @Test
    public void TestSetNameFail(){
        String name = "jorge";
        String nameExpectedFail = "jorge11";
        fail(nameExpectedFail);
    }
    
    @Test
    public void TestGetLastName(){
        String lastnameExpected = "cruz";
        assertEquals(lastnameExpected, lastName);
    }
    
    @Test
    public void TestGetLastNameFail(){
        String lastnameExpectedFail = "cruz12";
        fail(lastnameExpectedFail);
    }
    
    @Test
    public void TestSetLastName(){
        String lastName = "cruz";
        String lastNameExpected = "cruz";
        assertEquals(lastNameExpected, lastName);
    }
    
    @Test
    public void TestSetLastNameFail(){
        String lastName = "cruz";
        String lastNameExpectedFail = "cruz123";
        fail(lastNameExpectedFail);
    }
    
    @Test
    public void TestGetAge(){
        String ageExpected = "20";
        assertEquals(ageExpected, age);
    }
    
    @Test
    public void TestGetAgeFail(){
        String ageExpectedFail = "20a";
        fail(ageExpectedFail);
    }
    
    @Test
    public void TestSetAge(){
        String age = "20";
        String ageExpected = "20";
        assertEquals(ageExpected, age);
    }
    
    @Test
    public void TestSetAgeFail(){
        String age = "20";
        String ageExpectedFail = "20a";
        fail(ageExpectedFail);
    }
    
    @Test
    public void TestGetDirection(){
        String directionExpected = "300";
        assertEquals(directionExpected, direcction);
    }
    
    @Test
    public void TestGetDirectionFail(){
        String directionExpectedFail = "300a";
        fail(directionExpectedFail);
    }
    
    @Test
    public void TestSetDirection(){
        String direction = "300";
        String direcctionExpected = "300";
        assertEquals(direcctionExpected, direcction);
    }
    
    @Test
    public void TestSetDirectionFail(){
        String direction = "300";
        String direcctionExpectedFail = "300a";
        fail(direcctionExpectedFail);
    }

}
