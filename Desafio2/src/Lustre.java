import java.util.ArrayList;

public class Lustre {

    private Lampada[] lampadas;

    public Lustre(int maximoLampadas) {
        this.lampadas = new Lampada[maximoLampadas];
    }

    public void addLampada(Lampada lampada, int posicao) {
        if (lampadas[posicao] == null) {
            lampadas[posicao] = lampada;
            System.out.println("A lâmpada foi adicionada no lustre");
        } else {
            System.out.println("Já existe uma lâmpada nesta posição");
        }
    }

    public void removerLampada(int posicao){
        if (lampadas[posicao] != null){
            lampadas[posicao] = null;
            System.out.println("Lâmpada retirada");
        }
    }

    public void ligarLampadas() {
        for (int i = 0; i < lampadas.length; i++) {
            lampadas[i].liga();
            System.out.println(lampadas[i].getEstado());
        }
    }

    public void desligarLampadas() {
        for (int i = 0; i < lampadas.length; i++) {
            lampadas[i].desliga();
            System.out.println(lampadas[i].getEstado());
        }
    }

    public void checarLampadas(){
        for (int i = 0; i < lampadas.length; i++) {
            System.out.println(i + " - " + lampadas[i]);
        }
    }
}

