package Junit;

import org.junit.Before;
import org.junit.Test;

import Prueba.AgendaMovil;
import Prueba.Contacto;
import Prueba.Mensaje;
import Prueba.MensajeMultimedia;
import Prueba.MensajeTexto;
import Prueba.Usuario;

import static org.junit.Assert.*;

import java.util.List;
 
public class AgendaMovilTest {

    private AgendaMovil agenda;
    private Usuario usuario1;
    private Usuario usuario2;

    @Before
    public void setUp() {
        agenda = new AgendaMovil();
        usuario1 = new Usuario("123456789", "normal", false);
        usuario2 = new Usuario("987654321", "admin", true);
        agenda.agregarUsuario(usuario1);
        agenda.agregarUsuario(usuario2);
    }

    @Test
    public void testAgregarUsuario() {
        Usuario usuario3 = new Usuario("555555555", "normal", false);
        agenda.agregarUsuario(usuario3);
        assertEquals(usuario3, agenda.buscarUsuarioPorNumero("555555555"));
    }

    @Test
    public void testBuscarUsuarioPorNumero() {
        Usuario encontrado = agenda.buscarUsuarioPorNumero("123456789");
        assertNotNull(encontrado);
        assertEquals(usuario1, encontrado);
    }

    @Test
    public void testAgregarContacto() {
        Contacto contacto = new Contacto("111111111", "Alice");
        usuario1.agregarContacto(contacto);
        assertEquals(1, usuario1.verListaContactos().size());
        assertEquals(contacto, usuario1.verListaContactos().get(0));
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
    public void testVerMensajesComoAdmin() {
        MensajeTexto mensajeTexto = new MensajeTexto(usuario1, usuario2, "Hola, ¿cómo estás?");
        usuario1.enviarMensaje(usuario2, mensajeTexto);
        List<Mensaje> mensajesUsuario1 = usuario1.verMensajesEnviados();
        assertEquals(1, mensajesUsuario1.size());
        assertEquals(mensajeTexto, mensajesUsuario1.get(0));
    }
}
