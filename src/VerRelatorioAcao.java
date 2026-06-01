import javax.swing.*;

public class VerRelatorioAcao implements Acao {
    //caixa da loja para consultar os dados financeiros
    private Caixa meuCaixa;

    //caixa único da Main para garantir que leremos os dados reais
    public VerRelatorioAcao(Caixa meuCaixa) {
        this.meuCaixa = meuCaixa;
    }

    @Override
    public void executar() {
        String acumulador ="";

        // passa em todas as listas de transação e retorna cada uma no console
        for (String t : meuCaixa.getTransacoes()){
            acumulador += t + "\n";
        }
            JOptionPane.showMessageDialog(null,"--- RELATÓRIO FINANCEIRO ---\n" + "Saldo atual R$: " + meuCaixa.getSaldo() + "\n" +"\n--- HISTÓRICO DE VENDAS ---" + acumulador);
    }
}