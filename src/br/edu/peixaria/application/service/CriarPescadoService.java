package br.edu.peixaria.application.service;

import br.edu.peixaria.application.port.in.CriarPescadoUseCase;
import br.edu.peixaria.application.port.out.PescadoRepository;
import br.edu.peixaria.domain.model.Pescado;

public class CriarPescadoService implements CriarPescadoUseCase {
    private PescadoRepository repository;
    public CriarPescadoService(PescadoRepository repository) {
        this.repository = repository;
    }
    @Override
    public void cadastrarPescado(String nome, Pescado.Especie especie, double peso, double preco) {
        String oid = java.util.UUID.randomUUID().toString();
        Pescado novoPeixe = new Pescado(oid, nome, especie, peso, preco);
        repository.salvarEstoque(novoPeixe);
    }
}
