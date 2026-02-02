package peluqueria_mi_rey;

public class Factura {

    private String cliente;
    private String cedula;
    private Reserva reserva;
    private double total;

    public Factura(String cliente, String cedula, Reserva reserva) {
        this.cliente = cliente;
        this.cedula = cedula;
        this.reserva = reserva;
    }

    private void calcularTotal() {
        total = reserva.getAdultos() * 5000
                + reserva.getNinos() * 2500
                + reserva.getAdultosMayores() * 2500;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "----- FACTURA -----"
                + "\nCliente: " + cliente
                + "\nCédul: " + cedula
                + "\nReserva: " + reserva
                + "\nTotal: " + total;
    }
}
