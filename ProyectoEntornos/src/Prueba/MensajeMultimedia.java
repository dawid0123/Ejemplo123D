package Prueba;

public class MensajeMultimedia extends Mensaje {
    private String nombreArchivo;
    private int tamaño;

    public MensajeMultimedia(Usuario remitente, Usuario destinatario, String nombreArchivo, int tamaño) {
        super(remitente, destinatario);
        this.nombreArchivo = nombreArchivo;
        this.tamaño = tamaño;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public int getTamaño() {
        return tamaño;
    }
}
