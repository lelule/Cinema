/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import daoMySQL.ConnexionMySQL;
import dao.*;
import daoMySQL.*;

/**
 *
 * @author Ludo
 */
public class Factory {
    public static DAOFilm getDAOFilm(){
        return DAOFilmMySQL.getInstance();
        
    }
    public static DAOSeance getDAOSeance(){
        return DAOSeanceMySQL.getInstance();
    }
    public static DAOSalle getDAOSalle(){
        return DAOSalleMySQL.getInstance();
        
    }
    public static DAOJour getDAOJour(){
        return DAOJourMySQL.getInstance();
        
    }
    public static DAOHeure getDAOHeure(){
        return DAOHeureMySQL.getInstance();
        
    }
    
    
    public static Connexion getDAOConnexion()
    {
        return ConnexionMySQL.getInstance();
    }
}
