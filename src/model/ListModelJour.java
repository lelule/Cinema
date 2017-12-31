package model;

import java.text.SimpleDateFormat;
import java.util.*; // pour ArrayList
import transferObject.*;

public class ListModelJour extends javax.swing.AbstractListModel {
    
    private ArrayList <Jour> myList;

    public ListModelJour (ArrayList myList)
    {
        this.myList = myList;
    }
    
    public Object getElementAt (int index)
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String d=sdf.format(myList.get(index).getDate_jour());
        return d;
    }

    public int getSize()
    {
        return myList.size();
    }
    
    public void setMyList (ArrayList <Jour> myList)
    {
        this.myList = myList;
        this.fireContentsChanged(this, 0, getSize());
    }
    
    public ArrayList <Jour> getMyList ()
    {
        return myList;
    }
    
    public Jour getMyList (int index)
    {
        return myList.get(index);
    }
}

