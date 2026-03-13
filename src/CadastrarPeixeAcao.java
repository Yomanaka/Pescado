import java.util.Scanner;
public class CadastrarPeixeAcao implements Acao{
    private Estoque peixes;
    private Scanner leitor;


    public CadastrarPeixeAcao (Estoque peixes, Scanner leitor){
        this.peixes = peixes;
        this.leitor = leitor;
    }

    @Override
    public void executar(){
        System.out.println("Digite o nome do peixe: ");
        String peixe = leitor.nextLine();
        System.out.println("1 - PEIXEDOCE" +
                "2 - PEIXEMAR" +
                "3 - MARISCO" +
                "4 - CRUSTACEO");
        int opcaoEspecie = leitor.nextInt();
        System.out.println("Informe o peso do peixe: ");
        double peso = leitor.nextDouble();
        System.out.println("Informe o preço de compra: ");
        double preco = leitor.nextDouble();
        // Tira o bug do teclado pegar buffer do enter
        leitor.nextLine();
    }
}
