import java.util.ArrayList;

public class TestaLustre {

    public static void main(String[] args) {

        Lustre lustre = new Lustre(3);

        lustre.addLampada(new Lampada(), 0);
        lustre.addLampada(new Lampada(), 1);
        lustre.addLampada(new Lampada(), 2);

        lustre.ligarLampadas();

        lustre.desligarLampadas();

        lustre.checarLampadas();

        lustre.removerLampada(2);

        lustre.checarLampadas();
    }
}