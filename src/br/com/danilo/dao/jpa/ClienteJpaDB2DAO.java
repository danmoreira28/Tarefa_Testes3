package br.com.danilo.dao.jpa;

/**
 * @author danmoreira28
 */

import br.com.danilo.dao.generic.jpa.GenericJpaDB2DAO;
import br.com.danilo.domain.jpa.ClienteJpa;

public class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDB2DAO() {
		super(ClienteJpa.class);
	}

}
