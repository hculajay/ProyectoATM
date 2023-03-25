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
    float pivote;
    
    private float saldoFlotante;
    private int numeroDeCuenta;
    private int nip;
    
    
    
    //Constructor
    /*
    public Cuenta(String nombre){
        System.out.println("Hola!" + nombre);
    }
    */
    //public Cuenta(){
       //saldo = 15000; 
    //}
    //Constructores
    public Cuenta() {
        //saldo = 65f;
    }
    /*
    public Cuenta(float saldo, float saldoFlotante, int numeroDeCuenta, int nip) {
        this.saldo = saldo;
        this.saldoFlotante = saldoFlotante;
        this.numeroDeCuenta = numeroDeCuenta;
        this.nip = nip;
    }
    */
    public Cuenta(float saldoInicial) {
        this.saldo = saldoInicial;
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

    /*
    //creando metodos
    public int obtenerSaldo(int numeroDeCuenta){
    System.out.println("Cuenta.obtenerSaldo(int)");
    return 0;
    }
    public int obtenerSaldo(String s1, int i1){
    System.out.println("Cuenta.obtenerSaldo(String, int)");
    return 0;
    }
    public int obtenerSaldo(int i1, String s1){
    System.out.println("Cuenta.obtenerSaldo(int, String)");
    return 0;
    }
     */
    public void acreditar(int monto) {
   
    }
            
    public void debitar(float monto){
        this.setSaldo(monto);
        System.out.println("monto:"+monto);
        System.out.println("saldo: "+this.getSaldo());
        this.saldo = monto;
        /*System.out.println("monto: "+monto);
        System.out.println("getSaldo: "+this.getSaldo());
        float d1  = ((this.getSaldo()) - monto);
        this.setSaldo(d1);
        System.out.println("setSaldo:" + d1);
        System.out.println("cuenta debitar(), saldo: "+ this.getSaldo());*/
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
