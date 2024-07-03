package Projeto_03_07.Conta_Corrente_Poupanca;

public class ContaPoupanca extends Conta{

    private float deposito;

    ContaPoupanca(String titular, String senha, float deposito){
        super(titular, senha);
        this.saldo = deposito;
    }

    public boolean sacar(float valor){
        if(valor <= saldo){
            saldo -= valor;
            return true;
        }
        return false;
    }

    public String verificaSaldo(){
        return String.format("O saldo da conta é R$%.2f", saldo);
    }

}
