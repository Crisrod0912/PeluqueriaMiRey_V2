package peluqueria_mi_rey;

import javax.swing.JOptionPane;

public class ModuloReservas {

    private final Reserva[] reservas = new Reserva[100];
    private int totalReservas = 0;
    private final int contadorReservas = 1;

    private final String[] horarios = {
        "8:00", "8:30", "9:00", "9:30", "10:00", "10:30",
        "11:00", "11:30", "12:00", "12:30",
        "1:00", "1:30", "2:00", "2:30",
        "3:00", "3:30", "4:00", "4:30",
        "5:00", "5:30"
    };

    private final int[] cupos = new int[horarios.length];

    public void crearReserva() {
        String nombre = JOptionPane.showInputDialog(null, "Nombre del cliente: ");
        int personas = Integer.parseInt(JOptionPane.showInputDialog(null, "Cantidad de personas: "));
        int ninos = Integer.parseInt(JOptionPane.showInputDialog(null, "Cantidad de niños: "));
        int adultosMayores = Integer.parseInt(JOptionPane.showInputDialog(null, "Cantidad de adultos mayores: "));
        int adultos = personas - ninos - adultosMayores;

        String mensaje = "Seleccione un horario: \n";
        for (int i = 0; i < horarios.length; i++) {
            mensaje += (i + 1) + ". " + horarios[i] + "\n";
        }

        int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje)) - 1;

        if (cupos[opcion] + personas > 3) {
            JOptionPane.showMessageDialog(null, "No hay espacio disponible para este horario, seleccione uno diferente. ");
            return;
        }

        cupos[opcion] += personas;

        String peluquero = "Peluquero " + ((totalReservas % 3) + 1);

        Reserva r = new Reserva(
                nombre,
                horarios[opcion],
                ninos,
                adultos,
                adultosMayores,
                peluquero,
                contadorReservas
        );

        reservas[totalReservas++] = r;

        JOptionPane.showMessageDialog(null, r.toString());
    }

    public Reserva buscarReserva(int numero) {
        for (int i = 0; i < totalReservas; i++) {
            if (reservas[i].getNumeroReserva() == numero) {
                return reservas[i];
            }
        }
        return null;
    }

    public int getTotalReservas() {
        return totalReservas;
    }

    public Reserva[] getReserva() {
        return reservas;
    }
}
