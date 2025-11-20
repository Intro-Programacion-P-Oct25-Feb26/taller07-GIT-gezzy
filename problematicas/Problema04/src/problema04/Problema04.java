/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

/**
 *
 * @author jdavi
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String valores = "";
        int numero = 1;
        int contador = 1;
        int signo = 1;
        double resultado = 1.0;

        while (contador <= 13) {
            contador = contador + 2;
            if (signo % 2 != 0) {
                valores = String.format("%s- %d/%d ", valores, numero, 
                        contador);
                resultado -= 1.0/contador;
            } else {
                valores = String.format("%s+ %d/%d ", valores, numero, 
                        contador);
                resultado += 1.0/contador;
            }
            signo = signo + 1;
        }
        System.out.printf("%d %s = %.3f\n", numero, valores, resultado);
    }
}
