/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.ath.banco.consulta.accesoDatos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

/**
 *
 * @author Javier
 */
public class DataBaseTest {
    
    
    DataBase data=new DataBase();
    
    @BeforeClass
    public static void inicio(){
        System.out.println("Se inician pruebas para consultasBAVV");
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
        System.out.println("Se finalizan pruebas para consultasBAVV");
    }
    
    @Test
    public void getDatosTest(){
        String i="Conectado";
        Assert.assertEquals(i, data.getDatos());
    }
    
    
    @Test
    public void setDatosTest(){
        String i="Conectado";
        Assert.assertEquals(i, data.setDatos());
    }
    
    
}
