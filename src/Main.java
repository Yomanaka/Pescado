import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Estoque meuEstoque = new Estoque();
        Menu menuPrincipal = new Menu("MENU DA PEIXARIA");
        menuPrincipal.adicionar("1","Cadastrar Peixe", new CadastrarPeixeAcao(meuEstoque, leitor));
        menuPrincipal.adicionar("2","Listar Peixes",new ListarPeixesAcao(meuEstoque));
        menuPrincipal.adicionar("0","Sair (finalizar programa)",new FinalizarAcao());
    }
}