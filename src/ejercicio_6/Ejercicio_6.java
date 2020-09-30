package ejercicio_6;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 6. Recoger por teclado el precio de un producto que introduzca el usuario,
 * (puede contener decimales) calcular el IVA (21%) y añadirlo al precio final
 * del producto.
 *
 */
public class Ejercicio_6 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float precio;
        final float iva = 0.21f;
        float resultado;
        //DecimalFormat redondea el numero de decimales del resultado. 
        //En este caso, redondea a dos decimales.
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.print("Introduzca el precio del producto: ");
        precio = teclado.nextFloat();
        resultado = precio + (precio * iva);
        System.out.println("Base imponible: " + precio + "€" + "\nI.V.A: 0.21%"
                + "\nTotal: " + df.format(resultado) + "€");
    }

}
