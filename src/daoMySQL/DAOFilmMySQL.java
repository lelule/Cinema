/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoMySQL;

import dao.DAOFilm;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import transferObject.Film;

/**
 *
 * @author Ludo
 */
public class DAOFilmMySQL implements DAOFilm{
    private static DAOFilmMySQL uniqueInstance = new DAOFilmMySQL();

 public static DAOFilmMySQL getInstance()
 {
 return uniqueInstance;
 }
    
    @Override
    public ArrayList<Film> selectFilms(){
        ArrayList<Film> listeFilms= new ArrayList();
        String req= "Select * from Film";
        try {
            ResultSet resu=ConnexionMySQL.getInstance().selectQuery(req);     
            while (resu.next()){
                listeFilms.add(new Film(resu.getInt("id_Film"),resu.getString("titre_film"),resu.getInt("annee_sortie"),resu.getInt("duree")));
            }
            
        }catch(SQLException e){
            System.out.println(e.toString()+"\nerreur select");
        }
        return listeFilms;
    }

    @Override
    public boolean insertFilm(Film f) {
        boolean ok = ConnexionMySQL.getInstance().actionQuery("Insert into Film (Id_Film, Titre_Film, Annee_Sortie, " +
                    "Duree) values (" + null + ",'" + f.getTitre().toUpperCase() +
                    "'," + f.getAnnée() + "," + f.getDurée()+")");
        return ok;
    }

    @Override
    public boolean updateFilm(Film f) {
        String req = "Update Film set Titre_Film = '" + f.getTitre().toUpperCase() +
        "', Annee_Sortie = " + f.getAnnée() + ", Duree = " + f.getDurée() + " where Id_Film = "+f.getIdFilm()+";";
        
        boolean ok = ConnexionMySQL.getInstance().actionQuery(req);
        return ok;
    }

    @Override
    public boolean deleteAppareil(int id) {
         boolean ok = ConnexionMySQL.getInstance().actionQuery("Delete from film where Id_Film = " + id);
        
        return ok;
    }

    @Override
    public ArrayList<Film> selectFilms(int id) {
        ArrayList<Film> listeFilms= new ArrayList();
        String req= "Select * from Film where id_film ="+id;
        try {
            ResultSet resu=ConnexionMySQL.getInstance().selectQuery(req);     
            while (resu.next()){
                listeFilms.add(new Film(resu.getInt("id_Film"),resu.getString("titre_film"),resu.getInt("annee_sortie"),resu.getInt("duree")));
            }
            
        }catch(SQLException e){
            System.out.println(e.toString()+"\nerreur select");
        }
        return listeFilms;
    }

}
