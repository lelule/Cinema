/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transferObject;

import java.util.Objects;

/**
 *
 * @author Ludo
 */
public class Seance {
    private int id;
    private Film film;
    private Salle salle;
    private Jour jour;
    private Heure heure;

    public Seance(){
    }
    
    public Seance(int id,Film film, Jour jour, Heure heure, Salle salle) {
        this.id=id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }

    public void setJour(Jour jour) {
        this.jour = jour;
    }

    public void setHeure(Heure heure) {
        this.heure = heure;
    }

    @Override
    public boolean equals(Object obj) {
        Seance s=(Seance)obj;
        if(film.equals(s.getFilm()) && salle.equals(s.getSalle()) && jour.equals(s.getJour()) && heure.equals(s.getHeure())){
            return true;
        }
        return false;
    }
    
}
