public class VerRelatorioAcao implements Acao {
    //caixa da loja para consultar os dados financeiros
    private Caixa meuCaixa;

    //caixa único da Main para garantir que leremos os dados reais
    public VerRelatorioAcao(Caixa meuCaixa) {
        this.meuCaixa = meuCaixa;
    }

    @Override
    public void executar() {
        System.out.println("--- RELATÓRIO FINANCEIRO ---");
        // Mostra o saldo
        System.out.println("Saldo atual R$: " + meuCaixa.getSaldo());

        System.out.println("\n--- HISTÓRICO DE VENDAS ---");
        // passa em todas as listas de transação e retorna cada uma no consele
        for (String t : meuCaixa.getTransacoes()){
            System.out.println(t);
        }
    }
}