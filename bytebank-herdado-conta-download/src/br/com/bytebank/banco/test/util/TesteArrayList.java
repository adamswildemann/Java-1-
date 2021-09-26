package br.com.bytebank.banco.test.util;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.*;

public class TesteArrayList {
    public static void main(String[] args) {

        //generico
        Collection<Conta> lista = new ArrayList<Conta>();

        Conta cc1 = new ContaCorrente(22, 11);
        lista.add(cc1);

        Conta cc2 = new ContaCorrente(22, 22);
        lista.add(cc2);

        System.out.println("Tamanho: " + lista.size());
        Conta ref = ((ArrayList<Conta>) lista).get(0);
        System.out.println(ref.getNumero());

        lista.remove(0);

        System.out.println("Tamanho: " + lista.size());

        Conta cc3 = new ContaCorrente(33, 311);
        lista.add(cc3);
        Conta cc4 = new ContaCorrente(33, 322);
        lista.add(cc4);

        //acessar cada elemento
        for (int i = 0; i < lista.size(); i++){
            Object oRef = ((ArrayList<Conta>) lista).get(i);
            System.out.println(oRef);
        }

        //outra forma de acessar cada elemento
        for(Conta conta: lista){
            System.out.println(conta);
        }

    }
}
