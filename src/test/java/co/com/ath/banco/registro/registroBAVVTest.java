/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.ath.banco.registro;
import co.com.ath.banco.consulta.accesoDatos.DataBase;
import org.junit.*;
import static org.junit.Assert.assertEquals;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
/**
 *
 * @author Alejandro Tarapuez
 */
public class registroBAVVTest {
    
    @Mock
    DataBase data;
    
    @InjectMocks   
    registroBAVV test;
    
    @BeforeClass
    public static void inicio(){
        System.out.println("Se inician pruebas para registroBAVV");
    }
    
    @Before
    public void inicio_caso(){
        System.out.println("Se inicia la prueba ");
        MockitoAnnotations.initMocks(this);
    }
    
    @After
    public void fin_caso(){
        System.out.println("Se finaliza la prueba ");
    }
    
    @AfterClass
    public static void fin(){
        System.out.println("Se finalizan pruebas para registroBAVV");
    }
    
    @Test
    public void retiroTest(){
        String i="200";
        Mockito.when(data.getDatos()).thenReturn(i);
        assertEquals("200",test.retiro());
    }
    
    @Test
    public void consignacionTest(){
        String i="200";
        Mockito.when(data.getDatos()).thenReturn(i);
        Assert.assertTrue(i.equals(test.consignacion()));
    }
}
