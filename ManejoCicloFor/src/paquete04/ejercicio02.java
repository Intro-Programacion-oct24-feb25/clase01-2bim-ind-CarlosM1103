/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author utpl
 */
public class ejercicio02 {

    public static void main(String[] args) {
        
        int contador=0;
        for(double gradosF = 20;contador < 21; gradosF+=4 ){
            double operacion = 5.0/9*(gradosF-32);
            String cadena = String.format("%.2f", operacion);
            System.out.println("Operacion"+"("+contador+")"+ "Fahrenheit: " + gradosF
            + "===>" + "Celcius:" + cadena );
            contador++;
    }
}
}