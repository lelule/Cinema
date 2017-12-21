/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transferObject;

/**
 * Film est la classe represntant un film 
 * @author Ludo
 */
public class Film {
    /**
     * L'ID d'un film. Cette id n'est pas modifiable
     */
    private int idFilm;
    /**
     * Le titre d'un film.
     */
    private String titre;
    /**
     * L'année de sortie du film.
     */
    private int année;
    /**
     * La durée du film exprimé en minutes
     */
    private int durée;
    
    /**
     * Le constructeur d'un film.
     * @param idFilm
     *              L'identifiant du film.
     * @param titre
     *              Le titre du film.
     * @param année
     *              L'année de sortie du film.
     * @param durée     
     *              La durée du film.
     */

    public Film(int idFilm, String titre, int année, int durée) {
        this.idFilm = idFilm;
        this.titre = titre;
        this.année = année;
        this.durée = durée;
    }
    
    /**
     * retourne l'id.
     * @return l'identifiant du film.
     */
    public int getIdFilm() {
        return idFilm;
    }
    /**
     * Retourn le titre.
     * @return le titre du film.
     */
    public String getTitre() {
        return titre;
    }
    /**
     * Retourne l'année.
     * @return l'année de sortie du film.
     */
    public int getAnnée() {
        return année;
    }
    /**
     * Retourne la durée.
     * @return la durée du film.
     */
    public int getDurée() {
        return durée;
    }
    /**
     * Redéfinition de la méthode toString afin d'afficher le titre d'un film
     * @return le titre d'un film
     */
    @Override
    public String toString() {
        return titre;
    }
}
