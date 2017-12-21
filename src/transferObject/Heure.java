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
    private int heure;

    public Heure(int idHeure, int heure) {
        this.idHeure = idHeure;
        this.heure = heure;
    }

    public int getIdHeure() {
        return idHeure;
    }

    public int getHeure() {
        return heure;
    }
    
    
}
