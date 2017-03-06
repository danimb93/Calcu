package Calcu;

import junit.framework.Assert.*;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @org.junit.Test
    public void sumita(){
        assertTrue( new Suma(2,3).sumar() ==5);
    }
    @org.junit.Test
    public void restita(){
       assertTrue(new Resta (5, 2).restar()==3);
}
    @org.junit.Test
    public void porita(){assertTrue( new Multiplicacion( 3, 4).multiplicar()==12);

    }
    @org.junit.Test
    public void entreita(){assertTrue( new Division(10, 2).dividir()==5);
    }

}
