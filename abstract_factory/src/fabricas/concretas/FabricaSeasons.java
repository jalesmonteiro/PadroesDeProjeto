package fabricas.concretas;

import fabricas.abstratas.IFabricaDeBichos;
import produtos.abstratos.IPassaro;
import produtos.abstratos.IPorco;
import produtos.concretos.passaros.Passaro2;
import produtos.concretos.porcos.Porco2;

public class FabricaSeasons implements IFabricaDeBichos {

	public FabricaSeasons() {}

	@Override
	public IPassaro createPassaro() {
		return new Passaro2();
	}

	@Override
	public IPorco createPorco() {
		return new Porco2();
	}

}