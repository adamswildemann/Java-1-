public class LampadaDetalhes extends Lampada {

    private int potencia;
    private int voltagem;

    public LampadaDetalhes(int potencia, int voltagem) {
        super();
        this.potencia = potencia;
        this.voltagem = voltagem;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

}

