package br.com.danilo.dao.generic.jpa;

/**
 * @author danmoreira28
 */

import java.io.Serializable;

import br.com.danilo.domain.jpa.Persistente;

public abstract class GenericJpaDB2DAO <T extends Persistente, E extends Serializable>
	extends GenericJpaDAO<T,E> {

	public GenericJpaDB2DAO(Class<T> persistenteClass) {
		super(persistenteClass, "Postgre2");
	}

}
