public class TesteFuncionario {

    public static void main(String[] args) {

        FuncionarioAutenticavel cliente = new Cliente();

        Gerente adams = new Gerente();
        adams.setNome("Adams Wildemann");
        adams.setCpf("0258330708-8");
        adams.setSalario(2600.00);

        System.out.println(adams.getNome());
        System.out.println(adams.getBonificacao());

    }
}
