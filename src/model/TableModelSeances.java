/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import transferObject.Seance;

/**
 *
 * @author Ludo
 */
public class TableModelSeances extends javax.swing.table.AbstractTableModel {
    private String[] columnNames = {"Titre","Année Sortie","Durée","Nom salle","Jour","Heure"};
    private ArrayList <Seance> myList;

    public TableModelSeances(ArrayList myList)
    {
        this.myList = myList;
    }
    
    public int getColumnCount() {
        return columnNames.length;
    }

    public int getRowCount() {
        //System.out.println("row count : " + myList.size());
        return myList.size();
    }

    @Override
    public String getColumnName(int col) {
        return columnNames[col];
    }

    @Override
    public Object getValueAt(int row, int col) {
        Seance mySeance = myList.get(row);
        switch (col)
        {
            case 0 :    return mySeance.getFilm().getTitre();
            case 1 :    return mySeance.getFilm().getAnnée();
            case 2 :    return mySeance.getFilm().getDurée();
            case 3 :    return mySeance.getSalle().getNom();
            case 4 :    return mySeance.getJour();
            case 5 :    return mySeance.getHeure(); 
        }
        return null;
    }

    @Override
    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }
    
    public void setMyList (ArrayList myList)
    {
        this.myList = myList;
        this.fireTableDataChanged();
    }
    
    public ArrayList <Seance> getMyList ()
    {
        return myList;
    }
    
    public Seance getMyList (int index)
    {
        return myList.get(index);
    }
}
