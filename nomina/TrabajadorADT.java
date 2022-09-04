package fes.aragon.adt.nomina;

public class TrabajadorADT {

	private double horaExtra = 276.5;
	private int numeroTrabajador;
	private String nombre;
	private String paterno;
	private String materno;
	private double horasExtras;
	private double sueldoBase;
	private int añoIngreso;
	
	public TrabajadorADT() {

	}
	
	public TrabajadorADT(int numeroT, String nombre, String paterno, String materno, double horasE, double sueldoB, int añoI) {
		this.numeroTrabajador = numeroT;
		this.nombre = nombre;
		this.paterno = paterno;
		this.materno = materno;
		this.horasExtras = horasE;
		this.sueldoBase = sueldoB;
		this.añoIngreso = añoI;
	}

	public int getNumeroTrabajador() {
		return numeroTrabajador;
	}

	public void setNumeroTrabajador(int numeroTrabajador) {
		this.numeroTrabajador = numeroTrabajador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPaterno() {
		return paterno;
	}

	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}

	public String getMaterno() {
		return materno;
	}

	public void setMaterno(String materno) {
		this.materno = materno;
	}

	public double getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(double horasExtras) {
		this.horasExtras = horasExtras;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public int getAñoIngreso() {
		return añoIngreso;
	}

	public void setAñoIngreso(int añoIngreso) {
		this.añoIngreso = añoIngreso;
	}
	
	public double calcularSueldo () {
		int antiguedad = 2022 - this.añoIngreso;
		double total = this.sueldoBase + (this.sueldoBase * (antiguedad*0.03)) + (this.horasExtras*this.horaExtra);
		return total;
	}

	@Override
	public String toString() {
		return "TrabajadorADT [numeroTrabajador=" + numeroTrabajador + ", nombre=" + nombre
				+ ", paterno=" + paterno + ", materno=" + materno + ", horasExtras=" + horasExtras + ", sueldoBase="
				+ sueldoBase + ", añoIngreso=" + añoIngreso + "]";
	}
	
}
