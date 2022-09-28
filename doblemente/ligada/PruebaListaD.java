package fes.aragon.lista.doblemente.ligada;

public class PruebaListaD {

	public static void main(String[] args) {
		
		ListaDoblementeLigada<Integer> lista = new ListaDoblementeLigada<>();
		
		System.out.println(lista.estaVacia());
		
		lista.agregarAlFinal(14);
		lista.agregarAlFinal(546);
		lista.agregarAlFinal(666);
		lista.agregarAlInicio(7891);
		
		lista.transversal();
		
		System.out.println(lista.estaVacia());
		
		lista.actualizarValor(14, 1);
		lista.agregarDespuesDe(2, 12334);
		lista.eliminarElFinal();
		lista.eliminarElPrimero();
		
		lista.transversal();
		
	}
}
