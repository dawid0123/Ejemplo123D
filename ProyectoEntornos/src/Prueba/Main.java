package Prueba;

import java.util.List;

class Main {
    public static void main(String[] args) {
        // Crear una instancia de la agenda móvil
        AgendaMovil agenda = new AgendaMovil();

        // Crear usuarios de ejemplo
        Usuario usuario1 = new Usuario("123456789");
        Usuario usuario2 = new Usuario("987654321");

        // Agregar contactos a los usuarios
        usuario1.agregarContacto(new Contacto("987654321", "Amigo"));
        usuario2.agregarContacto(new Contacto("123456789", "Amigo"));

        // Agregar usuarios a la agenda
        agenda.agregarUsuario(usuario1);
        agenda.agregarUsuario(usuario2);

        // Simular interacción del usuario
        Usuario usuario = agenda.buscarUsuarioPorNumero("123456789");
        if (usuario != null) {
            // Realizar acciones con el usuario
            List<Contacto> contactos = usuario.verListaContactos();
            System.out.println("Lista de contactos:");
            for (Contacto contacto : contactos) {
                System.out.println(contacto.getNumTelefono() + " - " + contacto.getNombre());
            }
            // Continuar con otras acciones según los requisitos especificados
        } else {
            System.out.println("Usuario no encontrado.");
        }
    }
}