/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoatm;

import java.util.Scanner;

/**
 *
 * @author henryculajay
 */
public class TecladoNumerico {
    
    private Scanner scan;
    
    public TecladoNumerico(){
        scan = new Scanner(System.in);
    }
    
    public int capturarDatos(){
       return scan.nextInt();
    }
}
