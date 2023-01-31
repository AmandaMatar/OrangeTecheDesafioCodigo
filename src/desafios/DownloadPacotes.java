package desafios;

import java.util.Scanner;

public class DownloadPacotes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanho = leitor.nextInt();
        if (tamanho>= 1 && tamanho<=10){

            for (int i = 0; i < tamanho; i++){

                System.out.print("/");

            }

            System.out.println("");

        }

        else {

            System.out.println("Opção errada fim do programa!");

        }

    }

}