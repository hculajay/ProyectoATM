/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoatm;

/**
 *
 * @author henryculajay
 */
public class Retiro extends Transaccion{
    //int monto;
    
    
    
    public void ejecutar(float monto, float saldoInicial){
        
        System.out.println("monto: "+monto);
        System.out.println("getSaldo: "+saldoInicial);
        float d1  = ((saldoInicial) - monto);
        //cuentaObj2.setSaldo(d1);
        System.out.println("setSaldo:" + d1);
        System.out.println("cuenta debitar(), saldo: "+ saldoInicial);
        
        
        Cuenta cuentaObj; 
        //new cuentaObj.setSaldo(d1);
        /*cuentaObj2.debitar(monto);
        System.out.println("retiro.ejecutar , saldo:" + cuentaObj2.getSaldo());*/
        
    }
    
}
