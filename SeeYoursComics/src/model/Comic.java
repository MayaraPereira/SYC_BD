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
public class Comic {
    private int id;
    private String titulo;
    private String edicao;
    private String superheroi;
    private double preco;
    private boolean statusEmprestimo;
    private int id_user;
    private int id_collection;

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
     * @return the edicao
     */
    public String getEdicao() {
        return edicao;
    }

    /**
     * @param edicao the edicao to set
     */
    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    /**
     * @return the superheroi
     */
    public String getSuperheroi() {
        return superheroi;
    }

    /**
     * @param superheroi the superheroi to set
     */
    public void setSuperheroi(String superheroi) {
        this.superheroi = superheroi;
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
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
     * @return the statusEmprestimo
     */
    public boolean isStatusEmprestimo() {
        return statusEmprestimo;
    }

    /**
     * @param statusEmprestimo the statusEmprestimo to set
     */
    public void setStatusEmprestimo(boolean statusEmprestimo) {
        this.statusEmprestimo = statusEmprestimo;
    }
    
    @Override
    public String toString(){
        return titulo + ", Edicao: " + edicao + ", Preco: R$" + preco + ", Emprestada: " + statusEmprestimo;
    }
    
}
