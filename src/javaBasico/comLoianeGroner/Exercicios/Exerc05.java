package javaBasico.comLoianeGroner.Exercicios;

/*
 * Faça um Programa para a leitura de duas notas parciais de um aluno.
 * O Programa deve calcular a média alcançada por aluno e apresentar:
 * 1. A Mensagem "Aprovado", se a média alcançada for amior ou igual a 7.
 * 2. A Mensagem "Reprovado", se a média for menor que sete.
 * 3. A Mensagem "Aprovado com distinção", se a média for igual a 10.
 * */

import java.util.Scanner;

public class Exerc05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a primeira nota");
        double nota1 = scan.nextDouble();

        System.out.println("Entre com a segunda nota");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;


        if (media == 10) {
            System.out.println("Parabéns você foi Aprovado com DISTINÇÃO!!! \\o");
        } else if(media >= 7) {
            System.out.println("Parabéns, você foi APROVADO!!! \\o");
        } else {
            System.out.println("Você foi reprovado, estude mais!");
        }
    }
}
