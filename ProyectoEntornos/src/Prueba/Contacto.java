package Prueba;

public class Contacto {
	private String numTelefono;
	private String nombre;
	
	//CONSTRUCTOR

	public Contacto(String num,String nom) {
		this.nombre=nom;
		this.numTelefono=num;
		
	}

	
	//getters y setters 

	public String getNumTelefono() {
		return numTelefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNumTelefono(String numTelefono) {
		this.numTelefono = numTelefono;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	

}
