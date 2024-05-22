package Jframe;



import javax.swing.*;

import Prueba.Usuario;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * La clase MainFrame extiende JFrame y crea una ventana para ingresar datos de usuario.
 * Al hacer clic en el botón, se captura y muestra la información ingresada.
 */
public class Jfrane extends JFrame {

    private JTextField numeroTelefonoField;
    private JComboBox<String> tipoUsuarioComboBox;

    /**
     * Constructor para la clase MainFrame.
     * Configura la ventana y agrega los componentes de entrada de datos.
     */
    public Jfrane() {
        // Configurar el título de la ventana
        setTitle("Ingreso de Datos del Usuario");

        // Configurar el tamaño de la ventana
        setSize(400, 200);

        // Configurar la operación de cierre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear etiquetas y campos de entrada
        JLabel numeroTelefonoLabel = new JLabel("Número de Teléfono:");
        numeroTelefonoField = new JTextField(20);

        JLabel tipoUsuarioLabel = new JLabel("Tipo de Usuario:");
        tipoUsuarioComboBox = new JComboBox<>(new String[] {"normal", "admin"});

        // Crear un botón
        JButton submitButton = new JButton("Enviar");

        // Agregar un ActionListener al botón
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleSubmit();
            }
        });

        // Crear un panel y agregar componentes
        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(numeroTelefonoLabel);
        panel.add(numeroTelefonoField);
        panel.add(tipoUsuarioLabel);
        panel.add(tipoUsuarioComboBox);
        panel.add(submitButton);

        // Agregar el panel al contenido de la ventana
        getContentPane().add(panel, BorderLayout.CENTER);
    }

    /**
     * Maneja el evento de clic del botón "Enviar".
     * Captura los datos ingresados y realiza una operación con ellos.
     */
    private void handleSubmit() {
        // Capturar los datos ingresados
        String numeroTelefono = numeroTelefonoField.getText();
        String tipoUsuario = (String) tipoUsuarioComboBox.getSelectedItem();

        // Realizar alguna operación con los datos capturados
        // Aquí simplemente los mostramos en la consola
        System.out.println("Número de Teléfono: " + numeroTelefono);
        System.out.println("Tipo de Usuario: " + tipoUsuario);

        // Crear un usuario con los datos capturados
        Usuario usuario = new Usuario(numeroTelefono, tipoUsuario, rootPaneCheckingEnabled);
        usuario.esAdmin(tipoUsuario);

        // Mostrar un mensaje de confirmación
        JOptionPane.showMessageDialog(this, "Usuario creado: " + numeroTelefono + " (" + tipoUsuario + ")");
    }
 
    
    /**
     * Método principal que crea una instancia de MainFrame y la hace visible.
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        // Crear la ventana en el hilo de eventos de Swing
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Crear una instancia de MainFrame
            	Jfrane frame = new Jfrane();

                // Hacer visible la ventana
                frame.setVisible(true);
            }
        });
    }

}

