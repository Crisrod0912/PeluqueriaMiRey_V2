package peluqueria_mi_rey;

public class Reserva {

    private String nombreCliente;
    private String horario;
    private int ninos;
    private int adultos;
    private int adultosMayores;
    private String peluquero;
    private int numeroReserva;

    public Reserva(String nombreCliente, String horario, int ninos, int adultos, int adultosMayores, String peluquero, int numeroReserva) {
        this.nombreCliente = nombreCliente;
        this.horario = horario;
        this.ninos = ninos;
        this.adultos = adultos;
        this.adultosMayores = adultosMayores;
        this.peluquero = peluquero;
        this.numeroReserva = numeroReserva;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getNinos() {
        return ninos;
    }

    public void setNinos(int ninos) {
        this.ninos = ninos;
    }

    public int getAdultos() {
        return adultos;
    }

    public void setAdultos(int adultos) {
        this.adultos = adultos;
    }

    public int getAdultosMayores() {
        return adultosMayores;
    }

    public void setAdultosMayores(int adultosMayores) {
        this.adultosMayores = adultosMayores;
    }

    public String getPeluquero() {
        return peluquero;
    }

    public void setPeluquero(String peluquero) {
        this.peluquero = peluquero;
    }

    public int getNumeroReserva() {
        return numeroReserva;
    }

    public void setNumeroReserva(int numeroReserva) {
        this.numeroReserva = numeroReserva;
    }

    public int getTotalPersonas() {
        return ninos + adultos + adultosMayores;
    }

    @Override
    public String toString() {
        return "Reserva #" + numeroReserva
                + "\nCliente: " + nombreCliente
                + "\nHorario: " + horario
                + "\nPeluquero: " + peluquero
                + "\nAdultos: " + adultos
                + "\nNiños: " + ninos
                + "\nAdultos Mayores: " + adultosMayores
                + "\nTotal de personas: " + getTotalPersonas();
    }
}
