package fes.aragon.juego.vida;

public class Celulas {

	private int x, y;
	private int vecinos;
	private boolean estado;

	public Celulas() {
		// TODO Auto-generated constructor stub
		
	}
	
	public Celulas(int xX, int yY, boolean vida) {
		this.x = xX;
		this.y = yY;
		this.estado = vida;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getVecinos() {
		return vecinos;
	}

	public void setVecinos(int vecinos) {
		this.vecinos = vecinos;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public int[] recibirCordenadas(int x, int y) {
		int[] temp = new int[2];
		temp[0] = x - 1;
		temp[1] = y - 1;
		return temp;

	}

	public String toString() {
		String temp;
		if (estado) {
			temp = "   -   ";
		} else {
			temp = "   *   ";
		}
		return temp;
	}

}
