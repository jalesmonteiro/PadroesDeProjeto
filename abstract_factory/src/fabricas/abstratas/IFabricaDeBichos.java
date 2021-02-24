package fabricas.abstratas;

import produtos.abstratos.IPassaro;
import produtos.abstratos.IPorco;

public interface IFabricaDeBichos {

	public IPassaro createPassaro();
	public IPorco createPorco();
}
