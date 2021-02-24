package produtos.concretos.passaros;

import produtos.abstratos.IPassaro;

public class Passaro3 implements IPassaro{

	int forca = 100;
	
	public Passaro3() {}

	@Override
	public int getForca() {
		return forca;
	}

}