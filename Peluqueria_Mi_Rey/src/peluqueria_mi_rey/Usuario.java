package peluqueria_mi_rey;

import javax.swing.JOptionPane;

public class Usuario {

    private final String usuario = "admin";
    private final String contrasenna = "1234";

    public void iniciarSesion() {
        String usr = JOptionPane.showInputDialog(null, "Usuario: ");
        String pwd = JOptionPane.showInputDialog(null, "Contraseña: ");

        if (usuario.equals(usr) && contrasenna.equals(pwd)) {
            JOptionPane.showMessageDialog(null, "¡Inicio de sesión exitoso! ");
        } else {
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta, inténtelo de nuevo. ");
        }
    }
}
