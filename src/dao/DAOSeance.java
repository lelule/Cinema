/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import transferObject.Jour;
import transferObject.Salle;
import transferObject.Seance;

/**
 *
 * @author Ludo
 */
public interface DAOSeance {
    ArrayList<Seance> selectSeances();
    ArrayList<Seance> selectSeances(String exp,Jour deb,Jour fin,Salle s);
    boolean insertSeance(Seance s);
    boolean updateSeance(Seance s);
    boolean deleteSeance(int id);
}
