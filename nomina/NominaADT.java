package fes.aragon.adt.nomina;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import fes.aragon.adt.poo.ArrayADT;

public class NominaADT {

	private String rutaAcceso;
	private ArrayADT<TrabajadorADT> nominaAdt = new ArrayADT<>(14);
	private TrabajadorADT trabajador;
	private Scanner info;

	public NominaADT(String ruta) {

		this.rutaAcceso = ruta;

		File archivo = new File(this.rutaAcceso);
		try {

			Scanner informacion = new Scanner(archivo);

			this.info = informacion;

			this.info.nextLine();

			System.out.println("--------------SUELDOS--------------");

			while (this.info.hasNextLine()) {

				String lineas = informacion.nextLine().replaceAll(",", "\n");

				String[] linea = lineas.split("\n");

				ArrayADT<TrabajadorADT> nomina = new ArrayADT<>(14);

				this.nominaAdt = nomina;

				TrabajadorADT trabajadorTemporal = new TrabajadorADT(Integer.parseInt(linea[0]), linea[1], linea[2],
						linea[3], Double.parseDouble(linea[4]), Double.parseDouble(linea[5]),
						Integer.parseInt(linea[6]));

				this.trabajador = trabajadorTemporal;

				this.nominaAdt.setElemento(linea.length, this.trabajador);

				// System.out.println(this.nominaAdt);

				String nombreCompleto = this.trabajador.getNombre() + " " + this.trabajador.getPaterno() + " "
						+ this.trabajador.getMaterno();

				double calcSueldo = this.trabajador.calcularSueldo();

				System.out.println("Trabajador: " + nombreCompleto + " ------------- Sueldo total: " + calcSueldo);

			}

			System.out.println("\n--------------EMPLEADO MÁS ANTIGUO--------------");
			int mayor = 2023;

			if (this.trabajador.getAñoIngreso() < mayor) {
				mayor = this.trabajador.getAñoIngreso();
			}

			String nombreCompleto = this.trabajador.getNombre() + " " + this.trabajador.getPaterno() + " "
					+ this.trabajador.getMaterno();

			System.out.println("Trabajador: " + nombreCompleto + " ------------- Año de ingreso: " + mayor);

		} catch (FileNotFoundException e) {
			System.out.println("No se encontro el archivo");
		}

	}

}
