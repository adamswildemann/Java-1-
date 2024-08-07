package br.com.bytebank.banco.modelo;

public class GuardadorDeContas {

    private Conta[] referencias;
    private int posicaoLivre;

    public GuardadorDeContas(){
        this.referencias = new Conta[10];
        this.posicaoLivre = 0;
    }

    public void adiciona(Conta ref){
        this.referencias[this.posicaoLivre] = ref;
        this.posicaoLivre++;

    }

    public int getQtdDeElementos() {
        return this.posicaoLivre;
    }

    //publico do tipo conta que retorna uma referencia
    public Conta getReferencia(int pos) {
        return this.referencias[pos];
    }
}
