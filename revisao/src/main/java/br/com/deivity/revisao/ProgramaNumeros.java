package br.com.deivity.revisao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaNumeros {

    public static void main(String[] args_) {
        String[] args = {}; // bote três argumentos,não poderá passar do que isso!!

        Integer resultado;
        if (args.length == 3) {
            Integer primeiroNumero = Integer.valueOf(args[1]);
            Integer segundoNumero = Integer.valueOf(args[2]);

            if ("dividir".equals(args[0])) {
                resultado = (primeiroNumero / segundoNumero);
                System.out.println(
                        "O resultdo da divisão : " + primeiroNumero + " / " + segundoNumero + " é : " + resultado);
            } else if ("somar".equals(args[0])) {
                resultado = (primeiroNumero + segundoNumero);
                System.out.println(
                        "O resultdo da soma : " + primeiroNumero + " + " + segundoNumero + " é : " + resultado);
            } else if ("multiplicar".equals(args[0])) {
                resultado = (primeiroNumero * segundoNumero);
                System.out.println("O resultdo da multiplicação : " + primeiroNumero + " x " + segundoNumero + " é : "
                        + resultado);
            } else {
                System.out.println("ERRO!!!! NUMERO INVÁLIDO DE ARGUMENTOS!!!");
            }
        } else {
            System.out.println("ERRO!!!! NUMERO INVÁLIDO DE ARGUMENTOS!!!");
        }

    }
}
