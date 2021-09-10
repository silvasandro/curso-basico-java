package javaBasico.comLoianeGroner.Exercicios02;

import java.util.Scanner;

public class Exerc07 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num;
        int maior = Integer.MIN_VALUE;
        for (int i = 0; i < 5; i++){
            System.out.println("Entre com um número");
            num = scan.nextInt();

            if( num > maior){
                maior = num;
                System.out.println("Por enquanto este é o maior número: " + maior);
            }
        }
        System.out.println("O Maior número digitado foi: " + maior);
    }
}