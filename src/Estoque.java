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
        for(Pescado peixeNovo : listaDePeixes){
            System.out.println("Peixe: " + peixeNovo.getNome() + " Peso: " + peixeNovo.getPeso() + "Valor: " + peixeNovo.getPrecoVenda());
        }
    }
}
