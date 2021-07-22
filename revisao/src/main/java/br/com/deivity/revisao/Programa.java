package br.com.deivity.revisao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um nome para incluir na lista de pessoas :");
        String nome = ler.next();

        List<String> nomes = new ArrayList<>();

        while (!"parar".equals(nome)) {
            nomes.add(nome);
            System.out.println(
                    "Digite um nome para incluir na lista de pessoas : ( caso queira terminar a lista digite parar)");
            nome = ler.next();
        }
        System.out.println("Você fechou a lista de nomes e esses são os nomes da lista : ");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
    }
}
