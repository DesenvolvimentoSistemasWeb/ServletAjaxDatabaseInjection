package br.edu.estacio.model;

import java.util.ArrayList;

import javax.ejb.Stateless;

@Stateless
public class Pessoas {

	private ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	public void addPessoa(Pessoa pessoa){
		pessoas.add(pessoa);
	}
	
	public ArrayList<Pessoa> getPessoas(){
		return pessoas;
	}
	
}
