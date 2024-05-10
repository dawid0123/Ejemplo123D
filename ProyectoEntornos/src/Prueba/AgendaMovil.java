package Prueba;

import java.util.*;

public class AgendaMovil {
    private List<Usuario> usuarios;

    public AgendaMovil() {
        this.usuarios = new ArrayList<>();
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public Usuario buscarUsuarioPorNumero(String numeroTelefono) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNumeroTelefono().equals(numeroTelefono)) {
                return usuario;
            }
        }
        return null;
    }

    // Implementa los métodos adicionales según sea necesario para interactuar con la aplicación
}



