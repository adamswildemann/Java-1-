public class TesteReferencias {
    public static void main(String[] args) {

        Gerente g1 = new Gerente(); //lado direito é nome da classe que chama o construtor e cria o objeto
        g1.setNome("Luiz");
        g1.setSalario(5000.0);

        EditorVideo ev = new EditorVideo();
        ev.setSalario(2500.0);

        Designer d = new Designer();
        d.setSalario(2000.0);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(ev);
        controle.registra(d);

        System.out.println(controle.getSoma());


    }
}
