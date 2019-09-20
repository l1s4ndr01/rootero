/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Entidades.Titular;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author L. Nudel
 */
public class TitularDAO {
    
    public TitularDAO(){
        
    }
    public Boolean verificarExistencia(int id){
        Boolean r;
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
       /* Transaction tx = session.beginTransaction();
        if(session.get(Administrador.class, username)!=null) r=true; 
        else r=false;
        tx.commit();*/
        Query query = session.createQuery("FROM titular WHERE idtitular = :id");
        query.setParameter("id", id);
        List<Titular> lista = query.list();
        r = !lista.isEmpty();
        session.close();
        return r;
    }
    public Titular obtenerTitular(int id){
        Titular b ;
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        /*Transaction tx = session.beginTransaction();
        b=(Administrador)session.get(Administrador.class, username);
        tx.commit();*/
        Query query = session.createQuery("FROM titular WHERE idtitular = :id");
        query.setParameter("id", id);
        List<Titular> lista = query.list();
        b=lista.get(0);
        session.close();
        return b;
    }
    
    
    
}
