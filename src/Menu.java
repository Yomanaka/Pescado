import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//criacao do menu
public class Menu {
    private String titulo;
    private List<Opcao> opcoes;

    public Menu(String titulo){
        this.titulo = titulo;
        this.opcoes = new ArrayList<>();
    }
    //método responsável por adicionar uma nova opção no Menu
    public void adicionar(String menuOpcao, String descricao, Acao acoes){
        opcoes.add(new Opcao( menuOpcao, descricao, acoes));
    }
    // loop infinito para imprimir o menu pelo for each, recebe o valor na variavel escolha e faz a tratativa de acordo com a mesma
    public void exibirMenu(Scanner leitor){
        while(true){
            System.out.println("\n\n---"+titulo+"---");
            for (Opcao op : opcoes){
                System.out.println(op.menuOpcao +" - " + op.descricao);
            }
            System.out.println("Escolha uma opção: ");
            String escolha = leitor.nextLine();
            for (Opcao op : opcoes){
                if(escolha.equals(op.menuOpcao)){
                    op.acoes.executar();
                    break;
                }
            }
        }
    }
    private class Opcao {
        String menuOpcao;
        String descricao;
        Acao acoes;

            public Opcao(String menuOpcao, String descricao, Acao acoes) {
            this.menuOpcao = menuOpcao;
            this.descricao = descricao;
            this.acoes = acoes;
        }
    }
}
