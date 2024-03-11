package br.com.senac.financasjpa.persistencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

public class DespesaDAO {

    public void cadastrar(Despesa d) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(d);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            JPAUtil.closeEtityManager();
        }
    }

    public Despesa obter(int id) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            return em.find(Despesa.class, id);
        } finally {
            JPAUtil.closeEtityManager();
        }
    }

    public void excluir(int id) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            Despesa d = obter(id);
            if (d != null) {
                em.getTransaction().begin();
                em.remove(d);
                em.getTransaction().commit();
            }
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            JPAUtil.closeEtityManager();
        }
    }

    public void atualizar(Despesa d) {
        EntityManager em = JPAUtil.getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(d);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            JPAUtil.closeEtityManager();
        }
    }

    public List<Despesa> listar(String filtroDescricao) {
        EntityManager em = JPAUtil.getEntityManager();
        List despesas = null;

        try {

            String textoQuery = "SELECT d FROM Despesa d "
                    + " WHERE (:filtro is NULL OR d.descricao LIKE :filtro)"; 
            
            Query consulta = em.createQuery(textoQuery);
            consulta.setParameter("filtro",filtroDescricao.isEmpty()? null: "%" + filtroDescricao + "%");
            despesas = consulta.getResultList();
            
        } finally {
            JPAUtil.closeEtityManager();
        }
        
        return despesas;

    }

}
