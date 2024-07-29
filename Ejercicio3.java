/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SenaTarde
 */
import javax.swing.JOptionPane;
public class Ejercicio3 {
    
    public static void main(String[] args) {
        int cantidadNumeros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de números a sumar:"));
        int suma = 0;

        for (int i = 1; i <= cantidadNumeros; i++) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número " + i + ":"));
            suma += numero;
        }

        JOptionPane.showMessageDialog(null, "La suma total es: " + suma);
    }
}

