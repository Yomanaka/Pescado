import java.util.ArrayList;
import java.util.List;
public class Estoque {
    private List<Pescado> listaDePeixes;

    public Estoque(){
        this.listaDePeixes = new ArrayList<>();
    }

    public void adicionarPeixe(Pescado peixeNovo){
        listaDePeixes.add(peixeNovo);
    }

    public void listarPeixes(){
        for(int i = 0; i < listaDePeixes.size();i++){
            // acessa o peixe da posição atual do loop para mostrar os dados dele na tela
            Pescado peixeAtual =  listaDePeixes.get(i);
            System.out.println((i+1) + " - Peixe: " + peixeAtual.getNome() + " Peso: " + peixeAtual.getPeso() + " Valor: " + peixeAtual.getPrecoVenda());
        }
    }
    //esse acessa o peixe pelo indíce, retorna e o remove da lista, tudo em uma tacada so a pardir do remove
    public Pescado pegarPeixe(int numeroDigitado){
        return listaDePeixes.remove(numeroDigitado - 1);
    }
    //retorna o tamanho da lista de peixes
    public int qtdPeixes(){
       return listaDePeixes.size();
    }
}
