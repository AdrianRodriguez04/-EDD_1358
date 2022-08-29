package fes.aragon.adt.poo;

public class PerroObjeto {

	private String nombre;
	private int edad;
	private int estatura;
	private String raza;

	public PerroObjeto() {
	}

	public PerroObjeto(String nombre, int edad, int estatura, String raza) {
		this.nombre = nombre;
		this.edad = edad;
		this.estatura = estatura;
		this.raza = raza;
	}

	public PerroObjeto(PerroObjeto perro) {
		this.nombre = perro.getNombre();
		this.edad = perro.getEdad();
		this.estatura = perro.getEstatura();
		this.raza = perro.getRaza();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getEstatura() {
		return estatura;
	}

	public void setEstatura(int estatura) {
		this.estatura = estatura;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}
}


