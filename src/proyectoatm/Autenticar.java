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

    public boolean autenticar(int noCuenta, int noNip){
        
        if (noCuenta == 12345 && noNip == 12345) {
            System.out.println("Credenciales validas ;)");
            resultado = true;
        } else {
            System.out.println("Credenciales invalidas :(");
            System.out.println("Intente nuevamente");
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
