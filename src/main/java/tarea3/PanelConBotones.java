package tarea3;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * @author Alberto López Puertas
 * <https://github.com/alopezp90>
 */
// Se implementa la interfaz
public class PanelConBotones extends JPanel {

    private JButton botonNombre, botonApellidos, botonAleatorio;
    private JTextArea texto;
    private JLabel numero;

    private static Random rd = new Random();

    public PanelConBotones() {
        initComponents();
    }

    private void initComponents() {

        botonNombre = new JButton("Nombre");
        botonApellidos = new JButton("Apellidos");

        texto = new JTextArea(1, 25);
        texto.setBackground(Color.ORANGE);

        this.setLayout(new FlowLayout());

        this.add(botonNombre);
        this.add(botonApellidos);
        this.add(texto);

        // Gestionamos los ActionLIstener mediante clases anonimas
        // Clase anónima (sin nombre) anidada (dentro de un método)
        botonNombre.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texto.setBackground(Color.white);
                texto.setText("Alberto");
            }
        });

        botonApellidos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texto.setBackground(Color.cyan); //con fondo azul no se ve bien el texto
                texto.setText("Lopez Puertas");
            }
        });

        botonAleatorio = new JButton("Generar Aleatorio");
        numero = new JLabel("Numero");

        this.add(botonAleatorio);
        this.add(numero);

        botonAleatorio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                numero.setText(String.valueOf(rd.nextInt(11)));
            }
        });

        botonAleatorio.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
            }

            @Override
            public void mousePressed(MouseEvent me) {
            }

            @Override
            public void mouseReleased(MouseEvent me) {
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                botonAleatorio.setBackground(Color.pink);
            }

            @Override
            public void mouseExited(MouseEvent me) {
                botonAleatorio.setBackground(null);
            }
        });
    }

    public static void main(String[] args) {
        // Construimos la ventana
        JFrame frame = new JFrame("Ventana Alberto Lopez Puertas");

        // La ventana no se puede redimensionar
        frame.setResizable(false);

        // Posición de la ventana
        frame.setLocationRelativeTo(null);

        // Incluimos el panel en la ventana
        frame.add(new PanelConBotones());

        // Ajusta el frame al contenido
        frame.pack();

        // Hacemos visible la ventana
        frame.setVisible(true);

        //Acción por defecto al pulsar el botón de cierre de la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
