package br.com.danilo.services.generic.jpa;

/**
 * @author danmoreira28
 */

import java.io.Serializable;
import java.util.Collection;

import br.com.danilo.dao.generic.jpa.IGenericJapDAO;
import br.com.danilo.domain.jpa.Persistente;
import br.com.danilo.exceptions.DAOException;
import br.com.danilo.exceptions.MaisDeUmRegistroException;
import br.com.danilo.exceptions.TableException;
import br.com.danilo.exceptions.TipoChaveNaoEncontradaException;

public abstract class GenericJpaService<T extends Persistente, E extends Serializable> 
	implements IGenericJpaService<T, E> {
	
	protected IGenericJapDAO<T, E> dao;
	
	public GenericJpaService(IGenericJapDAO<T, E> dao) {
		this.dao = dao;
	}
	

	@Override
	public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException {
		return this.dao.cadastrar(entity);
	}

	@Override
	public void excluir(T entity) throws DAOException {
		this.dao.excluir(entity);
	}

	@Override
	public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException {
		return this.dao.alterar(entity);
	}

	@Override
	public T consultar(E valor) throws MaisDeUmRegistroException, TableException, DAOException {
		return this.dao.consultar(valor);
	}

	@Override
	public Collection<T> buscarTodos() throws DAOException {
		return this.dao.buscarTodos();
	}
	

}
