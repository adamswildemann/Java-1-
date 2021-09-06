package br.com.bytebank.banco.test;

public class Teste {

    //array []
    public static void main(String[] args) {

        int [] idades = new int [5]; //inicializa cada posição do array com 0

        idades[0] = 29;
        idades[1] = 39;
        idades[2] = 52;
        idades[3] = 72;
        idades[4] = 99;

        int idade4 = idades[4];

        System.out.println(idade4);
        System.out.println(idades.length);

    }
}
