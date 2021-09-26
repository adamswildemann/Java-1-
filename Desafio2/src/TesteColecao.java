import java.util.ArrayList;

public class TesteColecao {

    public static void main(String[] args) {

        ArrayList<LampadaDetalhes> lampadas = new ArrayList<LampadaDetalhes>();

        lampadas.add(new LampadaDetalhes(60, 220));
        lampadas.add(new LampadaDetalhes(80, 110));
        lampadas.add(new LampadaDetalhes(100, 220));
        lampadas.add(new LampadaDetalhes(120, 110));
        lampadas.add(new LampadaDetalhes(140, 220));

        ligarLampadas(lampadas);

    }

    public static void ligarLampadas(ArrayList<LampadaDetalhes> lampadas) {
        for (int i = 0; i < lampadas.size(); i++) {
            lampadas.get(i).liga();
            System.out.println(lampadas.get(i).getEstado());
        }
    }
}
