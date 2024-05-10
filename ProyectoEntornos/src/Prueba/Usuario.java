package Prueba;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	private String numeroTelefono;
    private String tipo;
    private List<Contacto> contactos;
    private List<Mensaje> mensajesEnviados;
    private List<Mensaje> mensajesRecibidos;

    public Usuario(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        this.contactos = new ArrayList<>();
        this.mensajesEnviados = new ArrayList<>();
        this.mensajesRecibidos = new ArrayList<>();
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public String getTipo() {
        return tipo;
    }

    public void agregarContacto(Contacto contacto) {
        contactos.add(contacto);
    }

    public void enviarMensaje(Usuario destinatario, Mensaje mensaje) {
        destinatario.recibirMensaje(mensaje);
        mensajesEnviados.add(mensaje);
    }

    public List<Mensaje> verMensajesEnviados() {
        return mensajesEnviados;
    }

    public List<Mensaje> verMensajesRecibidos() {
        return mensajesRecibidos;
    }

    public List<Mensaje> verMensajesRecibidosDeEmisor(Usuario emisor) {
        List<Mensaje> mensajes = new ArrayList<>();
        for (Mensaje mensaje : mensajesRecibidos) {
            if (mensaje.getRemitente().equals(emisor)) {
                mensajes.add(mensaje);
            }
        }
        return mensajes;
    }

    public List<Contacto> verListaContactos() {
        return contactos;
    }

    public void recibirMensaje(Mensaje mensaje) {
        mensajesRecibidos.add(mensaje);
    }
		
		

}
	
	
