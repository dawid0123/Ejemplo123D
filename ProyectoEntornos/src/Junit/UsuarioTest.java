package Junit;

import static org.junit.Assert.*;
import org.junit.Test;

import Prueba.Contacto;
import Prueba.MensajeTexto;
import Prueba.Usuario;

public class UsuarioTest {

    @Test
    public void testAgregarContacto() {
        Usuario usuario = new Usuario("123456789");
        Contacto contacto = new Contacto("987654321", "Amigo");
        usuario.agregarContacto(contacto);
        assertTrue(usuario.verListaContactos().contains(contacto));
    }

    @Test
    public void testEnviarMensaje() {
        Usuario remitente = new Usuario("123456789");
        Usuario destinatario = new Usuario("987654321");
        MensajeTexto mensaje = new MensajeTexto(remitente, destinatario, "Hola");
        remitente.enviarMensaje(destinatario, mensaje);
        assertTrue(remitente.verMensajesEnviados().contains(mensaje));
        assertTrue(destinatario.verMensajesRecibidos().contains(mensaje));
    }

    @Test
    public void testVerMensajesRecibidosDeEmisor() {
        Usuario remitente = new Usuario("123456789");
        Usuario destinatario = new Usuario("987654321");
        MensajeTexto mensaje1 = new MensajeTexto(remitente, destinatario, "Mensaje 1");
        MensajeTexto mensaje2 = new MensajeTexto(remitente, destinatario, "Mensaje 2");
        destinatario.recibirMensaje(mensaje1);
        destinatario.recibirMensaje(mensaje2);
        assertEquals(2, destinatario.verMensajesRecibidosDeEmisor(remitente).size());
    }
}

