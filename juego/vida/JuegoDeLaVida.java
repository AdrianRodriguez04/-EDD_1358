package fes.aragon.juego.vida;

import java.util.ArrayList;

public class JuegoDeLaVida {

	public static void main(String[] args) {

		Celulas celulasVivas = new Celulas();

		int[] celulaUno = celulasVivas.recibirCordenadas(5, 2);
		int[] celulaDos = celulasVivas.recibirCordenadas(5, 3);
		int[] celulaTres = celulasVivas.recibirCordenadas(5, 4);
		int[] celulaCuatro = celulasVivas.recibirCordenadas(5, 5);
		int[] celulaCinco = celulasVivas.recibirCordenadas(5, 6);
		int[] celulaSeis = celulasVivas.recibirCordenadas(7, 3);
		int[] celulaSiete = celulasVivas.recibirCordenadas(7, 4);
		int[] celulaOcho = celulasVivas.recibirCordenadas(7, 5);

		ArrayList<int[]> celulas = new ArrayList<>();
		celulas.add(celulaUno);
		celulas.add(celulaDos);
		celulas.add(celulaTres);
		celulas.add(celulaCuatro);
		celulas.add(celulaCinco);
		celulas.add(celulaSeis);
		celulas.add(celulaSiete);
		celulas.add(celulaOcho);

		ReglasTablero juego = new ReglasTablero(15, 15, celulas);
		
		juego.generacionSig();

		System.out.print(juego.getGeneracion());

		juego.actualizarVecinos(15, 15);

		juego.generacionSig();
		
		System.out.print(juego.getGeneracion());

		// No encuentro la manera de imprimir los datos de manera cuadrada (matriz) y no
		// sé si esta bien aplicado las reglas y los metodos, sin embargo pude
		// comprender en su gran mayoria el funcionamiento que se desea alcanzar
	}

}
