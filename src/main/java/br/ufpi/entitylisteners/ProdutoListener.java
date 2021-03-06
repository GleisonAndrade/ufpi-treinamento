package br.ufpi.entitylisteners;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;

import br.ufpi.entidades.Produto;

public class ProdutoListener {

	@PersistenceContext
	private EntityManager em;

	@PrePersist
	public void salvar(Produto produto) {
		if (produto.getDescricao().toLowerCase().startsWith("b"))
			throw new RuntimeException("não pode ser B");
	}

	@PreRemove
	public void remove(Produto produto) {

	}

	@PreUpdate
	public void atualizar(Produto produto) {

	}

}
