/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.ath.banco.consulta;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;





/**
 *
 * @author Javier
 */
public class consultasBAVVTest {
    
    consultasBAVV test=new consultasBAVV();
    
    @BeforeClass
    public static void inicio(){
        System.out.println("Se inician pruebas para consultasBAVV");
    }
    
    @Before
    public void inicio_caso(){
        System.out.println("Se inicia la prueba ");
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
    public void cuotaManejoTest1(){
        int cuenta=5000;
        double i=25000;
        Assert.assertTrue(i==test.cuotaManejo(cuenta));
    }
    
    @Test
    public void cuotaManejoTest2(){
        int cuenta=0;
        double i=2000;
        Assert.assertTrue(i==test.cuotaManejo(cuenta));
    }
    
    @Test
    public void interesTest(){
        int cuenta=0;
        double i=90000;
        double resultado=test.interes(cuenta);
        Assert.assertTrue(i==resultado);
    }
    
    @Test
    public void saldoTest(){
        int cuenta=0;
        double i=500000;
        Assert.assertTrue(i==test.saldo(cuenta));
    }
    @Test
    public void categoriaTest(){
        int cuenta=0;
        String i="Clasica";
        Assert.assertTrue(i.equals(test.categoria(cuenta)));
    }
    @Test
    public void puntosTest(){
        int cuenta=0;
        double i=1000;
        Assert.assertTrue(i==test.puntos(cuenta));
    }
    @Test
    public void retirosTest(){
        int cuenta=0;
        double i=6;
        Assert.assertTrue(i==test.retiros(cuenta));
    }
    @Test
    public void millasBAVVTest(){
        int cuenta=0;
        double i=50000;
        Assert.assertTrue(i==test.millasBAVV(cuenta));
    }
}
