/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transferObject;

/**
 *
 * @author Ludo
 */
public class Salle {
    private int idSalle;
    private String nom;
    private int capacité;

    public Salle(int idSalle, String nom, int capacité) {
        this.idSalle = idSalle;
        this.nom = nom;
        this.capacité = capacité;
    }

    public int getIdSalle() {
        return idSalle;
    }

    public String getNom() {
        return nom;
    }

    public int getCapacité() {
        return capacité;
    }

    @Override
    public String toString() {
        return nom ;
    }
}
