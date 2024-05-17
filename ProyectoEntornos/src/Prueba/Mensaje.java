package Prueba;

/**
 * Representa un mensaje genérico enviado entre usuarios.
 */
public abstract class Mensaje {
    private Usuario remitente;
    private Usuario destinatario;

    /**  
     * Crea una nueva instancia de Mensaje.
     *
     * @param remitente el usuario que envía el mensaje
     * @param destinatario el usuario que recibe el mensaje
     */
    public Mensaje(Usuario remitente, Usuario destinatario) {
        this.remitente = remitente;
        this.destinatario = destinatario;
    }

    /**
     * Obtiene el remitente del mensaje.
     *
     * @return el usuario remitente
     */
    public Usuario getRemitente() {
        return remitente;
    }

    /**
     * Obtiene el destinatario del mensaje.
     *
     * @return el usuario destinatario
     */
    public Usuario getDestinatario() {
        return destinatario;
    }
}

