import java.util.Random;

public class Lampada {

    private boolean estado;
    private boolean queimada;

    public Lampada() {
        this.estado = false;
        this.queimada = false;
    }

    public void liga() {
        if (!queimada) {
            Random gerador = new Random();
            int valor = gerador.nextInt(100) + 1;
            if (valor < 15) {
                queimada = true;
                estado = false;
                System.out.println("Lâmpada queimada");
            } else {
                estado = true;
            }
        }
    }

    public void desliga() {
        estado = false;
    }

    public boolean getEstado() {
        return estado;
    }

    public boolean verificaEstado() {
        if (this.estado == false) {
            System.out.println("A lâmpada está desligada");
            return false;
        } else {
            System.out.println("A lâmpada está ligada");
            return true;
        }
    }

    public String toString() {
        return "Lampada - " + this.estado;
    }
}

