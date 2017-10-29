/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import javax.persistence.EntityManager;
import model.Piloto;
import model.PilotoInterface;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Adrielly Sales
 */
public class PilotoHibernate implements PilotoInterface {
    
    private EntityManager em;
    private SessionFactory sessions;
    private static PilotoHibernate instance =null;
    
    public static PilotoHibernate getInstance(){
        if(instance == null){
            instance = new PilotoHibernate();
        }
        return instance;
    }
    
    public PilotoHibernate(){
        Configuration cfg = new Configuration().configure();
        this.sessions = cfg.buildSessionFactory();
        
    }

    @Override
    public void cadastrar(Piloto piloto) {
        Session session = this.sessions.openSession();
       Transaction t = session.beginTransaction();
       
       try{
           session.persist(piloto);
           t.commit();
       }catch(Exception cadastroPilotoErro){
           System.out.println("Algo de errado não está certo");
           t.rollback();
       }finally{
           session.close();
       }
    } 

    @Override
    public void alterar(Piloto piloto) {
         }

    @Override
    public Piloto recuperar(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletar(Piloto piloto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Piloto> recuperarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}