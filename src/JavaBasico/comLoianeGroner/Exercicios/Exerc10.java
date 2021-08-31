package JavaBasico.comLoianeGroner.Exercicios;

/*
 * Faça um Programa que pergunte em que turno você estuda.
 * Peça para digitar M- Matutino , V- Vespertino ou N- Noturno.
 * Imprima a mensagem "Bom Dia", "Boa Tarde" ou "Boa Noite" ou "Valor Inválido", conforme o caso.
 * */

import java.util.Scanner;

public class Exerc10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o turno que você estuda:");
        String turno = scan.next();

        switch (turno){
            case "m":
            case "M":System.out.println("Bom dia!"); break;
            case "v":
            case "V":System.out.println("Boa Tarde!"); break;
            case "n":
            case "N":System.out.println("Boa Noite!"); break;
            default:
                System.out.println("Valor Inválido");
        }
    }
}
