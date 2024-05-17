package Junit;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import Prueba.Contacto;
import Prueba.Mensaje;
import Prueba.MensajeMultimedia;
import Prueba.MensajeTexto;
import Prueba.Usuario;

import java.util.List;

public class AgendaMovilTest {
    private Usuario usuario1;
    private Usuario usuario2;

    @Before
    public void setUp() {
        usuario1 = new Usuario("123456789", null, false);
        usuario2 = new Usuario("987654321", null, false);
    }

    @Test
    public void testAgregarContacto() {
        Contacto contacto = new Contacto("111111111", "Alice");
        usuario1.agregarContacto(contacto);
        List<Contacto> contactos = usuario1.verListaContactos();
        assertEquals(1, contactos.size());
        assertEquals("Alice", contactos.get(0).getNombre());
    }

    @Test
    public void testEnviarMensajeTexto() {
        MensajeTexto mensajeTexto = new MensajeTexto(usuario1, usuario2, "Hola, ¿cómo estás?");
        usuario1.enviarMensaje(usuario2, mensajeTexto);
        assertEquals(1, usuario2.verMensajesRecibidos().size());
        assertEquals(mensajeTexto, usuario2.verMensajesRecibidos().get(0));
    }

    @Test
    public void testEnviarMensajeMultimedia() {
        MensajeMultimedia mensajeMultimedia = new MensajeMultimedia(usuario2, usuario1, "imagen.jpg", 2048);
        usuario2.enviarMensaje(usuario1, mensajeMultimedia);
        assertEquals(1, usuario1.verMensajesRecibidos().size());
        assertEquals(mensajeMultimedia, usuario1.verMensajesRecibidos().get(0));
    }

    @Test
    public void testVerMensajesEnviados() {
        MensajeTexto mensajeTexto = new MensajeTexto(usuario1, usuario2, "Hola, ¿cómo estás?");
        usuario1.enviarMensaje(usuario2, mensajeTexto);
        List<Mensaje> mensajesEnviados = usuario1.verMensajesEnviados();
        assertEquals(1, mensajesEnviados.size());
        assertEquals(mensajeTexto, mensajesEnviados.get(0));
    }

    @Test
    public void testVerMensajesRecibidos() {
        MensajeTexto mensajeTexto = new MensajeTexto(usuario1, usuario2, "Hola, ¿cómo estás?");
        usuario1.enviarMensaje(usuario2, mensajeTexto);
        List<Mensaje> mensajesRecibidos = usuario2.verMensajesRecibidos();
        assertEquals(1, mensajesRecibidos.size());
        assertEquals(mensajeTexto, mensajesRecibidos.get(0));
    }

    @Test
    public void testVerMensajesRecibidosDeEmisor() {
        MensajeTexto mensajeTexto = new MensajeTexto(usuario1, usuario2, "Hola, ¿cómo estás?");
        usuario1.enviarMensaje(usuario2, mensajeTexto);
        List<Mensaje> mensajesRecibidosDeUsuario1 = usuario2.verMensajesRecibidosDeEmisor(usuario1);
        assertEquals(1, mensajesRecibidosDeUsuario1.size());
        assertEquals(mensajeTexto, mensajesRecibidosDeUsuario1.get(0));
    }
}
