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
public class consultasBPOP extends consultasAhorro implements beneficiosGenerales,beneficiosBAVV{

    @Override
    public double cuotaManejo(int i) {
        if(i==0){
           return 2000+i; 
        }else{
          return 20000+i;  
        }
    }

    @Override
    public double interes(int i) {
        return 90000;
    }

    @Override
    public double saldo(int i) {
        return 500000;
    }

    @Override
    public String categoria(int i) {
        return "Clasica";
    }

    @Override
    public int puntos(int numCuenta) {
        return 1000;
    }

    @Override
    public int retiros(int numCuenta) {
        return 6;
    }

    @Override
    public int millasBAVV(int numCuenta) {
        return 50000;
    }

    @Override
    public int consultar(int numCuenta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
