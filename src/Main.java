import br.edu.peixaria.application.port.in.CriarPescadoUseCase;
import br.edu.peixaria.application.service.CriarPescadoService;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Estoque meuEstoque = new Estoque();
        Caixa meuCaixa = new Caixa();
        CriarPescadoUseCase criarPescadoUseCase = new CriarPescadoService(meuEstoque);
        JFrame janela = new JFrame("Menu Peixaria");
        janela.setSize(400,300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(new FlowLayout());
        JButton botaoCadastrar = new JButton("Cadastrar Peixe");
        JButton botaoListar = new JButton("Listar Peixes");
        JButton botaoVender = new JButton("Vender Peixes");
        JButton botaoHistorico = new JButton("Histórico detalhado");
        janela.add(botaoCadastrar);
        janela.add(botaoListar);
        janela.add(botaoVender);
        janela.add(botaoHistorico);
        botaoCadastrar.addActionListener(e -> {
            new CadastrarPeixeAcao(criarPescadoUseCase).executar();
        });
        botaoListar.addActionListener(e -> {
            new ListarPeixesAcao(meuEstoque).executar();
        });
        botaoVender.addActionListener(e -> {
            new VenderPeixeAcao(meuEstoque, meuCaixa).executar();
        });
        botaoHistorico.addActionListener(e -> {
            new VerRelatorioAcao(meuCaixa).executar();
        });
        janela.setVisible(true);
    }
}