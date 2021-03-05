/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.ath.banco;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Javier
 */
public class claseMiltonTest {
    
    claseMilton mil=new claseMilton();
    
    
    @Test
    public void nombreTest(){
        //Arrange
        String nombre="milton";
        String value="";
        //Act
        value=mil.nombre(nombre);
        //Assert
        Assert.assertTrue(value.equalsIgnoreCase(nombre));
    }
    
    @Test
    public void sumaTest(){
        //Arrange 
        int i=5;
        int o=9;
        int value;
        //Act
        value=mil.suma(i, o);
        //Assert
        Assert.assertTrue(value==i+o);
    }
    
    @Test
    public void nombreApellidoTest(){
        //Arrange
        String nombre="Ana";
        String value="";
        //Act
        value=mil.nombreApellido(nombre);
        //Assert
        Assert.assertTrue(value.equalsIgnoreCase(nombre));
    }
    
    @Test
    public void nombreApellidoTest2(){
        //Arrange
        String nombre="milton";
        String value="";
        //Act
        value=mil.nombreApellido(nombre);
        //Assert
        Assert.assertEquals(value,nombre+" Cifuentes");
    }
        
}
