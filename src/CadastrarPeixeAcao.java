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
        System.out.println("\nInforme um número relativo a espécie"+"\n1 - PEIXEDOCE" +
                "\n2 - PEIXEMAR" +
                "\n3 - MARISCO" +
                "\n4 - CRUSTACEO");
        Pescado.Especie especieEscolhida = null;
        int opcaoEspecie = leitor.nextInt();
        switch(opcaoEspecie){
            case 1:
                especieEscolhida = Pescado.Especie.PEIXEDOCE;
                break;
            case 2:
                especieEscolhida = Pescado.Especie.PEIXEMAR;
                break;
            case 3:
                especieEscolhida = Pescado.Especie.MARISCO;
                break;
            case 4:
                especieEscolhida = Pescado.Especie.CRUSTACEO;
                break;
        }
        System.out.println("Informe o peso do peixe: ");
        double peso = leitor.nextDouble();
        System.out.println("Informe o preço de compra: ");
        double preco = leitor.nextDouble();
        // Tira o bug do teclado pegar buffer do enter
        leitor.nextLine();
        //Recebe o novo peixe cadastrado
        Pescado novoPeixe = new Pescado(peixe, especieEscolhida,peso ,preco );
        //Inlcui na lista / estoque dos peixes
        peixes.adicionarPeixe(novoPeixe);
    }
}
