/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoatm;

/**
 *
 * @author henryculajay
 */
public class Autenticar {
    
    private boolean resultado;

    public boolean autenticar(Cuentahabiente cuenta1,int noCuenta, int nip){
        
        if (cuenta1.getNoCuenta() == noCuenta && cuenta1.getNip() == nip) {
            System.out.println("\nCredenciales validas ;)");
            resultado = true;
        } else {
            System.out.println("\nCredenciales invalidas :(");
            System.out.println("Intente nuevamente\n");
            resultado = false;
        }
        return resultado;
    }

    public boolean isResultado() {
        return resultado;
    }

    public void setResultado(boolean resultado) {
        this.resultado = resultado;
    }
}
