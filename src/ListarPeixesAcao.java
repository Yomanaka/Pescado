public class ListarPeixesAcao implements Acao{
    // gaveta que guarda a referência do nosso banco de dados em memória
    private Estoque meuEstoque;
    // recebe o estoque principal do 'Main' e conecta com a nossa gaveta
    public ListarPeixesAcao(Estoque meuEstoque){
       this.meuEstoque = meuEstoque;
    }

    @Override
    public void executar() {
        meuEstoque.listarPeixes();
    }
}
