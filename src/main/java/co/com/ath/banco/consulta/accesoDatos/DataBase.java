/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.ath.banco.consulta.accesoDatos;

/**
 *
 * @author Javier
 */
public class DataBase implements accesoDatos {

    @Override
    public String getDatos() {
        return "Conectado";
    }

    @Override
    public String setDatos() {
        return "Conectado";
    }
    
}
