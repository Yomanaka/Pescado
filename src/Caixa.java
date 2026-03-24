import java.util.ArrayList;
import java.util.List;
//Criacao e inicio do caixa, cria uma arraylist para as transações e inicia o saldo em 0
public class Caixa {
    private double saldo;
    private List<String> transacoes;
    public Caixa(){
        this.saldo = 0.0;
        this.transacoes = new ArrayList<>();
    }
    //metodo para registar a venda
    public void registrarVenda(String nomePeixe, double valor){
        //soma o saldo de cada venda
        this.saldo += valor;
        //cria uma lista das transações realizadas
        transacoes.add("Venda: " + nomePeixe + " - R$: " + valor);
    }
    //deixa o saldo publico para ser acessado de outro lugar e consecutivamente impresso na tela, tanto quanto as transações
    public double getSaldo(){return this.saldo;}

    public List<String> getTransacoes() {return transacoes;}
}
