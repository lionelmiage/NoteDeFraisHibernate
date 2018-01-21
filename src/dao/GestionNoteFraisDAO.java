/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import service.GestionNoteFraisInterface;
import org.hibernate.query.Query;

/**
 *
 * @author Lionel
 */
public class GestionNoteFraisDAO implements GestionNoteFraisInterface {

    Session s;
    Transaction t;

    public GestionNoteFraisDAO() {

    }

    @Override
    public List<GestionNoteFraisDAO> afficher() {

        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //connection
        //s = HibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery("FROM GestionNoteFraisDAO");
        List<GestionNoteFraisDAO> ls = q.list();
        return ls;

    }

    @Override
    public List<GestionNoteFraisDAO> chercher(String id) {
        //connection
        // s = HibernateUtil.getSessionFactory().openSession();
        Query q = s.createQuery("FROM GestionNoteFraisDAO Where nom like : nom");
        q.setString(id, "%" + id + "%");
        List<GestionNoteFraisDAO> ls = q.list();
        return ls;
    }

    @Override
    public void sauvegarder(GestionNoteFraisDAO g) {
        //connection
        // s = HibernateUtil.getSessionFactory().openSession();
        t = s.beginTransaction();
        s.save(g);
        t.commit();
        s.close();
    }

    @Override
    public void mettreAJour(GestionNoteFraisDAO g) {
        //connection
        // s = HibernateUtil.getSessionFactory().openSession();
        t = s.beginTransaction();
        s.update(g);
        t.commit();
        s.close();
    }

    @Override
    public void supprimer(GestionNoteFraisDAO g) {
        //connection
        //s = HibernateUtil.getSessionFactory().openSession();
        t = s.beginTransaction();
        s.delete(g);
        t.commit();
        s.close();

    }

   

}
