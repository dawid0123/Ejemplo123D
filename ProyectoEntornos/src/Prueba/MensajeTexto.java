package Prueba;

public class MensajeTexto extends Mensaje {
    private String contenido;

    public MensajeTexto(Usuario remitente, Usuario destinatario, String contenido) {
        super(remitente, destinatario);
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }
}

