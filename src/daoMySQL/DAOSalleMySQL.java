/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoMySQL;

import dao.DAOSalle;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import transferObject.Salle;

/**
 *
 * @author Ludo
 */
public class DAOSalleMySQL implements DAOSalle{
    private static DAOSalleMySQL uniqueInstance = new DAOSalleMySQL();

 public static DAOSalleMySQL getInstance()
 {
 return uniqueInstance;
 }
    
    @Override
    public ArrayList<Salle> selectSalles(){
        ArrayList<Salle> listeSalles= new ArrayList();
        String req= "Select * from salle";
        try {
            ResultSet resu=ConnexionMySQL.getInstance().selectQuery(req);     
            while (resu.next()){ 
                listeSalles.add(new Salle(resu.getInt("id_Salle"),resu.getString("nom_salle"),resu.getInt("capacite")));
            }
            
        }catch(SQLException e){
            System.out.println(e.toString()+"\nerreur select");
        }
        return listeSalles;
    }
}
