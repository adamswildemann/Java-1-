public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDoAdams = new Conta();
        contaDoAdams.saldo = 100;
        contaDoAdams.deposita(50);
        System.out.println(contaDoAdams.saldo);

        boolean conseguiuRetirar = contaDoAdams.saca(20);
        System.out.println(contaDoAdams.saldo);
        System.out.println(conseguiuRetirar);

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(1000);

        boolean sucessoTransferencia = contaDaMarcela.transfere(3000, contaDoAdams);

        if(contaDaMarcela.transfere(3000, contaDoAdams)) {
            System.out.println("transferencia feita com sucesso");
        } else {
            System.out.println("saldo insuficiente");
        }

        contaDaMarcela.transfere(300, contaDoAdams);
        System.out.println(contaDaMarcela.saldo);
        System.out.println(contaDoAdams.saldo);

        contaDoAdams.titular = "paulo";
        System.out.println(contaDoAdams.titular);

    }
}
