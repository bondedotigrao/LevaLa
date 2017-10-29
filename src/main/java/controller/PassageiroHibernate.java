/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import model.Passageiro;
import model.PassageiroInterface;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Adrielly Sales
 */
public class PassageiroHibernate implements PassageiroInterface {
    private EntityManager em;
    private SessionFactory sessions;
    private static PassageiroHibernate instance =null;
    
    public static PassageiroHibernate getInstance(){
        if(instance == null){
            instance = new PassageiroHibernate();
        }
        return instance;
    }
    
    public PassageiroHibernate(){
        Configuration cfg = new Configuration().configure();
        this.sessions = cfg.buildSessionFactory();
        
    }
    @Override
    public void cadastrar(Passageiro passageiro) {
       Session session = this.sessions.openSession();
       Transaction t = session.beginTransaction();
       
       try{
           session.persist(passageiro);
           t.commit();
       }catch(Exception cadastroPassageiroErro){
           System.out.println("Algo de errado não está certo");
           t.rollback();
       }finally{
           session.close();
       }
    }

    @Override
    public void alterar(Passageiro t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Passageiro recuperar(int codigo) {
        Session session = this.sessions.openSession();
        
        try{
            return(Passageiro) session.getSession().createQuery("from Passageiro where codigo=" + codigo).getResultList().get(0);
        }catch(Exception recuperaPassageiroErro){
            System.out.println("Algo de errado não está certo");
            
        }finally{
            session.close();
        }
        return null;
    }

    @Override
    public void deletar(Passageiro passageiro) {
          Session session = this.sessions.openSession();
       Transaction t = session.beginTransaction();
       
       try{
           session.delete(passageiro);
           t.commit();
       }catch(Exception cadastroPassageiroErro){
           System.out.println("Algo de errado não está certo");
           t.rollback();
       }finally{
           session.close();
       }
    }
    

    @Override
    public List<Passageiro> recuperarTodos() {
      Session session = this.sessions.openSession();
      List<Passageiro> lista = new ArrayList();      
      try{
          lista = session.createQuery("from passageiro").list();
      }catch(Exception listaTodosPassageirosErro){
          System.out.println("Algo de errado não esta certo");
      }finally{
          session.close();
      }
      
      return lista;
    }
    
}
