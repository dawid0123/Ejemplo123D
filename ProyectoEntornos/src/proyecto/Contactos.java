package proyecto;

public class Contactos {
	private String numTelefono;
	private String nombre;
	
	//CONSTRUCTOR

	public Contactos(String num,String nom) {
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
