package fabricas.concretas;

import fabricas.abstratas.IFabricaDeBichos;

public abstract class GerenciadorFabricas {
    public static IFabricaDeBichos fabricaRio() {
        return new FabricaRio();
    }

    public static IFabricaDeBichos fabricaSeasons() {
        return new FabricaSeasons();
    }

    public static IFabricaDeBichos fabricaStarWars() {
        return new FabricaStarWars();
    }
}
