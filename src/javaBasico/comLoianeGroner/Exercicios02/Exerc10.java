package javaBasico.comLoianeGroner.Exercicios02;

import java.util.Scanner;

public class Exerc10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Contando de: ");
        int num1 = scan.nextInt();

        System.out.println("Até: ");
        int num2 = scan.nextInt();

        for(int i = num1; i <= num2; i++){
            System.out.println("Contagem: " + i);
        }
    }
}
