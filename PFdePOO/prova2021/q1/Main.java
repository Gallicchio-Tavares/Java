package PFdePOO.prova2021.q1;

import java.util.*;

/*
 *  Crie uma classe principal que seja responsável por criar uma lista de carros. Crie dois
 *  carros e insira na lista. Em cada carro, adicione um Acessorio Som e um Acessorio VidroEletrico.
 */

public class Main {
    public static void main(String[] args) {

        List<Carro> conjuntoCarros = new ArrayList<Carro>();

        Carro ferrari = new Carro();
        ferrari.setAno(2019);
        ferrari.setCor("vermelho");
        ferrari.setPlaca("RIO0B12");
        ferrari.setRenavan("slaoqehisso");
        System.out.println(ferrari);

        Carro rollsRoyce = new Carro();
        rollsRoyce.setAno(2018);
        rollsRoyce.setCor("branco");
        rollsRoyce.setPlaca("ABC9Y66");
        rollsRoyce.setRenavan("slaoqehisso2");
        System.out.println(rollsRoyce);
        
        Som a = new Som("Philips", 9000);
        VidroEletrico v = new VidroEletrico("Dark Glass", 5000);
        List<Acessorio> conjuntoAcesF = new ArrayList<Acessorio>();
        conjuntoAcesF.add(v);
        conjuntoAcesF.add(a);
        ferrari.setAces(conjuntoAcesF);

        Som a2 = new Som("Philips", 5000);
        VidroEletrico v2 = new VidroEletrico("Glass United", 10000);
        List<Acessorio> conjuntoAcesR = new ArrayList<Acessorio>();
        conjuntoAcesR.add(v2);
        conjuntoAcesR.add(a2);
        rollsRoyce.setAces(conjuntoAcesR);

        conjuntoCarros.add(ferrari);
        conjuntoCarros.add(rollsRoyce);

        Utils2.imprimirCustos(conjuntoCarros);

        Map<String, Carro> mapa = Utils2.transformaListaEmMapa(conjuntoCarros);
        mapa.forEach((key, value) -> System.out.println(key + ": " + value)); // só pra ver se funciona
    }
}
