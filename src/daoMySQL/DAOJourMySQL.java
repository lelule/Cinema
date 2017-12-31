/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoMySQL;

import dao.DAOJour;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import transferObject.Jour;

/**
 *
 * @author Ludo
 */
public class DAOJourMySQL implements DAOJour{
    private static DAOJourMySQL uniqueInstance = new DAOJourMySQL();

 public static DAOJourMySQL getInstance()
 {
 return uniqueInstance;
 }
    
    @Override
    public ArrayList<Jour> selectJours(){
        ArrayList<Jour> listeJours= new ArrayList();
        String req= "Select * from jour";
        try {
            ResultSet resu=ConnexionMySQL.getInstance().selectQuery(req);     
            while (resu.next()){ 
                listeJours.add(new Jour(resu.getInt("id_Jour"),resu.getDate("jour")));
            }
            
        }catch(SQLException e){
            System.out.println(e.toString()+"\nerreur select");
        }
        return listeJours;
    }
}
