package produtos.concretos.passaros;

import produtos.abstratos.IPassaro;

public class Passaro1 implements IPassaro{

	int forca = 30;
	
	public Passaro1() {}

	@Override
	public int getForca() {
		return forca;
	}

}