package cliente;

import fabricas.abstratas.IFabricaDeBichos;
import fabricas.concretas.GerenciadorFabricas;
import produtos.abstratos.IPassaro;
import produtos.abstratos.IPorco;

public class Fase {
    public Fase() {
    }

    public static void main(String[] args) {
    	IFabricaDeBichos fabrica = GerenciadorFabricas.fabricaRio();
    	//IFabricaDeBichos fabrica = GerenciadorFabricas.fabricaSeasons();
    	//IFabricaDeBichos fabrica = GerenciadorFabricas.fabricaStarWars();
    	
        IPassaro passaro = fabrica.createPassaro();
        IPorco porco = fabrica.createPorco();
        
        int pancadas = 0;

        while (porco.estaVivo()) {
            porco.impacto(passaro.getForca());
            pancadas++;
        }

        System.out.println("Pancadas pra matar o coitado do porco = " + pancadas);
    }

}
