class Conta {
    int numero;
    String dono;
    double saldo;
    double limite;

    // Os metodos que ultilizam o .this
    boolean saca(double valor) {
        if (this.saldo < valor) {
            return false;
        } else {
            this.saldo = this.saldo - valor;
            return true;
        }
    }

    void deposita(double quantidade) {
        this.saldo += quantidade;
    }
}