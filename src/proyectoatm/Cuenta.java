/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoatm;

/**
 *
 * @author henryculajay
 */
public class Cuenta {
    //declaracion de variables o instancias
    private float saldo;
    private float saldoFlotante;
    private int numeroDeCuenta;
    private int nip;
    

    public Cuenta(float saldo) {
        this.saldo = saldo;
    }   
    //Getters and Setters        
    public float getSaldo(){
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldoFlotante() {
        return saldoFlotante;
    }

    public void setSaldoFlotante(float saldoFlotante) {
        this.saldoFlotante = saldoFlotante;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }

    public void acreditar(float monto) {
        //System.out.println("saldo = "+saldo);
        //System.out.println("monto = " + monto);
        saldoFlotante += monto;
    }  
   
    public void debitar(float monto){
        //System.out.println("saldo = "+saldo);
        //System.out.println("monto = " + monto);
        saldo -= monto;
    }       
    
    /*
    if (numeroDeCuenta > 9999 && numeroDeCuenta < 100000) {
            this.numeroDeCuenta = numeroDeCuenta;
        }
        else {
            System.out.println("El numero de cuenta no es válido.");
        }
        
    */
}
