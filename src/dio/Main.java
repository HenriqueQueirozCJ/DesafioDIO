package dio;

public class Main {
    public static void main(String[] args) {
        Cliente henrique = new Cliente();
        henrique.setNome("Henrique");

        Conta cc = new ContaCorrente(henrique);
        Conta cp = new ContaPoupanca(henrique);
        cc.depositar(200);
        cc.transferir(20,cp);
        cc.ImprimirExtrato();
        cp.ImprimirExtrato();
    }
}