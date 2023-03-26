/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoatm;

/**
 *
 * @author henryculajay
 */
public class ATM {
      
    private RanuraParaDepositos ranuraParaDepositosObj;
    private TecladoNumerico tecladoNumericoObj;
    private Pantalla pantallObj;
    private Dispensador dispensadorObj;
    private Cuentahabiente cuentahabiente1;
    //Cuenta cuentaObj = new Cuenta();
    Cuenta cuentaObj = new Cuenta(65);
    
   
    
    public ATM(){
    this.ranuraParaDepositosObj = new RanuraParaDepositos();
    this.tecladoNumericoObj = new TecladoNumerico();
    this.pantallObj = new Pantalla();
    this.dispensadorObj = new Dispensador();
    this.cuentahabiente1 = new Cuentahabiente(12345, 12345);
    this.solicitarDatos();
    
    }

    private void solicitarDatos(){
        pantallObj.mostrarMensaje("Bienvenido!\n");
        pantallObj.mostrarMensaje("Ingrese su número de cuenta: ");
        int numeroCuenta = tecladoNumericoObj.capturarDatos();
        pantallObj.mostrarMensaje("\nEscriba su NIP: ");
        int nip = tecladoNumericoObj.capturarDatos();
        
        Autenticar autObj = new Autenticar();
        autObj.autenticar(cuentahabiente1,numeroCuenta, nip);
        
        if (autObj.isResultado()) {
            this.mostrarMenuPrincipal();
        } else {
            this.solicitarDatos();
        }
    }

    private void mostrarMenuPrincipal(){
        pantallObj.mostrarMensaje("\nMenu principal\n");
        pantallObj.mostrarMensaje("\t1 - Ver mi saldo\n ");
        pantallObj.mostrarMensaje("\t2 - Retirar efectivo\n ");
        pantallObj.mostrarMensaje("\t3 - Depositar fondos\n ");
        pantallObj.mostrarMensaje("\t4 - Salir\n ");
        pantallObj.mostrarMensaje("Escriba una opción: ");
        int opcionSeleccionada = tecladoNumericoObj.capturarDatos();
        
        
        switch (opcionSeleccionada) {
        case 1:
            System.out.println("\nSu saldo es: Q. " + cuentaObj.getSaldo());
            this.mostrarMenuPrincipal();
            break;
        case 2:
            this.mostrarMenuRetiro();
            //System.out.println("retirar efectivo");
            break;
        case 3:
            System.out.println("depositar fondos");
            
            break;
        default:
            System.out.println("Hasta pronto!");
            System.exit(0);
        }
    }
    
    private void mostrarMenuRetiro(){
        pantallObj.mostrarMensaje("\nMenu de retiro\n");
        pantallObj.mostrarMensaje("\t1 - $20");
        pantallObj.mostrarMensaje("\t\t4 - $100\n");
        pantallObj.mostrarMensaje("\t2 - $40");
        pantallObj.mostrarMensaje("\t\t5 - $200\n");
        pantallObj.mostrarMensaje("\t3 - $60");
        pantallObj.mostrarMensaje("\t\t6 - Salir\n");
        pantallObj.mostrarMensaje("Elija un monto de retiro: ");
        int opcionRetiro = tecladoNumericoObj.capturarDatos();
        float montoR = 0;
        
        float [] arr1 = new float[5];
        arr1[0] = 20f;
        arr1[1] = 40f;
        arr1[2] = 60f;
        arr1[3] = 100f;
        arr1[4] = 200f;
       
        switch (opcionRetiro) {
        case 1:
            montoR = arr1[0];
            Transaccion retiroObj = new Retiro(cuentaObj, montoR);
            
            System.out.println("montoR: "+montoR);
            System.out.println(".getSaldo: "+cuentaObj.getSaldo());
            if (montoR <= cuentaObj.getSaldo() ){
                retiroObj.ejecutar();
                System.out.println("Por favor tome su efectivo\n");
            } else {
                System.out.println("\nSaldo insuficiente");
                System.out.println("Su saldo disponible es: " + cuentaObj.getSaldo());
                System.out.println("Por favor ingrese un monto menor\n");
                this.mostrarMenuRetiro();
            }
            System.out.println("Su nuevo saldo es: "+ cuentaObj.getSaldo());
            this.mostrarMenuPrincipal();
            break;
        case 2:
            
            montoR = arr1[1];
            Transaccion retiroObj2 = new Retiro(cuentaObj, montoR);
            
            System.out.println("montoR: "+montoR);
            System.out.println(".getSaldo: "+cuentaObj.getSaldo());
            if (montoR <= cuentaObj.getSaldo() ){
                retiroObj2.ejecutar();
                //int sal1 = cuentaObj.getSaldo()-monto;
                System.out.println("Por favor tome su efectivo\n");
            } else {
                System.out.println("\nSaldo insuficiente");
                System.out.println("Su saldo disponible es: " + cuentaObj.getSaldo());
                System.out.println("Por favor ingrese un monto menor\n");
                this.mostrarMenuRetiro();
            }
            System.out.println("Su nuevo saldo es: "+ cuentaObj.getSaldo());
            this.mostrarMenuPrincipal();
            break;
        case 3:
            montoR = arr1[2];
            Transaccion retiroObj3 = new Retiro(cuentaObj, montoR);
            
            System.out.println("montoR: "+montoR);
            System.out.println(".getSaldo: "+cuentaObj.getSaldo());
            if (montoR <= cuentaObj.getSaldo() ){
                retiroObj3.ejecutar();
                System.out.println("Por favor tome su efectivo\n");
            } else {
                System.out.println("\nSaldo insuficiente");
                System.out.println("Su saldo disponible es: " + cuentaObj.getSaldo());
                System.out.println("Por favor ingrese un monto menor\n");
                this.mostrarMenuRetiro();
            }
            System.out.println("Su nuevo saldo es: "+ cuentaObj.getSaldo());
            this.mostrarMenuPrincipal();
            break;
        case 4:
            montoR = arr1[3];
            Transaccion retiroObj4 = new Retiro(cuentaObj, montoR);
            
            System.out.println("montoR: "+montoR);
            System.out.println(".getSaldo: "+cuentaObj.getSaldo());
            if (montoR <= cuentaObj.getSaldo() ){
                retiroObj4.ejecutar();
                System.out.println("Por favor tome su efectivo\n");
            } else {
                System.out.println("\nSaldo insuficiente");
                System.out.println("Su saldo disponible es: " + cuentaObj.getSaldo());
                System.out.println("Por favor ingrese un monto menor\n");
                this.mostrarMenuRetiro();
            }
            System.out.println("Su nuevo saldo es: "+ cuentaObj.getSaldo());
            this.mostrarMenuPrincipal();
            break;
        case 5:
            montoR = arr1[4];
            Transaccion retiroObj5 = new Retiro(cuentaObj, montoR);
            
            System.out.println("montoR: "+montoR);
            System.out.println(".getSaldo: "+cuentaObj.getSaldo());
            if (montoR <= cuentaObj.getSaldo() ){
                retiroObj5.ejecutar();
                System.out.println("Por favor tome su efectivo\n");
            } else {
                System.out.println("\nSaldo insuficiente");
                System.out.println("Su saldo disponible es: " + cuentaObj.getSaldo());
                System.out.println("Por favor ingrese un monto menor\n");
                this.mostrarMenuRetiro();
            }
            System.out.println("Su nuevo saldo es: "+ cuentaObj.getSaldo());
            this.mostrarMenuPrincipal();
            break;
        default:
            System.out.println("Hasta pronto!");
            break;
        }
    }
}
