/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.ath.banco.registro;


import co.com.ath.banco.consulta.accesoDatos.DataBase;

/**
 *
 * @author Javier
 */
public class registroBAVV extends registroAhorro {

    DataBase p=new DataBase();
    
    @Override
    public String retiro() {
        return p.getDatos();
    }

    @Override
    public String consignacion() {
        return p.getDatos();
    }
    
    
    
}
