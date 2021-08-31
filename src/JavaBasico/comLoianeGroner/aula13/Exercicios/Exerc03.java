package JavaBasico.comLoianeGroner.aula13.Exercicios;

//Importando a classe Scanner para entrada de Dados.
import java.util.Scanner;

public class Exerc03 {

    public static void main(String[] args) {

        //Declarando a classe Scanner para entrada de Dados.
        Scanner scan = new Scanner(System.in);

        //Declarando a sout para captura de entrada de Dados
        System.out.println("Digite o primeiro número:");
        int num1 = scan.nextInt();

        //Declarando a sout para captura de entrada de Dados
        System.out.println("Digite o Segundo número:");
        int num2 = scan.nextInt();

        int resultado = num1 + num2;
        System.out.println("O Resultado da soma é :" + resultado);


    }
}



//Outro Exemplo
//
//    canner scanner = new Scanner(System.in);
//        System.out.print("Qual o seu nome: ");
//                String nome = scanner.next();
//                System.out.println("Seja bem vindo " + nome + "!");