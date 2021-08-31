package JavaBasico.comLoianeGroner.aula13.Exercicios;

import java.util.Scanner;

public class Exerc10 {
    //C = ( 5 * (F-32) / 9)
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a temperatura em Celsius:");
        double c = scan.nextDouble();

        double f =  ( c * 1.8 ) + 32;

        System.out.println("A temperatura em Celsius " + c + " é igual a " + f + " Farenhein");


    }

}
