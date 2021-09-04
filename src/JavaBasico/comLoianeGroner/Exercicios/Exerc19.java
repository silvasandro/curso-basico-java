package JavaBasico.comLoianeGroner.Exercicios;
/*
* Faça um Programa que leia 2 números e em seguida pergunte ao usuário
* qual operação deseja realizar. O resultado da operação
* deve ser acompanhado de uma frase que diga se o número é:
* par ou impar
* positivo ou negativo
* */
import java.util.Scanner;

public class Exerc19 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o primeiro número");
        float num1 = scan.nextInt();

        System.out.println("Entre com o segundo número");
        float num2 = scan.nextInt();

        System.out.println("Entre com a operação ( +  -  /  +  ): ");
        String operacao = scan.next();

        double resultado = 0;
        boolean valida = true;


        switch (operacao) {
            case "+" -> resultado = num1 + num2;
            case "-" -> resultado = num1 - num2;
            case "*" -> resultado = num1 * num2;
            case "/" -> resultado = num1 / num2;
            default -> {
                System.out.println("Operação Inválida!");
                valida = false;
            }
        }
        if (valida){
            System.out.println("Resultado: " + resultado);
            if (resultado >= 0) {
                System.out.println("Resultado Positivo");
            } else {
                System.out.println("Resultado Negativo");
            }
            if  (resultado % 2 == 0){
                System.out.println("é PAR");
            } else {
                System.out.println("é IMPAR");
            }
        }
    }
}
