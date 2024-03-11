/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package br.com.senac.financasjpa;

import br.com.senac.financasjpa.persistencia.Despesa;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.time.LocalDate;

/**
 *
 * @author venec
 */
public class FinancasJPA {

    public static void main(String[] args) {

        /*EntityManagerFactory fabricaEntidade = Persistence.createEntityManagerFactory("Financas-PU");
        EntityManager manager = fabricaEntidade.createEntityManager();*/

        /*//criando o objeto
        Despesa gasto = new Despesa();
        gasto.setDescricao("Primeira despesa");
        gasto.setValor(10.50);
        gasto.setData(LocalDate.of(2024, 5, 30));
        
        //como inserir no BD?
        manager.getTransaction().begin(); //abri a conexao
        manager.persist(gasto); //enviei para inserir (SEM SQL)
        manager.getTransaction().commit(); //aqui estamos inserindo no banco
        manager.close(); //fechar a conexaao
        fabricaEntidade.close(); //fechar a Unidade de persistencia*/
        
        //para atualizar, como fica?
        /*int idDespesa = 9;
        Despesa gasto = manager.find(Despesa.class, idDespesa); //localizando TODOS os dados do objeto (SEM SQL)

        /*manager.getTransaction().begin(); //abri a conexao
        gasto.setDescricao("AGUA");
        manager.getTransaction().commit(); //aqui estamos inserindo no banco
        manager.close(); //fechar a conexaao
        fabricaEntidade.close(); //fechar a Unidade de persistencia*/
        

        //para excluir do banco de dados
        /*manager.getTransaction().begin(); //abri a conexao
        manager.remove(gasto);
        manager.getTransaction().commit(); //aqui estamos inserindo no banco
        manager.close(); //fechar a conexaao
        fabricaEntidade.close(); //fechar a Unidade de persistencia   */     

    }
}
