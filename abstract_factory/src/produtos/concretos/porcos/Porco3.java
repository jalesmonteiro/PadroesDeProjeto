package produtos.concretos.porcos;

import produtos.abstratos.IPorco;

public class Porco3 implements IPorco{

	int vida = 200;
	
	public Porco3() {
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