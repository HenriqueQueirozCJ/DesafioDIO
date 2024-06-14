package dio;

public abstract class Conta implements IConta {
    private static final int AGENCIA_PADRAO = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    private static int SEQUENCIAL = 1;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL;
        this.cliente = cliente;
        SEQUENCIAL++;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;

    }

    @Override
    public void depositar(double valor) {
        saldo += valor;

    }

    @Override
    public void transferir(double valor, Conta contadestino) {
        this.sacar(valor);
        contadestino.depositar(valor);

    }


    public void sacar() {

    }

    public void depositar() {

    }

    public void transferir() {

    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
    protected void ImprimirAtributos() {
        System.out.println(String.format("Titular %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia %d", this.agencia));
        System.out.println(String.format("Conta %d", this.numero));
        System.out.println(String.format("R$ %.2f", this.saldo));
    }
}



