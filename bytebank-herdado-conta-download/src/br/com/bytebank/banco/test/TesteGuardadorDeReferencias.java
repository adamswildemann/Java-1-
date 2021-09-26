package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.GuardadorDeReferencias;

public class TesteGuardadorDeReferencias {
    public static void main(String[] args) {

        GuardadorDeReferencias guardador = new GuardadorDeReferencias();

        Conta cc = new ContaCorrente(22, 11);
        guardador.adiciona(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        guardador.adiciona(cc2);

        int tamanho = guardador.getQtdDeElementos();
        System.out.println(tamanho);

        //na hora de chamar a referencia da posição 1, ele devolve um object, e aí se faz um cast
        //pra receber uma referencia do tipo conta, uma referencia mais especifica. Transformando uma
        //referencia generica em uma mais especifica
        Conta ref = (Conta) guardador.getReferencia(1);
        System.out.println(ref.getNumero());

    }
}
