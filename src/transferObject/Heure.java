/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transferObject;

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
    private String heure;

    public Heure(int idHeure, String heure) {
        this.idHeure = idHeure;
        this.heure = heure;
    }

    public int getIdHeure() {
        return idHeure;
    }

    public String getHeure() {
        return heure;
    }
    
    
}
