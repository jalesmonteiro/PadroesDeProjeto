package cliente;

import fabricas.abstratas.IFabricaDeBichos;
import fabricas.concretas.FabricaRio;
import fabricas.concretas.FabricaSeasons;
import fabricas.concretas.FabricaStarWars;
import fabricas.concretas.GerenciadorFabricas;
import produtos.abstratos.IPassaro;
import produtos.abstratos.IPorco;

public abstract class Fase {
	
	public static GerenciadorFabricas fBichos;

	public Fase() {}

	public static void main(String[] args) {
		IPassaro passaro = fBichos.fabricaRio().createPassaro();
		IPorco porco = fBichos.fabricaRio().createPorco();
		int pancadas = 0;
		
		while(porco.estaVivo()) {
			porco.impacto(passaro.getForca());
			pancadas++;
		}
		
		System.out.println("Pancadas pra matar o coitado do porco = " + pancadas);
	}

}
