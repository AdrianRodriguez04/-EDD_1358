package fes.aragon.collections;

import java.util.Stack;

import javax.swing.JOptionPane;

// Ejemplo de la vida real implementada con "java.util.Stack"
public class StackCollections {

	public static void main(String[] args) {

		// Constructor
		Stack<String> cajas = new Stack<>();

		// Implementacion de algunos de sus métodos
		String nombre = JOptionPane.showInputDialog(null, "¿Cual es tu nombre?", "USUARIO", 3);
		JOptionPane.showMessageDialog(null, "CAJAS DE " + nombre, "BLOG PERSONAL", 1);

		int eleccion = JOptionPane.showConfirmDialog(null, "¿Deseas ingresar una nueva caja?", "ORGANIZACIÓN DE CAJAS",
				0);
		if (eleccion == 0) {
			// Como podemos observar, el método "push" nos ayuda a ingresar nuevos datos en
			// nuestra pila, teniendo una capidad ilimitada.
			cajas.push(JOptionPane.showInputDialog(null, "Ingresa la caja que deseas acomodar:", "TIPO DE CAJA", 1));
			int eleccionDos = JOptionPane.showConfirmDialog(null, "¿Deseas ingresar una nueva caja?",
					"ORGANIZACIÓN DE CAJAS", 0);
			if (eleccionDos == 0) {
				cajas.push(
						JOptionPane.showInputDialog(null, "Ingresa la caja que deseas acomodar:", "TIPO DE CAJA", 1));
				int eleccionTres = JOptionPane.showConfirmDialog(null, "¿Deseas ingresar una nueva caja?",
						"ORGANIZACIÓN DE CAJAS", 0);
				if (eleccionTres == 0) {
					cajas.push(JOptionPane.showInputDialog(null, "Ingresa la caja que deseas acomodar:", "TIPO DE CAJA",
							1));
					int eleccionCuatro = JOptionPane.showConfirmDialog(null, "¿Deseas ingresar una nueva caja?",
							"ORGANIZACIÓN DE CAJAS", 0);
					if (eleccionCuatro == 0) {
						cajas.push(JOptionPane.showInputDialog(null, "Ingresa la caja que deseas acomodar:",
								"TIPO DE CAJA", 1));
						int eleccionCinco = JOptionPane.showConfirmDialog(null, "¿Deseas ingresar una nueva caja?",
								"ORGANIZACIÓN DE CAJAS", 0);
						if (eleccionCinco == 0) {
							cajas.push(JOptionPane.showInputDialog(null, "Ingresa la caja que deseas acomodar:",
									"TIPO DE CAJA", 1));
							// La clase Stack nos brinda otros 2 métodos importantes que de igual forma
							// tienen un funcionamiento importante en la pila. El método "pop" regresa el
							// último valor ingresado pero al mismo tiempo lo elimina y el método "peek"
							// tiene un funcionamiento similar, ya que regresa el último valor ingresado,
							// pero a diferencia del otro método, éste valor no se elimina.
							JOptionPane.showMessageDialog(null,
									"Has alcanzado el maximo de cajas permitidos.\nSu caja más alta es " + cajas.pop()
											+ ".\nAbajo de esta se encuentra la " + cajas.pop()
											+ ".\nAbajo se encuentra la " + cajas.pop()
											+ ".\nCasi al ultimo se encuentra la " + cajas.pop()
											+ ".\nY hasta abajo se encuentra la " + cajas.peek(),
									"SUS CAJAS", 1);
						} else {
							JOptionPane.showMessageDialog(null,
									"Su caja más alta es " + cajas.pop() + ".\nAbajo de esta se encuentra la "
											+ cajas.pop() + ".\nCasi al final se encuentra la " + cajas.pop()
											+ ".\nY hasta abajo se encuentra la " + cajas.peek(),
									"SUS CAJAS", 1);
						}
					} else {
						JOptionPane.showMessageDialog(
								null, "Su caja más alta es " + cajas.pop() + ".\nAbajo de esta se encuentra la "
										+ cajas.pop() + ".\nY hasta abajo se encuentra la " + cajas.peek(),
								"SUS CAJAS", 1);
					}
				} else {
					JOptionPane.showMessageDialog(null,
							"Su caja más alta es " + cajas.pop() + ".\nAbajo se encuentra la " + cajas.peek(),
							"SUS CAJAS", 1);
				}
			} else {
				JOptionPane.showMessageDialog(null, "La unica caja que tiene es " + cajas.peek(), "SUS CAJAS", 1);
			}
		} else {
			JOptionPane.showMessageDialog(null, "Usted no tiene ninguna caja que se pueda acomodar", "SUS CAJAS", 1);
		}
	}
}
