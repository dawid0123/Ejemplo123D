package Prueba;

/**
 * Representa un contacto con un número de teléfono y un nombre.
 */
public class Contacto {
    private String numTelefono;
    private String nombre;

    /**
     * Crea una nueva instancia de Contacto.
     *
     * @param num el número de teléfono del contacto
     * @param nom el nombre del contacto
     */
    public Contacto(String num, String nom) {
        this.numTelefono = num;
        this.nombre = nom;
    }

    /**
     * Obtiene el número de teléfono del contacto.
     *
     * @return el número de teléfono del contacto
     */
    public String getNumTelefono() {
        return numTelefono;
    }

    /**
     * Obtiene el nombre del contacto.
     *
     * @return el nombre del contacto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el número de teléfono del contacto.
     *
     * @param numTelefono el nuevo número de teléfono del contacto
     */  
    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    /**
     * Establece el nombre del contacto.
     *
     * @param nombre el nuevo nombre del contacto
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

