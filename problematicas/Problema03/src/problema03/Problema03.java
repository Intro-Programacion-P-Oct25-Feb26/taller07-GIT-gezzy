/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

/**
 *
 * @author jdavi
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String mensaje = "";
        int numero = 2;
        int contador = 3;

        while (numero <= 37) {
            mensaje = String.format("%s%d\n", mensaje, numero);
            numero = numero + contador;
            contador = contador + 2;
        }
        System.out.printf("%s", mensaje);
    }
}