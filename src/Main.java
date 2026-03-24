import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //inicia as instancias, cria o estoque, o caixa e a comunicação com o usuário
        Scanner leitor = new Scanner(System.in);
        Estoque meuEstoque = new Estoque();
        Caixa meuCaixa= new Caixa();
        Menu menuPrincipal = new Menu("MENU DA PEIXARIA");
        menuPrincipal.adicionar("1","Cadastrar Peixe", new CadastrarPeixeAcao(meuEstoque, leitor));
        menuPrincipal.adicionar("2","Listar Peixes",new ListarPeixesAcao(meuEstoque));
        menuPrincipal.adicionar("3","Vender peixes",new VenderPeixeAcao(leitor, meuEstoque, meuCaixa));
        menuPrincipal.adicionar("4","Histórico detalhado",new VerRelatorioAcao(meuCaixa));
        menuPrincipal.adicionar("0","Sair (finalizar programa)",new FinalizarAcao());
        menuPrincipal.exibirMenu(leitor);
    }
}