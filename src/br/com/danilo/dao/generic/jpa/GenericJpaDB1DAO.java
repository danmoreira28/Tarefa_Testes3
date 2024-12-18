package br.com.danilo.dao.generic.jpa;

/**
 * @author danmoreira28
 */

import java.io.Serializable;

import br.com.danilo.domain.jpa.Persistente;

public abstract class GenericJpaDB1DAO <T extends Persistente, E extends Serializable>
	extends GenericJpaDAO<T,E> {

	public GenericJpaDB1DAO(Class<T> persistenteClass) {
		super(persistenteClass, "Postgre1");
	}

}
