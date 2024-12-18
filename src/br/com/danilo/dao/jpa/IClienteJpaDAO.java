package br.com.danilo.dao.jpa;

/**
 * @author danmoreira28
 */

import br.com.danilo.dao.generic.jpa.IGenericJapDAO;
import br.com.danilo.domain.jpa.Persistente;

public interface IClienteJpaDAO<T extends Persistente> extends IGenericJapDAO<T, Long>{

}
