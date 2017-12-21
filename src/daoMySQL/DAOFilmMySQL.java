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
import transferObject.Film;

/**
 *
 * @author Ludo
 */
public class DAOFilmMySQL implements DAOFilm{
    private static DAOFilmMySql uniqueInstance = new DAOFilmMySql();

 public static DAOFilmMySql getInstance()
 {
 return uniqueInstance;
 }
    
    @Override
    public ArrayList<Film> selectFilms(){
        ArrayList<Film> listeFilms= new ArrayList();
        String req= "Select * from Films";
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
