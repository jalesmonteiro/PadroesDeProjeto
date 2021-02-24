package fabricas.concretas;

import fabricas.abstratas.IFabricaDeBichos;
import produtos.abstratos.IPassaro;
import produtos.abstratos.IPorco;
import produtos.concretos.passaros.Passaro3;
import produtos.concretos.porcos.Porco3;

public class FabricaStarWars implements IFabricaDeBichos {

	public FabricaStarWars() {}

	@Override
	public IPassaro createPassaro() {
		return new Passaro3();
	}

	@Override
	public IPorco createPorco() {
		return new Porco3();
	}

}