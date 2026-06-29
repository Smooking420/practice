package com.practico.sistemaPago;

public class Main {
    public static void main(String[] args) {

        Cine cine = new Cine();
        cine.agregarEntrada(new Entrada("Superman", 8.50));
        cine.agregarEntrada(new Entrada("Jurassic World", 7.25));
        cine.agregarEntrada(new Entrada("F1",9.00));


        PagoEfectivo pagoEfectivo = new PagoEfectivo(
            "Mateo Gonzalez", 20.00);
    
        PagoTarjeta pagoTarjeta= new PagoTarjeta(
            "1234567891234567","Carlos Camacaro", "375");

       System.out.println("*******Pago en Efectivo*********");
       cine.pagar(pagoEfectivo);

       
       System.out.println("*******Pago en Efectivo*********");
       cine.pagar(pagoTarjeta);     


    }
    
}
