package fes.aragon.collections;

import java.util.LinkedList;

import javax.swing.JOptionPane;

public class LinkedListCollections {

	public static void main(String[] args) {

		// Constructor:
		LinkedList<String> jerarquia = new LinkedList<>();

		// Implementación de algunos de sus métodos:
		JOptionPane.showMessageDialog(null, "JERARQUIA LABORAL", "STARBUCKS", 1);

		// "addFirst" nos da la posibilidad de ingresar un objeto de tipo String en el
		// indice 0 de la lista ligada.
		jerarquia.addFirst(JOptionPane.showInputDialog(null, "Ingrese la jerarquia de orden más alta:", "ORDEN", 2));
		// Como contraparte de "addFirst" tenemos "addLast" que nos permite ingresar un
		// objeto de tipo String al final de nuestra lista ligada.
		jerarquia.addLast(JOptionPane.showInputDialog(null, "Ingrese una nueva jerarquia:", "ORDEN", 2));
		jerarquia.addLast(JOptionPane.showInputDialog(null, "Ingrese una nueva jerarquia:", "ORDEN", 2));
		jerarquia.addLast(JOptionPane.showInputDialog(null, "Ingrese una nueva jerarquia:", "ORDEN", 2));
		jerarquia.addLast(JOptionPane.showInputDialog(null, "Ingrese una nueva jerarquia:", "ORDEN", 2));
		jerarquia.addLast(JOptionPane.showInputDialog(null, "Ingrese una nueva jerarquia:", "ORDEN", 2));
		jerarquia.addLast(JOptionPane.showInputDialog(null, "Ingrese una nueva jerarquia:", "ORDEN", 2));
		jerarquia.addLast(JOptionPane.showInputDialog(null, "Ingrese una nueva jerarquia:", "ORDEN", 2));

		// Otros de sus métodos más destacables es "getFirst" y "getLast" que como su
		// nombre nos dice, nos da el primer y último elemento respectivamente de
		// nuestra lista ligada.
		JOptionPane.showMessageDialog(null, "La jerarquia más alta es:\n- " + jerarquia.getFirst()
				+ "\nLa jerarquia más baja es:\n- " + jerarquia.getLast(), "ORDEN MÁS ALTO Y MÁS BAJO", 0);

		// Para poder mostrar nuestros elementos de nuestra lista ligada podemos
		// acceder indice por indice hasta completar todos, aunque en algunas ocasiones
		// es tedioso realizarlo de esta manera, por lo que se puede utilizar el metodo
		// "toString" que nos brinda java.
		JOptionPane.showMessageDialog(null,
				"La jerarquia de esta empresa es:\n1.- " + jerarquia.getFirst() + "\n2.- " + jerarquia.get(1) + "\n3.- "
						+ jerarquia.get(2) + "\n4.- " + jerarquia.get(3) + "\n5.- " + jerarquia.get(4) + "\n6.- "
						+ jerarquia.get(5) + "\n7.- " + jerarquia.get(6) + "\n8.- " + jerarquia.get(7),
				"JERARQUIA COMPLETA", 0);
	}
}
