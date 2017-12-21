/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transferObject;

import java.util.Date;

/**
 *
 * @author Ludo
 */
public class Jour {
    private int idJour;
    private Date date_jour;

    public Jour(int idJour, Date date_jour) {
        this.idJour = idJour;
        this.date_jour = date_jour;
    }

    public int getIdJour() {
        return idJour;
    }

    public Date getDate_jour() {
        return date_jour;
    }
}
