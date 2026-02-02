package peluqueria_mi_rey;

import javax.swing.JOptionPane;

public class ModuloFacturacion {

    private final Factura[] facturas = new Factura[100];
    private int totalFacturas = 0;
    private final ModuloReservas moduloReservas;

    public ModuloFacturacion(ModuloReservas moduloReservas) {
        this.moduloReservas = moduloReservas;
    }

    public void generarFactura() {
        String nombre = JOptionPane.showInputDialog(null, "Nombre del cliente");
        String cedula = JOptionPane.showInputDialog(null, "Cédula: ");
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Número de reserva: "));
        Reserva r = moduloReservas.buscarReserva(numero);

        if (r == null) {
            JOptionPane.showMessageDialog(null, "Reserva no encontrada. ");
            return;
        }

        Factura f = new Factura(nombre, cedula, r);
        facturas[totalFacturas++] = f;

        JOptionPane.showMessageDialog(null, f.toString());
    }

    public int getTotalFacturas() {
        return totalFacturas;
    }
}
