package br.com.deivity.revisao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.text.*;

//usuario da a data, fala qual dia da semana que é se o ano é bissexto e quanto falta p ser
public class ProgramaAno {
    public static void main(String[] args) {
        LocalDate dataEscolhida = LocalDate.parse("2010-06-23", DateTimeFormatter.ISO_LOCAL_DATE);
        if (dataEscolhida.getDayOfWeek().equals(0)) {
            System.out.println("a data informada é um domingo!!");
        } else if (dataEscolhida.getDayOfWeek().equals(1)) {
            System.out.println("a data informada é uma segunda");
        } else if (dataEscolhida.getDayOfWeek().equals(2)) {
            System.out.println("a data informada é uma terça");
        } else if (dataEscolhida.getDayOfWeek().equals(3)) {
            System.out.println("a data informada é uma quarta");
        } else if (dataEscolhida.getDayOfWeek().equals(4)) {
            System.out.println("a data informada é uma quinta");
        } else if (dataEscolhida.getDayOfWeek().equals(5)) {
            System.out.println("a data informada é uma sexta");
        } else if (dataEscolhida.getDayOfWeek().equals(6)) {
            System.out.println("a data informada é um sabado");
        }
        int resultadoDiv4 = (dataEscolhida.getYear() % 4);
        int resultadoDiv100 = (dataEscolhida.getYear() % 100);
        if (resultadoDiv4 == 0 && resultadoDiv100 == 0) {
            System.out.println("O ano informado é um ano bissexto!!");
        } else if (resultadoDiv4 == 3) {
            System.out.println("O ano informado não é um ano bissexto!!");
            System.out.println("Falta um ano para ser um ano bissexto!!");

        } else if (resultadoDiv4 == 2) {
            System.out.println("O ano informado não é um ano bissexto!!");
            System.out.println("Faltam dois anos para ser um ano bissexto!!");

        } else if (resultadoDiv4 == 1) {
            System.out.println("O ano informado não é um ano bissexto!!");
            System.out.println("Faltam três anos para ser um ano bissexto!!");

        }
    }
}
