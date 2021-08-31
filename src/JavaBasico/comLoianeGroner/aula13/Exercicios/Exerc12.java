package JavaBasico.comLoianeGroner.aula13.Exercicios;

import java.util.Scanner;

public class Exerc12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a altura:");
        double altura = scan.nextDouble();

        //(72.7 * altura) - 58 (58 é o peso ideal)
        double pesoIdeal = (72.7 * altura) - 58;

        System.out.println("O peso ideal é: " + pesoIdeal);







    }
}
