//package JavaBasico.comLoianeGroner.AulasAleatorias;
//
//import javax.swing.*;
//
//public class ExercNumeroPrimo {
//    public static void main(String[] args) {
//        int[] n = new int[2];
//
//        for (int i = 0; i < n.length; i++) {
//            n[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (1 + i) + "º numero"));
//        }
//
//        for (int i = 0; i < n.length; i++) {
//            if( ehPrimo(n[i]) )
//                System.out.println(n[i] + " é primo. Posição no vetor: " + i);
//        }
//    }
//
//    private static boolean ehPrimo(int numero) {
//        for (int j = 2; j < numero; j++) {
//            if (numero % j == 0)
//                return false;
//        }
//        return true;
//    }
//}


//package JavaBasico.comLoianeGroner.AulasAleatorias;
//public class ExercNumeroPrimo {
//
//    public static void main(String[] args) {
//        for (int i = 2; i <= 100; i++) {
//            if( ehPrimo(i) )
//                System.out.println(i + " é primo.");
//        }
//    }
//
//    private static boolean ehPrimo(int numero) {
//        for (int j = 2; j < numero; j++) {
//            if (numero % j == 0)
//                return false;
//        }
//        return true;
//    }
//}




//Pedimos para o usuário informar a tabuada

package JavaBasico.comLoianeGroner.AulasAleatorias;

import java.util.Scanner;

public class ExercNumeroPrimo {

    public static void main(String[] args) {
        System.out.println("Digite a tabuada que você deseja: ");
        //Criamos uma instância da da classe Scanner
        Scanner in = new Scanner(System.in);
        //Pegamos o valor digitado pelo usuário
        int tabuada = in.nextInt();

        for(int i = 10; i >= 1; i--){
            //Ax X Bx = Cx
            //Ax -> valor informado pelo usuário
            //Bx -> valor a ser decrementado
            //Cx -> cálculo
            System.out.println(tabuada +
                    " x " +
                    i +
                    " = " +
                    (tabuada * i));
            // Ax X Bx = Cx
        }
    }
}
