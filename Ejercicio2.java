/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SenaTarde
 */
import javax.swing.JOptionPane;

public class Ejercicio2 {
    public static void main(String[] args) {
        int ancho, alto;

        do {
            ancho = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ancho del rectángulo (valor positivo):"));
        } while (ancho <= 0);

        do {
            alto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el alto del rectángulo (valor positivo):"));
        } while (alto <= 0);

        int area = ancho * alto;

        JOptionPane.showMessageDialog(null, "El área de su rectángulo es: " + area + " cm²");
    }
}