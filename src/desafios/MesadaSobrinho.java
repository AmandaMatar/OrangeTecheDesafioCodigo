package desafios;

import java.util.Scanner;

public class MesadaSobrinho {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int entrada = leitor.nextInt();
        int mesada = 50;
        int juntou = entrada * mesada;

        System.out.println(juntou);
    }
}