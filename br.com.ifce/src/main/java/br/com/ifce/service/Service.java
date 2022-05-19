package br.com.ifce.service;

import br.com.ifce.model.Filme;
import br.com.ifce.repository.FilmeRepository;

public class Service {
	FilmeRepository repository = new FilmeRepository();

	public void salvar(Filme filme) {
		repository.salvar(filme);
	}

	public void update(Filme filme) {
		repository.atualizar(filme);
	}
	
	public Filme buscarId(Long id) {
		return repository.BuscarPorId(id);
	}
	
	public void deleteFilme(Filme filme) {
		repository.delete(filme);
	}
}
