package br.edu.estacio.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.edu.estacio.model.Pessoa;

@Stateless
public class PessoasService {

	@PersistenceContext(unitName="convidados")
	private EntityManager entitymanager;
	
	public void addPessoa(Pessoa pessoa){
		entitymanager.persist(pessoa);
		
	}
	
	public void removePessoas(){
		entitymanager.createQuery("Delete from Pessoa p").executeUpdate();
	}
	
	@SuppressWarnings("rawtypes")
	public List getPessoas(){
		return entitymanager.createQuery("Select p from Pessoa p").getResultList();
	}
	
}
