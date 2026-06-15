import br.edu.peixaria.domain.model.Pescado;

import javax.swing.*;
public class VenderPeixeAcao implements Acao{
    private Estoque meuEstoque;
    private Caixa meuCaixa;

    public VenderPeixeAcao(Estoque meuEstoque, Caixa meuCaixa){
        this.meuEstoque = meuEstoque;
        this.meuCaixa = meuCaixa;
    }

    @Override
    public void executar() {
        if (meuEstoque.qtdPeixes()<= 0){
            JOptionPane.showMessageDialog(null,"Cadaster ao menos um peixe antes");
            return;
        }
        int escolhido = 0;
        do {
        //recebe ele por string nextLine, e faz a transferência para inteiro para que não haja erro no buffer, ao passo que também faz a validação se foi inserido um valor válido
            escolhido = Integer.parseInt(JOptionPane.showInputDialog(null, meuEstoque.listarPeixes() + "\nInforme o número do peixe que deseja comprar: "));
        }while(escolhido < 1 || escolhido > meuEstoque.qtdPeixes());
        // Remove o peixe escolhido da geladeira (estoque) e guarda os dados dele na variável
        Pescado peixeVendido = meuEstoque.pegarPeixe(escolhido);
        // Registra a entrada do dinheiro e anota o recibo na gaveta (caixa) com os dados do peixe
        meuCaixa.registrarVenda(peixeVendido.getNome(), peixeVendido.getPrecoVenda());
        JOptionPane.showMessageDialog(null,"Transação autorizada");
    }
}
