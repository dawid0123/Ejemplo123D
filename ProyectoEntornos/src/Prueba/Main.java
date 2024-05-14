package Prueba;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear la agenda móvil
        AgendaMovil agendaMovil = new AgendaMovil();

        // Crear usuarios
        Usuario usuario1 = new Usuario("123456789", "normal", false);
        Usuario usuario2 = new Usuario("987654321", "admin", true);

        // Agregar usuarios a la agenda
        agendaMovil.agregarUsuario(usuario1);
        agendaMovil.agregarUsuario(usuario2);

        // Crear contactos
        Contacto contacto1 = new Contacto("111111111", "Alice");
        Contacto contacto2 = new Contacto("222222222", "Bob");

        // Agregar contactos a usuario1
        usuario1.agregarContacto(contacto1);
        usuario1.agregarContacto(contacto2);

        // Enviar mensajes
        MensajeTexto mensajeTexto = new MensajeTexto(usuario1, usuario2, "Hola, ¿cómo estás?");
        usuario1.enviarMensaje(usuario2, mensajeTexto);

        MensajeMultimedia mensajeMultimedia = new MensajeMultimedia(usuario2, usuario1, "imagen.jpg", 2048);
        usuario2.enviarMensaje(usuario1, mensajeMultimedia);

        // Ver mensajes enviados por usuario1
        List<Mensaje> mensajesEnviadosUsuario1 = usuario1.verMensajesEnviados();
        System.out.println("Mensajes enviados por Usuario 1:");
        for (Mensaje mensaje : mensajesEnviadosUsuario1) {
            if (mensaje instanceof MensajeTexto) {
                System.out.println("Texto: " + ((MensajeTexto) mensaje).getContenido());
            } else if (mensaje instanceof MensajeMultimedia) {
                System.out.println("Multimedia: " + ((MensajeMultimedia) mensaje).getNombreArchivo());
            }
        }

        // Ver mensajes recibidos por usuario1
        List<Mensaje> mensajesRecibidosUsuario1 = usuario1.verMensajesRecibidos();
        System.out.println("\nMensajes recibidos por Usuario 1:");
        for (Mensaje mensaje : mensajesRecibidosUsuario1) {
            if (mensaje instanceof MensajeTexto) {
                System.out.println("Texto: " + ((MensajeTexto) mensaje).getContenido());
            } else if (mensaje instanceof MensajeMultimedia) {
                System.out.println("Multimedia: " + ((MensajeMultimedia) mensaje).getNombreArchivo());
            }
        }

        // Ver mensajes recibidos de usuario1 por usuario2
        List<Mensaje> mensajesRecibidosDeUsuario1 = usuario2.verMensajesRecibidosDeEmisor(usuario1);
        System.out.println("\nMensajes recibidos por Usuario 2 de Usuario 1:");
        for (Mensaje mensaje : mensajesRecibidosDeUsuario1) {
            if (mensaje instanceof MensajeTexto) {
                System.out.println("Texto: " + ((MensajeTexto) mensaje).getContenido());
            } else if (mensaje instanceof MensajeMultimedia) {
                System.out.println("Multimedia: " + ((MensajeMultimedia) mensaje).getNombreArchivo());
            }
        }

        // Ver lista de contactos de usuario1
        List<Contacto> contactosUsuario1 = usuario1.verListaContactos();
        System.out.println("\nContactos de Usuario 1:");
        for (Contacto contacto : contactosUsuario1) {
            System.out.println(contacto.getNombre() + ": " + contacto.getNumTelefono());
        }

        // Funcionalidad extra para admin: ver mensajes de otro usuario
        if (usuario2.getTipo().equals("admin")) {
            System.out.println("\nUsuario 2 es administrador. Puede ver mensajes de otros usuarios.");
            List<Mensaje> mensajesUsuario1 = usuario1.verMensajesEnviados();
            System.out.println("Mensajes enviados por Usuario 1:");
            for (Mensaje mensaje : mensajesUsuario1) {
                if (mensaje instanceof MensajeTexto) {
                    System.out.println("Texto: " + ((MensajeTexto) mensaje).getContenido());
                } else if (mensaje instanceof MensajeMultimedia) {
                    System.out.println("Multimedia: " + ((MensajeMultimedia) mensaje).getNombreArchivo());
                }
            }
        }
    }
}
