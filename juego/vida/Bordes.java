package fes.aragon.juego.vida;

public class Bordes {

	private int x, y;

	public Bordes(int tamañoX, int tamañoY) {
		this.x = tamañoX;
		this.y = tamañoY;
	}

	public boolean bordeEnX(int x) {
		return x >= 0 && x < this.x;
	}

	public boolean bordeEnY(int y) {
		return y >= 0 && y < this.y;
	}

	public boolean esquina(int x, int y) {
		if (x == 0 || x == this.x - 1 && y == 0 || y == this.y - 1) {
			return true;
		} else {
			return false;
		}
	}

	public boolean adentro(int x, int y) {
		if (x > 0 && x < this.x - 1 && y > 0 && y < this.y - 1) {
			return true;
		} else {
			return false;
		}
	}

	public boolean enElMargen(int x, int y) {
		if (x > 0 && x < this.x - 1 && y > 0 && y < this.y - 1) {
			return false;
		} else {
			return true;
		}
	}

	public int getContadorX(int x) {
		if (x == 0) {
			return x;
		} else {
			return x - 1;
		}
	}

	public int getLimiteX(int x) {
		if (x == this.x - 1) {
			return x + 1;
		} else {
			return x + 2;
		}
	}

	public int getContadorY(int y) {
		if (y == 0) {
			return y;
		} else {
			return y - 1;
		}
	}

	public int getLimiteY(int y) {
		if (y == this.y - 1) {
			return y + 1;
		} else {
			return y + 2;

		}
	}
}
