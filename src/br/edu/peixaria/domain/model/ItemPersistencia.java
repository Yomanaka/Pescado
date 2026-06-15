package br.edu.peixaria.domain.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * Classe base das entidades persistentes.
 *
 * Esta classe preserva a ideia original do projeto: todo objeto salvo pelo
 * mini-framework possui um OID e informa seu br.edu.peixaria.domain.model.TipoEntidade. Isso facilita a
 * inclusão de uma nova entidade, pois ela passa a "encaixar" no framework.
 */
public abstract class ItemPersistencia implements Serializable {
    private static final long serialVersionUID = 1L;

    private final String oid;
    private final TipoEntidade tipoEntidade;

    protected ItemPersistencia(String oid, TipoEntidade tipoEntidade) {
        if (oid == null || oid.trim().isEmpty()) {
            throw new IllegalArgumentException("OID não pode ser vazio.");
        }
        if (tipoEntidade == null) {
            throw new IllegalArgumentException("Tipo da entidade não pode ser nulo.");
        }
        this.oid = oid.trim();
        this.tipoEntidade = tipoEntidade;
    }

    public String getOID() {
        return oid;
    }

    public TipoEntidade getTipoEntidade() {
        return tipoEntidade;
    }

    @Override
    public boolean equals(Object outro) {
        if (this == outro) {
            return true;
        }
        if (!(outro instanceof ItemPersistencia)) {
            return false;
        }
        ItemPersistencia that = (ItemPersistencia) outro;
        return Objects.equals(oid, that.oid) && tipoEntidade == that.tipoEntidade;
    }

    @Override
    public int hashCode() {
        return Objects.hash(oid, tipoEntidade);
    }
}
