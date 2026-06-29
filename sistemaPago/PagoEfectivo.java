package com.practico.sistemaPago;

public class PagoEfectivo implements MetodoPago{

    private String nombreCliente;
    private double dineroEntregado;

    public PagoEfectivo(String nombreCliente, double dineroEntregado){
        this.nombreCliente=nombreCliente;
        this.dineroEntregado=dineroEntregado;
    }
    
    @Override
    public boolean pagar(double monto) {
        if(dineroEntregado>=monto){
            System.out.println("Pago realizado en efectivo");
            return true;
        }
        System.out.print("Dinero insuficiente");
        return false;
    }

    @Override
    public String generarRecibo(double monto) {
        return "********** RECIBO ***********\n"
                + "Cliente: " + nombreCliente + "\n"
                + "Metodo: Efectivo\n"
                + "Total: $ " + monto + "\n"
                + "Gracias por su compra";
    }
    

}
