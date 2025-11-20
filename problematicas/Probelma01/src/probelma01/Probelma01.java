/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package probelma01;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author jdavi
 */
public class Probelma01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String jugador_nombre;
        String posicion;
        String edades = "";
        String mensaje = "";
        int edad;
        double altura;
        double suma_edades = 0;
        double suma_alturas = 0;
        double promedio_edad;
        double promedio_altura;
        int contador = 1;

        while (contador <= 5) {
            System.out.println("Ingrese el nombre del jugador:");
            jugador_nombre = entrada.nextLine();
            System.out.println("Ingrese su posicion en la cancha:");
            posicion = entrada.nextLine();
            System.out.println("Ingrese la edad del jugador:");
            edad = entrada.nextInt();
            System.out.println("Ingrese la altura del jugador:");
            altura = entrada.nextDouble();
            entrada.nextLine();
            suma_edades = suma_edades + edad;
            suma_alturas = suma_alturas + altura;
            mensaje = String.format("%s%d. %s -%s-, edad %d, estatura %.2f\n",
                    mensaje, contador, jugador_nombre, posicion, edad, altura);
            edades = String.format("%s%d\n", edades, edad);
            contador = contador + 1;
        }
        promedio_edad = suma_edades / 5.0;
        promedio_altura = suma_alturas / 5.0;
        System.out.printf("Listado de Jugadores\n"
                + "%s"
                + "Listado de edades\n"
                + "%s"
                + "Promedio de edades: %.1f\n"
                + "Promedio de estaturas: %.2f\n", mensaje, edades,
                promedio_edad, promedio_altura);
    }
}
