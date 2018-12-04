/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Mayara Medeiros
 */
public class ComicCollection {
    
    private int id_collection;
    private int id_comic;

    /**
     * @return the id_collection
     */
    public int getId_collection() {
        return id_collection;
    }

    /**
     * @param id_collection the id_collection to set
     */
    public void setId_collection(int id_collection) {
        this.id_collection = id_collection;
    }

    /**
     * @return the id_comic
     */
    public int getId_comic() {
        return id_comic;
    }

    /**
     * @param id_comic the id_comic to set
     */
    public void setId_comic(int id_comic) {
        this.id_comic = id_comic;
    }
    
    @Override
    public String toString(){
        return "Colecao: " + id_collection + ", Revista: " + id_comic;
    }
    
    
}
