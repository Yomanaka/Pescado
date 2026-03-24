import java.util.Scanner;
public class VenderPeixeAcao implements Acao{
    private Scanner leitor;
    private Estoque meuEstoque;
    private Caixa meuCaixa;

    public VenderPeixeAcao(Scanner leitor, Estoque meuEstoque, Caixa meuCaixa){
        this.leitor = leitor;
        this.meuEstoque = meuEstoque;
        this.meuCaixa = meuCaixa;

    }

    @Override
    public void executar() {
        if (meuEstoque.qtdPeixes()<= 0){
            System.out.println("Cadaster ao menos um peixe antes");
            return;
        }
        meuEstoque.listarPeixes();
        int escolhido = 0;
        do {
        System.out.println("Informe o número do peixe que deseja comprar: ");
        //recebe ele por string nextLine, e faz a transferência para inteiro para que não haja erro no buffer, ao passo que também faz a validação se foi inserido um valor válido
        escolhido = Integer.parseInt(leitor.nextLine());
        }while(escolhido < 1 || escolhido > meuEstoque.qtdPeixes());
        // Remove o peixe escolhido da geladeira (estoque) e guarda os dados dele na variável
        Pescado peixeVendido = meuEstoque.pegarPeixe(escolhido);
        // Registra a entrada do dinheiro e anota o recibo na gaveta (caixa) com os dados do peixe
        meuCaixa.registrarVenda(peixeVendido.getNome(), peixeVendido.getPrecoVenda());
        System.out.println("Transação autorizada");
    }
}
