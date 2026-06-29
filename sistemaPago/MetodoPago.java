package com.practico.sistemaPago;

public interface MetodoPago {
    boolean pagar(double monto);
    String generarRecibo(double monto);
    
}
