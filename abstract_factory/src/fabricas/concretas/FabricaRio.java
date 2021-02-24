package fabricas.concretas;

import fabricas.abstratas.IFabricaDeBichos;
import produtos.abstratos.IPassaro;
import produtos.abstratos.IPorco;
import produtos.concretos.passaros.Passaro1;
import produtos.concretos.porcos.Porco1;

public class FabricaRio implements IFabricaDeBichos {

	public FabricaRio() {}

	@Override
	public IPassaro createPassaro() {
		return new Passaro1();
	}

	@Override
	public IPorco createPorco() {
		return new Porco1();
	}

}
