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
    this.dispensadorObj = new Dispensador((500*20));
    //this.dispensadorObj = new Dispensador((200));
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
            pantallObj.mostrarMensaje("\nSu saldo es: Q. " + cuentaObj.getSaldo()+"\n");
            //System.out.println("\nEfectivo en dispensador: Q. " + dispensadorObj.getEfectivoDisponible());
            this.mostrarMenuPrincipal();
            break;
        case 2:
            this.mostrarMenuRetiro();
            //System.out.println("retirar efectivo");
            break;
        case 3:
            //System.out.println("depositar fondos");
            this.mostrarMenuDeposito();
            break;
        default:
            pantallObj.mostrarMensaje("\nHasta pronto!");
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
            
            //System.out.println("montoR: "+montoR);
            //System.out.println(".getSaldo: "+cuentaObj.getSaldo());
            //System.out.println("efectivo en dispensador = "+dispensadorObj.getEfectivoDisponible());
            //if (montoR <= cuentaObj.getSaldo() && dispensadorObj.verificarEfectivo((int) montoR)){
            if (montoR <= cuentaObj.getSaldo()){
                retiroObj.ejecutar();
            //    dispensadorObj.setEfectivoDisponible((int) (dispensadorObj.getEfectivoDisponible() - montoR));
                pantallObj.mostrarMensaje("\nPor favor tome su efectivo\n");
            } else {
                pantallObj.mostrarMensaje("\nSaldo insuficiente");
                pantallObj.mostrarMensaje("\nSu saldo disponible es: " + cuentaObj.getSaldo());
                pantallObj.mostrarMensaje("\nPor favor ingrese un monto menor\n");
                this.mostrarMenuRetiro();
            }
            pantallObj.mostrarMensaje("\nSu nuevo saldo es: "+ cuentaObj.getSaldo()+"\n");
            //System.out.println("Efectivo en dispensador: "+ dispensadorObj.getEfectivoDisponible());
            this.mostrarMenuPrincipal();
            break;
        case 2:
            
            montoR = arr1[1];
            Transaccion retiroObj2 = new Retiro(cuentaObj, montoR);
            
            if (montoR <= cuentaObj.getSaldo()){
                retiroObj2.ejecutar();
                pantallObj.mostrarMensaje("\nPor favor tome su efectivo\n");
            } else {
                pantallObj.mostrarMensaje("\nSaldo insuficiente");
                pantallObj.mostrarMensaje("\nSu saldo disponible es: " + cuentaObj.getSaldo());
                pantallObj.mostrarMensaje("\nPor favor ingrese un monto menor\n");
                this.mostrarMenuRetiro();
            }
            pantallObj.mostrarMensaje("S\nu nuevo saldo es: "+ cuentaObj.getSaldo()+"\n");
            this.mostrarMenuPrincipal();
            break;
        case 3:
            montoR = arr1[2];
            Transaccion retiroObj3 = new Retiro(cuentaObj, montoR);
            
            if (montoR <= cuentaObj.getSaldo()){
                retiroObj3.ejecutar();
                pantallObj.mostrarMensaje("\nPor favor tome su efectivo\n");
            } else {
                pantallObj.mostrarMensaje("\nSaldo insuficiente");
                pantallObj.mostrarMensaje("\nSu saldo disponible es: " + cuentaObj.getSaldo());
                pantallObj.mostrarMensaje("\nPor favor ingrese un monto menor\n");
                this.mostrarMenuRetiro();
            }
            pantallObj.mostrarMensaje("\nSu nuevo saldo es: "+ cuentaObj.getSaldo()+"\n");
            this.mostrarMenuPrincipal();
            break;
        case 4:
            montoR = arr1[3];
            Transaccion retiroObj4 = new Retiro(cuentaObj, montoR);
            
            if (montoR <= cuentaObj.getSaldo()){
                retiroObj4.ejecutar();
                pantallObj.mostrarMensaje("\nPor favor tome su efectivo\n");
            } else {
                pantallObj.mostrarMensaje("\nSaldo insuficiente");
                pantallObj.mostrarMensaje("\nSu saldo disponible es: " + cuentaObj.getSaldo());
                pantallObj.mostrarMensaje("\nPor favor ingrese un monto menor\n");
                this.mostrarMenuRetiro();
            }
            pantallObj.mostrarMensaje("\nSu nuevo saldo es: "+ cuentaObj.getSaldo()+"\n");
            this.mostrarMenuPrincipal();
            break;
        case 5:
            montoR = arr1[4];
            Transaccion retiroObj5 = new Retiro(cuentaObj, montoR);
            
            if (montoR <= cuentaObj.getSaldo()){
                retiroObj5.ejecutar();
                pantallObj.mostrarMensaje("\nPor favor tome su efectivo\n");
            } else {
                pantallObj.mostrarMensaje("\nSaldo insuficiente");
                pantallObj.mostrarMensaje("\nSu saldo disponible es: " + cuentaObj.getSaldo());
                pantallObj.mostrarMensaje("\nPor favor ingrese un monto menor\n");
                this.mostrarMenuRetiro();
            }
            pantallObj.mostrarMensaje("\nSu nuevo saldo es: "+ cuentaObj.getSaldo()+"\n");
            this.mostrarMenuPrincipal();
            break;
        default:
            pantallObj.mostrarMensaje("\nHasta pronto!");
            break;
        }
    }
    
    private void mostrarMenuDeposito(){
        pantallObj.mostrarMensaje("\nPor favor ingrese un monto de deposito o escriba 0 para cancelar\n");
        int opcionDeposito = tecladoNumericoObj.capturarDatos();
        
    }
}
