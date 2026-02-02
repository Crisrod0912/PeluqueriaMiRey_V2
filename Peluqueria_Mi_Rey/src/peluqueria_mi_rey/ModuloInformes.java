package peluqueria_mi_rey;

import javax.swing.JOptionPane;

public class ModuloInformes {

    private final ModuloReservas reservas;
    private final ModuloFacturacion facturas;

    public ModuloInformes(ModuloReservas r, ModuloFacturacion f) {
        reservas = r;
        facturas = f;
    }

    public void mostrarInformes() {
        JOptionPane.showMessageDialog(null,
                "----- INFORMES -----"
                + "\nTotal de reservas: " + reservas.getTotalReservas()
                + "\nTotal de facturas: " + facturas.getTotalFacturas()
        );
    }
}
