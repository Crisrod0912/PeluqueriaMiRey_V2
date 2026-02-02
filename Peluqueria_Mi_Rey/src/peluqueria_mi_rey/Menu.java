package peluqueria_mi_rey;

import javax.swing.JOptionPane;

public class Menu {

    private final ModuloReservas moduloReservas = new ModuloReservas();
    private final ModuloFacturacion moduloFacturacion = new ModuloFacturacion(moduloReservas);
    private final ModuloInformes moduloInformes = new ModuloInformes(moduloReservas, moduloFacturacion);

    public void mostrarMenu() {
        int opcion;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    """
                    PELUQUERÍA MI REY \n
                    1. Inicio de sesión
                    2. Reservas
                    3. Facturación
                    4. Informes
                    5. Salir
                    """
            ));

            switch (opcion) {
                case 1 ->
                    new Usuario().iniciarSesion();
                case 2 ->
                    moduloReservas.crearReserva();
                case 3 ->
                    moduloFacturacion.generarFactura();
                case 4 ->
                    moduloInformes.mostrarInformes();
                case 5 ->
                    JOptionPane.showMessageDialog(null, "Gracias por utilizar el sistema. ¡Nos vemos pronto! ");
                default ->
                    JOptionPane.showMessageDialog(null, "Opción inválida, inténtelo de nuevo. ");
            }
        } while (opcion != 5);
    }
}
