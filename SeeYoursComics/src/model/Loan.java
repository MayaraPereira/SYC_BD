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
public class Loan {
    
    private int id;
    private String dataDevolucao;
    private String nomeSolicitante;
    private int id_comic;
    private int id_userLoan;

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
     * @return the dataDevolucao
     */
    public String getDataDevolucao() {
        return dataDevolucao;
    }

    /**
     * @param dataDevolucao the dataDevolucao to set
     */
    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    /**
     * @return the nomeSolicitante
     */
    public String getNomeSolicitante() {
        return nomeSolicitante;
    }

    /**
     * @param nomeSolicitante the nomeSolicitante to set
     */
    public void setNomeSolicitante(String nomeSolicitante) {
        this.nomeSolicitante = nomeSolicitante;
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
    
    /**
     * @return the id_userLoan
     */
    public int getId_userLoan() {
        return id_userLoan;
    }

    /**
     * @param id_userLoan the id_userLoan to set
     */
    public void setId_userLoan(int id_userLoan) {
        this.id_userLoan = id_userLoan;
    }
    
     @Override
    public String toString(){
        return id + " - " + "data devolucao: " + dataDevolucao + ", nome do solicitante: " + nomeSolicitante + ", id_comic: "+ id_comic + ".";
    }
}
