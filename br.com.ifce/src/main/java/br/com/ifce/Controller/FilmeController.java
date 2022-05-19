package br.com.ifce.Controller;

import br.com.ifce.model.Filme;
import br.com.ifce.service.Service;

public class FilmeController {
	Service ser = new Service();
	public void salva(Filme filme) {
		ser.salvar(filme);
	}

	public void update(Filme filme) {
		ser.update(filme);
	}
	
	public Filme buscaId(Long id) {
		return ser.buscarId(id);
	}
	
	public void deleteFilme(Filme filme) {
		ser.deleteFilme(filme);
	}
}
