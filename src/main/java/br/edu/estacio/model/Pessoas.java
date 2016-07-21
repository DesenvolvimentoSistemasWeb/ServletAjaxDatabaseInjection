package br.edu.estacio.model;

import java.util.ArrayList;

public class Pessoas {

	private ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	public void addPessoa(Pessoa pessoa){
		pessoas.add(pessoa);
	}
	
	public ArrayList<Pessoa> getPessoas(){
		return pessoas;
	}
	
}
