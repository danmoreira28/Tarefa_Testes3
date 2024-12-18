package br.com.danilo.dao.jpa;

/**
 * @author danmoreira28
 */

import br.com.danilo.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.danilo.domain.jpa.ProdutoJpa;

public class ProdutoJpaDAO extends GenericJpaDB1DAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
