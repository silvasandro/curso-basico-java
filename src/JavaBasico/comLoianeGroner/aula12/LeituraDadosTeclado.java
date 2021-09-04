package JavaBasico.comLoianeGroner.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o seu primeiro nome, idade, qtd de filhos, altura e se tem bichinho de estimação");
        String primeiroNome = scan.next();
        int idade = scan.nextInt();
        byte qtdFilhos = scan.nextByte();
        float altura = scan.nextFloat();
        boolean temPet = scan.nextBoolean();

        System.out.println("você digitou os seguintes valores: ");
        System.out.println("Primeiro Nome: " + primeiroNome);
        System.out.println("Idade: " + idade);
        System.out.println("Quantidade de Filhos: " + qtdFilhos);
        System.out.println("altura:" + altura);
        System.out.println("Tem bichinho de Estimação? " + temPet);



    }
}















//
//        System.out.println("Digite seu primeiro nome:");
//        String primeiroNome = scan.next();
//        System.out.println("Seu primeiro nome é: " + primeiroNome);
//
//        System.out.println("Digite seu sobrenome:");
//        String sobrenome = scan.next();
//        System.out.println("Seu sobrenome é: " + sobrenome);
//
//        System.out.println("Digite seu nome completo:");
//        String nomeCompleto = scan.next();
//        System.out.println("Seu nome completo é: " + nomeCompleto);
//
//        System.out.println("Digite a sua idade:");
//        int idade = scan.nextInt();
//        System.out.println("Sua idade é:" + idade);
//
//        System.out.println("digite a sua altura:");
//        double altura = scan.nextDouble();
//        System.out.println("A Sua altura é:" + altura);


//
//    Scanner scan = new Scanner(System.in);
//
//        System.out.println("Digite seu primeiro nome, idade, quantidade de filhos, altura e se tem bichinho de estimação:");
//                String primeiroNome = scan.next();
//                int idade = scan.nextInt();
//                byte qtdFilhos = scan.nextByte();
//                float altura = scan.nextFloat();
//                boolean temPet = scan.nextBoolean();
//
//                System.out.println("Você digitou os seguintes valores:");
//                System.out.println("Primeiro nome: " + primeiroNome);
//                System.out.println("Idade: " + idade);
//                System.out.println("Quantidade de Filhos: " + qtdFilhos);
//                System.out.println("Sua altura: " + altura);
//        System.out.println("Se possui Pet: " + temPet);

//System.out.println("Digite seu primero nome: ");
//        String primeiroNome = scan.nextLine();
//        System.out.println("Seu primeiro nome é: " + primeiroNome);
//
//        System.out.println("Digite seu Sobrenome: ");
//        String sobrenome = scan.nextLine();
//        System.out.println("Seu Sobrenome nome é: " + sobrenome);
//
//        System.out.println("Digite seu nome completo: ");
//        String nomeCompleto = scan.nextLine();
//        System.out.println("Seu nome completo é: " + nomeCompleto);

//
//        System.out.println("Digite a sua idade:");
//        int idade = scan.nextInt();
//        System.out.println("Sua idade é: " + idade);
//
//        System.out.println("Digite a sua altura:");
//        int altura = scan.nextInt();
//        System.out.println("Sua altura é: " + altura);