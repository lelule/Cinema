/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import transferObject.Film;
import transferObject.Film;

/**
 *
 * @author Ludo
 */
public class TableModelFilms extends javax.swing.table.AbstractTableModel{
    private String[] columnNames = {"Id","Titre","Année Sortie","Durée"};
    private ArrayList <Film> myList;

    public TableModelFilms (ArrayList myList)
    {
        this.myList = myList;
    }

    @Override
    public int getRowCount() {
        return myList.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }
    
    @Override
    public String getColumnName(int col) {
        return columnNames[col];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         Film myFilm = myList.get(rowIndex);
        switch (columnIndex)
        {
            case 0 :    return myFilm.getIdFilm();
            case 1 :    return myFilm.getTitre();
            case 2 :    return myFilm.getAnnée();
            case 3 :    return myFilm.getDurée();
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
    
    public ArrayList <Film> getMyList ()
    {
        return myList;
    }
    
    public Film getMyList (int index)
    {
        return myList.get(index);
    }
    
    
   
}
