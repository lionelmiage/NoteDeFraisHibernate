package service;

import dao.GestionNoteFraisDAO;
import java.util.List;
import org.hibernate.Session;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Lionel
 */
public interface GestionNoteFraisInterface {

    public void sauvegarder(GestionNoteFraisDAO g);

    public void mettreAJour(GestionNoteFraisDAO g);

    public void supprimer(GestionNoteFraisDAO g);

    public List<GestionNoteFraisDAO> afficher();

    public List<GestionNoteFraisDAO> chercher(String id);

   

   

}
