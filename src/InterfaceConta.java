public interface IntarfaceConta {

    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, InterfaceConta);
    void imprimirExtrato();

}
