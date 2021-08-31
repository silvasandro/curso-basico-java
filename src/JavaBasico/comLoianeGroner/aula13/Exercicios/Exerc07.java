package JavaBasico.comLoianeGroner.aula13.Exercicios;

import java.util.Scanner;

public class Exerc07 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o tamanho do Lado do Quadrado");
        double lado = scan.nextDouble();

        //area = lado * lado
        double area = Math.pow (lado, 2);

        System.out.println("A Área do Quadrado é: " + area);
        System.out.println("O Dobro da Área do Quadrado é: " + (area * 2));
    }
}
