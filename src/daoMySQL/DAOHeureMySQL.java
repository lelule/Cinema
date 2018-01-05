/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoMySQL;

import dao.DAOHeure;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import transferObject.Heure;
import transferObject.Jour;

/**
 *
 * @author Ludo
 */
public class DAOHeureMySQL implements DAOHeure{
    private static DAOHeureMySQL uniqueInstance = new DAOHeureMySQL();

 public static DAOHeureMySQL getInstance()
 {
 return uniqueInstance;
 }

    @Override
    public ArrayList<Heure> selectHeures() {
        ArrayList<Heure> listeHeures= new ArrayList();
        String req= "Select * from Heure";
        try {
            ResultSet resu=ConnexionMySQL.getInstance().selectQuery(req);     
            while (resu.next()){ 
                listeHeures.add(new Heure(resu.getInt("id_Heure"),resu.getTime("heure")));
            }
            
        }catch(SQLException e){
            System.out.println(e.toString()+"\nerreur select");
        }
        return listeHeures;
    }
    
}
