package produtos.concretos.passaros;

import produtos.abstratos.IPassaro;

public class Passaro2 implements IPassaro{

	int forca = 60;
	
	public Passaro2() {}

	@Override
	public int getForca() {
		return forca;
	}

}