package cliente;

import fabricas.concretas.GerenciadorFabricas;
import produtos.abstratos.IPassaro;
import produtos.abstratos.IPorco;

public abstract class Fase {
    public Fase() {
    }

    public static void main(String[] args) {
        IPassaro passaro = GerenciadorFabricas.fabricaRio().createPassaro();
        IPorco porco = GerenciadorFabricas.fabricaRio().createPorco();
        int pancadas = 0;

        while (porco.estaVivo()) {
            porco.impacto(passaro.getForca());
            pancadas++;
        }

        System.out.println("Pancadas pra matar o coitado do porco = " + pancadas);
    }

}
