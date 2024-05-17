package Prueba;

import java.util.*;

/**
 * Representa una agenda móvil que contiene una lista de usuarios.
 */
public class AgendaMovil {
    private List<Usuario> usuarios;

    /**
     * Crea una nueva instancia de AgendaMovil.
     */
    public AgendaMovil() {
        this.usuarios = new ArrayList<>();
    }

    /**
     * Agrega un usuario a la agenda.
     *
     * @param usuario el usuario a agregar
     */
    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    /**  
     * Busca un usuario en la agenda por su número de teléfono.
     *
     * @param numeroTelefono el número de teléfono del usuario a buscar
     * @return el usuario encontrado o null si no se encuentra
     */
    public Usuario buscarUsuarioPorNumero(String numeroTelefono) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNumeroTelefono().equals(numeroTelefono)) {
                return usuario;
            }
        }
        return null;
    }
}

