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
    private float monto;
    
    //contructores
    public Transaccion() {
    }

    public Transaccion(float monto) {
        this.monto = monto;
    }
    
    

    //getters and setters
    public float getMonto(){
        return monto;
    }
    public void setMonto(float monto) {
        this.monto = monto;
    }

    //metodos
    public void ejecutar(float monto, float saldoInicial) {
        System.out.println("Transaccion.ejecutar");
    }
    
}
