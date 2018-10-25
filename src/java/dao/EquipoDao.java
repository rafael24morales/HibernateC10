/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import hbc.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojo.Equipo;

/**
 *
 * @author rafaelm
 */
public class EquipoDao {
    Session session;
    
    public EquipoDao(){
        session = HibernateUtil.getLocalSession();
        
    }
    public Equipo getEquipoById(int id){
        return (Equipo)session.load(Equipo.class, id);
    }
    
    public boolean saveEquipo(String nombre, String continente){
        Equipo equipito = new Equipo();
        equipito.setNombre(nombre);
        equipito.setContinente(continente);
        
        try{
            Transaction transaction = session.beginTransaction();
            session.save(equipito);
            transaction.commit();
            return true;
        }catch(Exception ex){
            
        }
        return false;
    }
    
    public boolean updatebyId(int id, Equipo equipito){
        Equipo equipoAModificar = getEquipoById(id);
        try{
            Transaction transaccion = session.beginTransaction();
            equipoAModificar.setNombre(equipito.getNombre());
            equipoAModificar.setContinente(equipito.getContinente());
            session.update(equipoAModificar);
            
            transaccion.commit();
            HibernateUtil.closeLocalSession();
            return true;
        }catch(Exception ex){
            
        }
        return false;
    }
    
}
