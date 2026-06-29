package com.practico.sistemaPago;

public class Entrada {

    private String pelicula;
    private double precio;

    public Entrada(String pelicula, double precio){
        this.pelicula=pelicula;
        this.precio=precio;
    }

    public String getPelicula(){
        return pelicula;
    }

    public double getPrecio(){
        return precio;
    }

}
