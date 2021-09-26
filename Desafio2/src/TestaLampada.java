public class TestaLampada {

    public static void main(String[] args) {

        LampadaDetalhes l1 = new LampadaDetalhes(60, 220);

        l1.verificaEstado();

        System.out.println("A lâmpada possui " + l1.getPotencia() + " watts");
        System.out.println("A lâmpada possui " + l1.getVoltagem() + " volts");

        l1.liga();
        l1.verificaEstado();

        System.out.println("A lâmpada possui " + l1.getPotencia() + " watts");
        System.out.println("A lâmpada possui " + l1.getVoltagem() + " volts");

    }
}
