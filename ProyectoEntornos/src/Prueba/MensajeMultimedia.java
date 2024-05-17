package Prueba;

/**
 * Representa un mensaje multimedia enviado entre usuarios.
 */
public class MensajeMultimedia extends Mensaje {
    private String nombreArchivo;
    private int tamaño;

    /**
     * Crea una nueva instancia de MensajeMultimedia.  
     *
     * @param remitente el usuario que envía el mensaje
     * @param destinatario el usuario que recibe el mensaje
     * @param nombreArchivo el nombre del archivo multimedia
     * @param tamaño el tamaño del archivo multimedia en bytes
     */
    public MensajeMultimedia(Usuario remitente, Usuario destinatario, String nombreArchivo, int tamaño) {
        super(remitente, destinatario);
        this.nombreArchivo = nombreArchivo;
        this.tamaño = tamaño;
    }

    /**
     * Obtiene el nombre del archivo multimedia.
     *
     * @return el nombre del archivo
     */
    public String getNombreArchivo() {
        return nombreArchivo;
    }

    /**
     * Obtiene el tamaño del archivo multimedia.
     *
     * @return el tamaño del archivo en bytes
     */
    public int getTamaño() {
        return tamaño;
    }
}