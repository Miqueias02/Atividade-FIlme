package br.com.ifce.View;

import br.com.ifce.Controller.FilmeController;
import br.com.ifce.model.Filme;

public class ViewMain {
	public static void main(String[] args) {
		FilmeController filmeCon = new FilmeController();
		Filme filme = new Filme();
		Filme filme1 = new Filme();
		
		filme.setTitulo("Avangers");
		filme.setData("15/05/2015");
		filme.setDuracao(129);
		filme.setPreco(7.8);
		
		filme1.setTitulo("Carros 2");
		filme1.setData("20/05/2015");
		filme1.setDuracao(200);
		filme1.setPreco(10.0);
		
		filmeCon.salva(filme1);
		
		filmeCon.update(filme);
		
		filmeCon.buscaId((long) 1);
		System.out.println(filme.getTitulo());
		
		filmeCon.deleteFilme(filme1);
	}
	
}
