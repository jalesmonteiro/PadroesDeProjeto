package produtos.concretos.porcos;

import produtos.abstratos.IPorco;

public class Porco1 implements IPorco{

	int vida = 100;
	
	public Porco1() {
	}

	@Override
	public int impacto(int forca) {
		return vida = vida - forca;
	}

	@Override
	public boolean estaVivo() {
		return vida > 0;
	}

}
