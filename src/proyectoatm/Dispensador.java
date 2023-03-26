/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoatm;

/**
 *
 * @author henryculajay
 */
public class Dispensador {
    
    int efectivoDisponible;

    public Dispensador(int efectivoDisponible) {
        this.efectivoDisponible = efectivoDisponible;
    }
    
    public boolean verificarEfectivo(int monto){
        
        if (monto <= this.efectivoDisponible){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean entregarEfectivo(int montoEfectivo){
        return true;
    }

    public int getEfectivoDisponible() {
        return efectivoDisponible;
    }

    public void setEfectivoDisponible(int efectivoDisponible) {
        this.efectivoDisponible = efectivoDisponible;
    }
}
