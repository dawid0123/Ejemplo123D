package Prueba;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa un usuario con un número de teléfono, tipo, rol de administrador, 
 * y listas de contactos y mensajes.  
 */
public class Usuario {
    private String numeroTelefono;
    private String tipo;
    private boolean esAdmin;
    private List<Contacto> contactos;
    private List<Mensaje> mensajesEnviados;
    private List<Mensaje> mensajesRecibidos;

    /**
     * Crea una nueva instancia de Usuario.
     *
     * @param numeroTelefono el número de teléfono del usuario
     * @param tipo el tipo de usuario
     * @param esAdmin indica si el usuario es administrador
     */
    public Usuario(String numeroTelefono, String tipo, boolean esAdmin) {
        this.numeroTelefono = numeroTelefono;
        this.tipo = tipo;
        this.esAdmin = esAdmin;
        this.contactos = new ArrayList<>();
        this.mensajesEnviados = new ArrayList<>();
        this.mensajesRecibidos = new ArrayList<>();
    }

    /**
     * Obtiene el número de teléfono del usuario.
     *
     * @return el número de teléfono del usuario
     */
    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    /**
     * Obtiene el tipo de usuario.
     *
     * @return el tipo de usuario
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Verifica si el usuario es administrador.
     *
     * @return true si el usuario es administrador, false en caso contrario
     */
    public boolean esAdmin() {
        return esAdmin;
    }

    /**
     * Agrega un contacto a la lista de contactos del usuario.
     *
     * @param contacto el contacto a agregar
     */
    public void agregarContacto(Contacto contacto) {
        contactos.add(contacto);
    }

    /**
     * Envía un mensaje a otro usuario.
     *
     * @param destinatario el usuario destinatario del mensaje
     * @param mensaje el mensaje a enviar
     */
    public void enviarMensaje(Usuario destinatario, Mensaje mensaje) {
        destinatario.recibirMensaje(mensaje);
        mensajesEnviados.add(mensaje);
    }

    /**
     * Obtiene la lista de mensajes enviados por el usuario.
     *
     * @return la lista de mensajes enviados
     */
    public List<Mensaje> verMensajesEnviados() {
        return mensajesEnviados;
    }

    /**
     * Obtiene la lista de mensajes recibidos por el usuario.
     *
     * @return la lista de mensajes recibidos
     */
    public List<Mensaje> verMensajesRecibidos() {
        return mensajesRecibidos;
    }

    /**
     * Obtiene la lista de mensajes recibidos de un emisor específico.
     *
     * @param emisor el usuario emisor de los mensajes
     * @return la lista de mensajes recibidos del emisor
     */
    public List<Mensaje> verMensajesRecibidosDeEmisor(Usuario emisor) {
        List<Mensaje> mensajes = new ArrayList<>();
        for (Mensaje mensaje : mensajesRecibidos) {
            if (mensaje.getRemitente().equals(emisor)) {
                mensajes.add(mensaje);
            }
        }
        return mensajes;
    }

    /**
     * Obtiene la lista de contactos del usuario.
     *
     * @return la lista de contactos
     */
    public List<Contacto> verListaContactos() {
        return contactos;
    }

    /**
     * Recibe un mensaje y lo agrega a la lista de mensajes recibidos.
     *
     * @param mensaje el mensaje a recibir*/
    private void recibirMensaje(Mensaje mensaje) {
        mensajesRecibidos.add(mensaje);
    }     
}
