package PFdePOO.q1;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SistemaPrincipal {

    public static void main(String[] args) {
        // 1- crie uma academia
        Academia ac = new Academia("ForteMais");
        // 2 - solicite o numero N de Ninjas q serao cadastrados e
        // se o ninja é um Genin(1), Chunin(2) ou Jonin(3)
        Scanner scInt = new Scanner(System.in);

        System.out.println("Quantos ninjas serão cadastrados?");
        int qtdNinja = scInt.nextInt();
        
        for (int i=0; i<qtdNinja; i++) {
            System.out.println("Insira o tipo: Genin(1), Chunin(2) ou Jonin(3)");
            int tipo = scInt.nextInt();

            scInt.nextLine(); // tem q usar isso senão dá ruim por algum motivo
            // 3 - cadastre os dados dos ninjas pedindo a info no console (nome, cpf e idade)
            Ninja n = null; // criei o ninja mas ainda n atribuí nada a ele
            System.out.println("Insira o nome");
            String nome = scInt.nextLine();
            System.out.println("Insira o cpf");
            String cpf = scInt.nextLine();
            System.out.println("Insira a idade");
            int idade = scInt.nextInt();

            if (tipo == 1) { // aqui enfim adiciono a info do ninja com os dados q eu peguei
                n = new Genin(cpf, nome, idade);
            } else if (tipo == 2) {
                n = new Chunin(cpf, nome, idade);
            } else {
                n = new Jonin(cpf, nome, idade);
            } 
            ac.matriculaNinja(n); // 4 - por fim matricule o ninja na academia
        }
        scInt.nextLine(); // tem q usar isso senão dá ruim por algum motivo
        System.out.println("Cadastro dos ninjas realizado com sucesso!");
        // 5 - fazer um loop while q, enquanto n for digitado 0, será solicitado um cpf e o sistema deverá buscar o ninja associado a esse cpf
        // se o ninja for encontrado, imprima os dados dele. senão, diga q não o achou
        System.out.println("Insira um cpf para procurar um ninja: (para sair digite 0)");
        String buscaCpf = scInt.nextLine();
        while (!"0".equals(buscaCpf)) { // usou o equals pq o indice de busca ta como string
            Ninja n = new Ninja(buscaCpf);
            ac.imprimeDadosNinjaSeExistir(n);
            System.out.println("Insira um cpf para procurar um ninja: (para sair digite 0)");
            buscaCpf = scInt.nextLine();
        }
        // 6 - no fim, imprima a referencia a academia (tem q ter feito o toString da academia)
        System.out.println(ac);
        // 7 - imprima o nome dos ninjas em ordem crescente de idade
        List lista = ac.getListaNinjas();
        Collections.sort(lista); // tem q ter modificado a classe Ninja com o Comparable
        for (int i=0; i<lista.size();i++) { //imprimindo com um for
            System.out.println(((Ninja)lista.get(i)).getNome());
        }
    }

}
