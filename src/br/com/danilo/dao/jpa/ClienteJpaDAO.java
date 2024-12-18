package br.com.danilo.dao.jpa;

/**
 * @author danmoreira28
 */

import br.com.danilo.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.danilo.domain.jpa.ClienteJpa;

public class ClienteJpaDAO extends GenericJpaDB1DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
