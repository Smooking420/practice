package com.practico.sistemaPago;

public class Cine {

    private Entrada[] entradas;
    private int cantidadEntradas;

    public Cine(){
        entradas = new Entrada[10];
        cantidadEntradas = 0;
    }

    public void agregarEntrada(Entrada entrada){
        if(cantidadEntradas<entradas.length){
            entradas[cantidadEntradas]=entrada;
            cantidadEntradas++;
        }else{
            System.out.println("No hay espacio para mas entradas");
        }

    }

    public double calcularTotal(){
        double total = 0;
        for(int i=0; i<cantidadEntradas;i++){
            total += entradas[i].getPrecio();
        }
        return total;
    }

    public void pagar(MetodoPago metodoPago){
        double total = calcularTotal();
        if(metodoPago.pagar(total))
        System.out.println(metodoPago.generarRecibo(total));
    }
}
