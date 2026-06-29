package com.practico.sistemaPago;

public class PagoTarjeta implements MetodoPago{

    private String numeroTarjeta;
    private String titular;
    private String cvv;

    public PagoTarjeta(String numeroTarjeta,String titular, String cvv){
        this.numeroTarjeta=numeroTarjeta;
        this.titular=titular;
        this.cvv=cvv;
    }


    @Override
    public boolean pagar(double monto) {
        if(validarTarjeta()){
            System.out.println("Pago con tarjeta aprobado");
            return true; 
        }
        System.out.println("Tarjeta invalida");
        return false;

    }

    @Override
    public String generarRecibo(double monto) {
        return "********** RECIBO ***********\n"
                + "Cliente: " + titular + "\n"
                + "Metodo: Tarjeta\n"
                + "Total: $ " + monto + "\n"
                + "Gracias por su compra";
    }

    public boolean validarTarjeta(){
        if(numeroTarjeta.length()==16 && cvv.length() == 3){
            System.out.println("Su tarjeta no es valida");
            return true;
        }
        System.out.println("Su tarteja ha sido validada");
        return false;
    }
}
