/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import transferObject.Film;
import transferObject.Seance;

/**
 *
 * @author Ludo
 */
public interface DAOFilm {
    ArrayList<Film> selectFilms();
    ArrayList<Film> selectFilms(int id);
    boolean insertFilm(Film f);
    boolean updateFilm(Film f);
    boolean deleteAppareil(int id);
    
}
