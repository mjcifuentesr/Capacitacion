/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.ath.banco.consulta;

/**
 *
 * @author Javier
 */
abstract class consultasAhorro {
    
    public abstract double cuotaManejo(int numCuenta);
    public abstract double interes(int numCuenta);
    public abstract double saldo(int numCuenta);
    public abstract String categoria(int numCuenta);
}
