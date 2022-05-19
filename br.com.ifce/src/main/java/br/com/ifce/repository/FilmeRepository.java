package br.com.ifce.repository;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.ifce.config.HibernateConfig;
import br.com.ifce.model.Filme;

public class FilmeRepository {

	public void salvar(Filme pessoa) {
		Transaction transacao = null;
		Session session = HibernateConfig.getSessionFactory().openSession();
		transacao = session.beginTransaction();
		session.save(pessoa);
		transacao.commit();
	}

	public void atualizar(Filme pessoa) {
		Transaction transacao = null;
		Session session = HibernateConfig.getSessionFactory().openSession();
		transacao = session.beginTransaction();
		session.saveOrUpdate(pessoa);
		transacao.commit();
	}

	public Filme BuscarPorId(Long id) {

		Transaction transacao = null;
		Session session = HibernateConfig.getSessionFactory().openSession();
		transacao = session.beginTransaction();
		Filme pessoa = session.get(Filme.class, id);
		transacao.commit();
		return pessoa;
	}
	
	public void delete(Filme filme) {
		Transaction transacao = null;
		Session session = HibernateConfig.getSessionFactory().openSession();
		transacao = session.beginTransaction();
		
		session.delete(filme);
		transacao.commit();
	}

}