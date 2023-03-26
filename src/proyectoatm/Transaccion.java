/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoatm;

/**
 *
 * @author henryculajay
 */
public abstract class Transaccion {
    //variables
    //private float monto;
    
    //contructores
    //public Transaccion() {
    //}
    
    protected Cuenta cuenta;

    public Transaccion(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    
    
    /*
    //getters and setters
    public float getMonto(){
        return monto;
    }
    public void setMonto(float monto) {
        this.monto = monto;
    }
    */

    //metodos
    public abstract void ejecutar();

}
