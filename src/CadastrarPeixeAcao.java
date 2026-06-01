import javax.swing.*;
public class CadastrarPeixeAcao implements Acao{
    private Estoque peixes;


    public CadastrarPeixeAcao (Estoque peixes){
        this.peixes = peixes;
    }

    @Override
    public void executar(){
        String peixe = JOptionPane.showInputDialog("Digite o nome do peixe: ");
        Pescado.Especie especieEscolhida = null;
        int opcaoEspecie = Integer.parseInt(JOptionPane.showInputDialog("1- Peixe de Água doce\n "+ "2- Peixe de Água salgada\n "
                +"3- Marisco\n "+ "4- Crustaceo\n "+"Digite o núemro equivalente: \n"));
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
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso do peixe em KG: "));
        double preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço de compra: "));
        //Recebe o novo peixe cadastrado
        Pescado novoPeixe = new Pescado(peixe, especieEscolhida,peso ,preco);
        //Inlcui na lista / estoque dos peixes
        peixes.adicionarPeixe(novoPeixe);
        JOptionPane.showMessageDialog(null,"Peixe cadastrado com sucesso");
    }
}
