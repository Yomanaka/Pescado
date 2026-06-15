package br.edu.peixaria.application.port.in;

import br.edu.peixaria.domain.model.Pescado;

public interface CriarPescadoUseCase {
    void cadastrarPescado(String nome, Pescado.Especie especie, double peso, double preco);
}
