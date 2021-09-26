package br.com.bytebank.banco.modelo;

public class GuardadorDeReferencias {

    private Object[] referencias;
    private int posicaoLivre;

    public GuardadorDeReferencias(){
        this.referencias = new Object[10];
        this.posicaoLivre = 0;
    }

    public void adiciona(Object ref){
        this.referencias[this.posicaoLivre] = ref;
        this.posicaoLivre++;

    }

    public int getQtdDeElementos() {
        return this.posicaoLivre;
    }

    //publico do tipo conta que retorna uma referencia
    public Object getReferencia(int pos) {
        return this.referencias[pos];
    }
}
