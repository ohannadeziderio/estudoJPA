package br.edu.ifrn.sga.geatic.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistidorTarefa {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
		
		EntityManager em = emf.createEntityManager();
		
		Tarefa tarefa = new Tarefa();
		
		tarefa.setDescricao("Estudar Programação");
		tarefa.setFinalizado(true);
		
		em.persist(tarefa);
		
		em.close();
		emf.close();
	}
}
