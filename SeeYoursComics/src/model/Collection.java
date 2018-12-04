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
public class Collection {
    private int id;
    private String titulo;
    private String editora;
    private int numTotalComics;
    private int numAtualComics;
    private int id_user;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the editora
     */
    public String getEditora() {
        return editora;
    }

    /**
     * @param editora the editora to set
     */
    public void setEditora(String editora) {
        this.editora = editora;
    }

    /**
     * @return the numTotalComics
     */
    public int getNumTotalComics() {
        return numTotalComics;
    }

    /**
     * @param numTotalComics the numTotalComics to set
     */
    public void setNumTotalComics(int numTotalComics) {
        this.numTotalComics = numTotalComics;
    }

    /**
     * @return the numAtualComics
     */
    public int getNumAtualComics() {
        return numAtualComics;
    }

    /**
     * @param numAtualComics the numAtualComics to set
     */
    public void setNumAtualComics(int numAtualComics) {
        this.numAtualComics = numAtualComics;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the id_user
     */
    public int getId_user() {
        return id_user;
    }

    /**
     * @param id_user the id_user to set
     */
    public void setId_user(int id_user) {
        this.id_user = id_user;
    }
    
    @Override
    public String toString(){
        return titulo + ", Editora: " + editora + ", Numero Total de Comics: " + numTotalComics + ", Numero Atual de Comics: " + numAtualComics + ", Falta para Completar Colecao: " + (numTotalComics - numAtualComics);
    }
}
