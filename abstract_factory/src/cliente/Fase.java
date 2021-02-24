package cliente;

import fabricas.abstratas.IFabricaDeBichos;
import fabricas.concretas.FabricaRio;
import fabricas.concretas.FabricaSeasons;
import fabricas.concretas.FabricaStarWars;
import produtos.abstratos.IPassaro;
import produtos.abstratos.IPorco;

public class Fase {
	
	public static IFabricaDeBichos fBichos;

	public Fase() {}

	public static void main(String[] args) {
		//fBichos = new FabricaRio();
		//fBichos = new FabricaSeasons();
		fBichos = new FabricaStarWars();

		IPassaro passaro = fBichos.createPassaro();
		IPorco porco = fBichos.createPorco();
		int pancadas = 0;
		
		while(porco.estaVivo()) {
			porco.impacto(passaro.getForca());
			pancadas++;
		}
		
		System.out.println("Pancadas pra matar o coitado do porco = " + pancadas);
	}

}
