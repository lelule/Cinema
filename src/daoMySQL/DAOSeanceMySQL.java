/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoMySQL;

import dao.DAOSeance;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import transferObject.Film;
import transferObject.Heure;
import transferObject.Jour;
import transferObject.Salle;
import transferObject.Seance;

/**
 *
 * @author Ludo
 */
public class DAOSeanceMySQL implements DAOSeance {
    private static DAOSeanceMySQL uniqueInstance = new DAOSeanceMySQL();

    public static DAOSeanceMySQL getInstance()
    {
        return uniqueInstance;
    }
    
    @Override
    public ArrayList<Seance> selectSeances() {
        ArrayList<Seance> listeSeances= new ArrayList();
        String req= "Select s.id_Seance,s.id_film, f.titre_Film , f.annee_sortie, f.duree, s.id_Jour, j.jour, s.id_Heure, h.heure,s.id_Salle,sa.nom_Salle, sa.capacite" 
                            +" from seance as s, film as f,jour as j, heure as h , salle as sa "+
                "where s.id_film=f.id_film and s.id_Jour=j.id_Jour and s.id_Heure=h.id_Heure and s.id_Salle=sa.id_Salle ORDER BY 1";
        try {
            ResultSet resu=ConnexionMySQL.getInstance().selectQuery(req);     
            while (resu.next()){ 
                listeSeances.add(new Seance(resu.getInt(1),new Film(resu.getInt(2),resu.getString(3),resu.getInt(4),resu.getInt(5)),new Jour(resu.getInt(6),resu.getDate(7)),new Heure(resu.getInt(8),resu.getTime(9)),new Salle(resu.getInt(10),resu.getString(11),resu.getInt(12))));
            }
            
        }catch(SQLException e){
            System.out.println(e.toString()+"\nerreur select");
        }
        return listeSeances;
    }

    @Override
    public boolean insertSeance(Seance s) {
        boolean ok = ConnexionMySQL.getInstance().actionQuery("Insert into Seance (Id_Seance,Id_Film, Id_Jour, Id_Heure, Id_Salle)" +
        " values ("+null+","+s.getFilm().getIdFilm()+"," +s.getJour().getIdJour() + "," + s.getHeure().getIdHeure()+","+s.getSalle().getIdSalle()+")");
        
        return ok;
    }
    @Override
    public boolean updateSeance(Seance s) {
        String req = "Update Seance set Id_Film =" + s.getFilm().getIdFilm() +", Id_Jour = " + s.getJour().getIdJour() 
                + ", Id_Heure = " +s.getHeure().getIdHeure()+", Id_Salle="+s.getSalle().getIdSalle() 
                +" WHERE Id_Seance ="+s.getId();
        
        boolean ok = ConnexionMySQL.getInstance().actionQuery(req);
        return ok;
    }

    @Override
    public boolean deleteSeance(int id) {
        boolean ok = ConnexionMySQL.getInstance().actionQuery("Delete from Seance where Id_Seance="+id);
        
        return ok;
    }

    @Override
    public ArrayList<Seance> selectSeances(String exp,Jour deb,Jour fin,Salle s) {
        ArrayList<Seance> listeSeances= new ArrayList();
        String req;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        
        if(s.getIdSalle()!=0){
            req= "Select s.id_Seance,s.id_film, f.titre_Film , f.annee_sortie, f.duree, s.id_Jour, j.jour, s.id_Heure, h.heure,s.id_Salle,sa.nom_Salle, sa.capacite" 
                            +" from seance as s, film as f,jour as j, heure as h , salle as sa "+
                "where s.id_film=f.id_film and s.id_Jour=j.id_Jour and s.id_Heure=h.id_Heure and s.id_Salle=sa.id_Salle and titre_film like '%"+exp+"%'"
                +"and j.jour BETWEEN '"+sdf.format(deb.getDate_jour())+"'AND '"+sdf.format(fin.getDate_jour())+"' and sa.NOM_SALLE='"+s.getNom()+"'ORDER BY 1";
            
        }else{
            req= "Select s.id_Seance,s.id_film, f.titre_Film , f.annee_sortie, f.duree, s.id_Jour, j.jour, s.id_Heure, h.heure,s.id_Salle,sa.nom_Salle, sa.capacite" 
                            +" from seance as s, film as f,jour as j, heure as h , salle as sa "+
                "where s.id_film=f.id_film and s.id_Jour=j.id_Jour and s.id_Heure=h.id_Heure and s.id_Salle=sa.id_Salle and titre_film like '%"+exp+"%'"
                +"and j.jour BETWEEN '"+sdf.format(deb.getDate_jour())+"'AND '"+sdf.format(fin.getDate_jour())+"' ORDER BY 1";
        }
        try {
            ResultSet resu=ConnexionMySQL.getInstance().selectQuery(req);     
            while (resu.next()){ 
                listeSeances.add(new Seance(resu.getInt(1),new Film(resu.getInt(2),resu.getString(3),resu.getInt(4),resu.getInt(5)),new Jour(resu.getInt(6),resu.getDate(7)),new Heure(resu.getInt(8),resu.getTime(9)),new Salle(resu.getInt(10),resu.getString(11),resu.getInt(12))));
            }
            
        }catch(SQLException e){
            System.out.println(e.toString()+"\nerreur select");
        }
        return listeSeances;
    }
    
}
