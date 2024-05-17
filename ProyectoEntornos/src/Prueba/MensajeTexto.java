package Prueba;

/**
 * Representa un mensaje de texto enviado entre usuarios.
 */
public class MensajeTexto extends Mensaje {
    private String contenido;

    /**
     * Crea una nueva instancia de MensajeTexto.  
     *
     * @param remitente el usuario que envía el mensaje
     * @param destinatario el usuario que recibe el mensaje
     * @param contenido el contenido del mensaje de texto
     */
    public MensajeTexto(Usuario remitente, Usuario destinatario, String contenido) {
        super(remitente, destinatario);
        this.contenido = contenido;
    }

    /**
     * Obtiene el contenido del mensaje de texto.
     *
     * @return el contenido del mensaje
     */
    public String getContenido() {
        return contenido;
    }
}
