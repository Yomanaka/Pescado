import br.edu.peixaria.application.port.in.CriarPescadoUseCase;
import br.edu.peixaria.domain.model.Pescado;

import javax.swing.*;
public class CadastrarPeixeAcao implements Acao{
    private CriarPescadoUseCase criarPescadoUseCase;


    public CadastrarPeixeAcao (CriarPescadoUseCase criarPescadoUseCase){
        this.criarPescadoUseCase = criarPescadoUseCase;
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

        try{
            //Recebe o novo peixe cadastrado
            //Inlcui na lista / estoque dos peixes
            criarPescadoUseCase.cadastrarPescado(peixe, especieEscolhida, peso, preco);
            JOptionPane.showMessageDialog(null,"Peixe cadastrado com sucesso");
        }catch (Exception erro){
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar: " + erro.getMessage());
        }
    }
}
