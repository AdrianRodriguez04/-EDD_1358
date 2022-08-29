package fes.aragon.adt.poo;

public class ArrayADTPrueba {

	public static void main(String[] args) {
		
		ArrayADT lista = new ArrayADT(5);
		
		lista.getLongitud();
		
		lista.setElemento("Margarita", 0);
		
		System.out.println(lista.getElemento(0));
		
		lista.setElemento(new PerroObjeto(null, 0, 0, null), 3);
		
		Object x = lista.getElemento(4);
		
		((PerroObjeto)x).setNombre("Pedro");
		
		lista.limpiar("Alfa");
		
		System.out.println(lista.getElemento(4));
		
		lista.setElemento("Cereza", 4);
		
		System.out.println(lista.getElemento(4));
	}
}
