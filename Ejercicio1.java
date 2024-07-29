/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SenaTarde
 */
import javax.swing.JOptionPane;
public class Ejercicio1 {
    
    public static void main(String[] args) {

     int n1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer digito que desea sumar"));
     int n2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo digito que desea sumar"));
  
     
     int suma = n1+n2;
     
     JOptionPane.showMessageDialog(null, "La Suma De Ambos Digitos Es " +suma);
     
        if (suma > 20) {
            JOptionPane.showMessageDialog(null, "La suma No Cumple con los requisitos, la suma supera el limite");
        } else{
            JOptionPane.showMessageDialog(null, "La Suma De Ambos Digitos cumple con los requisitos");
        }
   
  }

}
