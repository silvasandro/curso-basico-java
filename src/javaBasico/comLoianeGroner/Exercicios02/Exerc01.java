package javaBasico.comLoianeGroner.Exercicios02;

import java.util.Scanner;

public class Exerc01 {
    public static void main(String[] args) {


        Scanner scan =  new Scanner(System.in);

        boolean notaValida = false;


        do {

            System.out.println("Digite um número de 0 à 10: ");
            double nota = scan.nextDouble();

            if (nota >= 0 && nota <= 10){
                notaValida = true;
                System.out.println("Você digitou: " + nota);
            } else {
                notaValida = false;
                System.out.println("Nota inválida, digite novamente!");
            }
        } while (!notaValida);
    }
}
