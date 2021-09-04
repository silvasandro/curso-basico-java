package javaBasico.comLoianeGroner.AulasAleatorias;

import java.util.Scanner;

public class ExercBanana {
    public static void main(String[] args) {

        System.out.println("******************************** ");
        System.out.println("******* Escreva algo: ********** ");
        System.out.println("******************************** ");

        Scanner leitor = new Scanner(System.in);
        String texto = leitor.nextLine();
        leitor.close();

        for (int i = 0; i <= texto.length(); i++) {
            System.out.println(texto.substring(i) + texto.substring(0, i));
        }
        //Sandro Silva
    }
}