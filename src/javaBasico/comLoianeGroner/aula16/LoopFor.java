package javaBasico.comLoianeGroner.aula16;

public class LoopFor {
    public static void main(String[] args) {

        for (int i = 5; i > 0; --i) {
            System.out.println("i tem valor: " + i );
        }


        for (int i = 5; i > 0; i--){
            System.out.println("I Tem valor : " + i);
        }


        for (int i = 0, j = 10; i < j; i++, j--){
            System.out.println("i = " + i + " J = " + j);
        }

        int count = 0;
        for (; count < 10; ) {
            System.out.println("Valor de Count: " + count);
            count += 2;
        }

        for (int cont = 0; cont < 10; cont += 2) {
            System.out.println("Valor de Count: " + cont);
        }

        int soma = 0;
        for (int i = 1; i < 5; soma += i++) {
            System.out.println("O Valor da soma é " + soma);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("i tem valor: " + i );
            System.out.println("i tem valor: "  );

        }
    }
}
