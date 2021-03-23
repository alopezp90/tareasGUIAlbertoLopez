/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Alberto Lopez
 */
public class Prueba {
    
    public static void main(String[] args) {
     
        JFrame ventanaPrincipal = new JFrame("Alberto Lopez");

        //Establecemos tamaño y posición
        ventanaPrincipal.setSize(800, 600);
        ventanaPrincipal.setLocationRelativeTo(null);

        //Hacemos visible la ventana
        ventanaPrincipal.setVisible(true);

        //Acción por defecto al pulsar el botón de cierre de la ventana
        ventanaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Establecemos el layout del JFrame
        ventanaPrincipal.setLayout(new BorderLayout());

        //La ventana no se puede redimensionar
        ventanaPrincipal.setResizable(false);
        
        //Creamos los 5 paneles y los añadimos a la ventana
        MiPanel verde = new MiPanel(Color.BLUE);
        verde.getEtiqueta().setText("panel azul al sur");
        ventanaPrincipal.add(verde, BorderLayout.SOUTH);

        MiPanel rojo = new MiPanel(Color.RED);
        rojo.getEtiqueta().setText("panel rojo al este");
        ventanaPrincipal.add(rojo, BorderLayout.EAST);

        MiPanel negro = new MiPanel(Color.GRAY);
        negro.getEtiqueta().setText("panel gris al oeste");
        ventanaPrincipal.add(negro, BorderLayout.WEST);

        MiPanel rosa = new MiPanel(Color.CYAN);
        rosa.getEtiqueta().setText("panel cian al norte");
        ventanaPrincipal.add(rosa, BorderLayout.NORTH);

        MiPanel azul = new MiPanel(Color.YELLOW);
        azul.getEtiqueta().setText("panel amarillo al centro");
        ventanaPrincipal.add(azul, BorderLayout.CENTER);
    }   
}
