package fabricas.concretas;

import fabricas.abstratas.IFabricaDeBichos;

public abstract class GerenciadorFabricas {
    public IFabricaDeBichos fabricaRio() {
        return new FabricaRio();
    }

    public IFabricaDeBichos fabricaSeasons() {
        return new FabricaSeasons();
    }

    public IFabricaDeBichos fabricaStarWars() {
        return new FabricaStarWars();
    }


}
