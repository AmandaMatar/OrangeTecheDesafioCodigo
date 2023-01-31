package desafios;

import java.util.Scanner;

public class LojinhaDoce {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int dinheiro = leitor.nextInt();
        int quantosDoces = dinheiro * 2;
        System.out.println("O cliente obteve " + quantosDoces + " doces");
    }
}
