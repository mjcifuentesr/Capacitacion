package co.com.ath.banco.camilomora;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class CamiloMoraTest extends TestCase {

    @Test
    public void testHolaNombre() {
        //Arrange
        CamiloMora camiloMora = new CamiloMora();
        String name = "Camilo Mora";
        //act
        String returnHelloName = camiloMora.helloName(name);
        //assert
        Assert.assertEquals(name, returnHelloName);
    }
}