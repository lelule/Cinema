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
public class Seance {
    private Film film;
    private Salle salle;
    private Jour jour;
    private Heure heure;

    public Seance(Film film, Salle salle, Jour jour, Heure heure) {
        this.film = film;
        this.salle = salle;
        this.jour = jour;
        this.heure = heure;
    }
    
    public Film getFilm() {
        return film;
    }

    public Salle getSalle() {
        return salle;
    }

    public Jour getJour() {
        return jour;
    }

    public Heure getHeure() {
        return heure;
    }
}
