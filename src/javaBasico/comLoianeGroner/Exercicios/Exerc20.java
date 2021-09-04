package javaBasico.comLoianeGroner.Exercicios;


/*
 * Faça um programa que faça 5 perguntas para uma pessoa sobre um crime.
 * As perguntas são:
 * A. "Telefonou para a vítima?"
 * B. "Esteve no local do crime?"
 * C. "Mora perto da vítima?"
 * D. "Devia para a vítima?"
 * E. "Já trabalhou com a vítima?"
 *
 * O Programa no final deve emitir uma classificação sobre a
 * participação da pessoa no crime. Se a pessoa responder positivamente
 * a 2 questões ela deve ser classificada como "Suspeita",
 * entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário, ele
 * será classificado como "Inocente".
 * */

import java.util.Scanner;

public class Exerc20 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Telefonou para a vítima?");
        String resp1 = scan.next();

        System.out.println("Esteve no local do crime?");
        String resp2 = scan.next();

        System.out.println("Mora perto da vítima?");
        String resp3 = scan.next();

        System.out.println("Já trabalhou com a vítima?");
        String resp4 = scan.next();

        System.out.println("Você devia dinheiro para a vítima?");
        String resp5 = scan.next();

        int cont = 0;

        if (resp1.equalsIgnoreCase("S")) {
            cont++;
        }
        if (resp2.equalsIgnoreCase("S")) {
            cont++;
        }
        if (resp3.equalsIgnoreCase("S")) {
            cont++;
        }
        if (resp4.equalsIgnoreCase("S")) {
            cont++;
        }
        if (resp5.equalsIgnoreCase("S")) {
            cont++;
        }

        if (cont == 2) {
            System.out.println("Você é suspeito");
        } else if (cont == 3 || cont == 4) {
            System.out.println("Você é cúmplice!!!!");
        } else if (cont == 5) {
            System.out.println("você é o ASSASSINOOOOO!!!");
        } else if (cont == 0) {
            System.out.println("Ufa!! você é inocente ^^");
        }
    }
}
