package fes.aragon.collections;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArrayListCollections {

	public static void main(String[] args) {

		// Constructor
		ArrayList<String> nombres = new ArrayList<String>();

		// Implementación de algunos de sus métodos:
		JOptionPane.showMessageDialog(null, "INTEGRANTES DE LA NUEVA MESA REDONDA", "FES ARAGON", 1);

		// El método "add" nos permite agregar todos los elementos que queramos en
		// nuestro arreglo, teniendo la posiblidad de almanecarlo directamente con un
		// indice establecido por el usuario.
		nombres.add(JOptionPane.showInputDialog(null, "Ingrese un nuevo integrante", "Nuevo integrante", 2));
		nombres.add(JOptionPane.showInputDialog(null, "Ingrese un nuevo integrante", "Nuevo integrante", 2));
		nombres.add(JOptionPane.showInputDialog(null, "Ingrese un nuevo integrante", "Nuevo integrante", 2));
		nombres.add(JOptionPane.showInputDialog(null, "Ingrese un nuevo integrante", "Nuevo integrante", 2));
		nombres.add(JOptionPane.showInputDialog(null, "Ingrese un nuevo integrante", "Nuevo integrante", 2));

		// Para poder mostrar nuestros elementos de nuestro arreglo podemos acceder
		// indice por indice hasta completar todos los elemtos del arreglo.
		JOptionPane.showMessageDialog(null,
				"Los nuevos integrantes son:\n1.- " + nombres.get(0) + "\n2.- " + nombres.get(1) + "\n3.- "
						+ nombres.get(2) + "\n4.- " + nombres.get(3) + "\n5.- " + nombres.get(4),
				"INTEGRANTES DE LA NUEVA MESA REDONDA", 1);

		int opcion = JOptionPane.showConfirmDialog(null, "¿Desea eliminar a un usuario?", "AVISO", 0);

		if (opcion == 0) {
			// Tenemos la posibilidad de eliminar elementos de nuestro arreglo con la ayuda
			// del indice en donde se guarda cada objeto.
			nombres.remove(Integer.parseInt(JOptionPane.showInputDialog(null,
					"Ingrese el numero del usuario que desee eliminar", "Eliminar integrante", 0)) - 1);
			// Podemos mostrar todos los elementos de nuestro arreglo unicamente con el
			// nombre de nuestra variable, ya que automaticamente java realiza el "toString"
			// sin la necesidad de acudir directamente al método
			JOptionPane.showMessageDialog(null, "Integrantes finales:\n" + nombres, "FES ARAGON", 2);
		} else {
			if (opcion == 1) {
				JOptionPane.showMessageDialog(null, "Integrantes finales:\n" + nombres, "FES ARAGON", 2);
			}
		}
	}
}
