/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transferObject;

import java.sql.Time;

/**
 * La classe heure permet de représenter l'heure d'une Séance
 * @author Ludo
 */
public class Heure {
    /**
     * L'Id d'une heure. Cet id n'est pas modifiable.
     */
    private int idHeure;
    /**
     * 
     */
    private Time heure;

    public Heure(int idHeure, Time heure) {
        this.idHeure = idHeure;
        this.heure = heure;
    }

    public int getIdHeure() {
        return idHeure;
    }

    public Time getHeure() {
        return heure;
    }

    @Override
    public String toString() {
        return heure.toString();
    }
    
}
