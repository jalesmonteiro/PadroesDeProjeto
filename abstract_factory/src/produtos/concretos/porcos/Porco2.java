package produtos.concretos.porcos;

import produtos.abstratos.IPorco;

public class Porco2 implements IPorco{

	int vida = 150;
	
	public Porco2() {
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