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
    
    private float monto;
    
    public Retiro(Cuenta cuenta, float monto){
        super(cuenta);
        this.monto = monto;    
    }
    
    public void ejecutar(){
        
        cuenta.debitar(monto);
        
        //System.out.println("traer saldo: " + cuenta.getSaldo());
        //System.out.println("monto: "+monto);
    }
    
    
    
}
