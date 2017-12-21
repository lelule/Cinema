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
public class Film {
    private int idFilm;
    private String titre;
    private int année;
    private int durée;

    public Film(int idFilm, String titre, int année, int durée) {
        this.idFilm = idFilm;
        this.titre = titre;
        this.année = année;
        this.durée = durée;
    }

    public int getIdFilm() {
        return idFilm;
    }

    public String getTitre() {
        return titre;
    }

    public int getAnnée() {
        return année;
    }

    public int getDurée() {
        return durée;
    }
    
    
}
