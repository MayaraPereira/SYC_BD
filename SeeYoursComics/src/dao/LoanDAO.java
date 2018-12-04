/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Loan;

/**
 *
 * @author Mayara Medeiros
 */
public class LoanDAO {
    private DataSource dataSource;
    
    public LoanDAO(DataSource dataSource){
        this.dataSource = dataSource;
    }
    
    public ArrayList<Loan> readAll(){
        ArrayList<Loan> lista = new ArrayList<Loan>();
        try {
            String SQL = "Select * FROM comic";
            PreparedStatement ps = dataSource.getConnection().prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
                        
            while (rs.next()){
                Loan loan = new Loan();
                loan.setId(rs.getInt("id"));
                loan.setDataDevolucao(rs.getString("dataDevolucao"));
                loan.setNomeSolicitante(rs.getString("nomeSolicitante"));
                loan.setId_comic(rs.getInt("id_comic"));

                lista.add(loan);
            }
            ps.close();
        } catch (SQLException ex) {
            System.err.println("ERRO AO RECUPERAR " + ex.getMessage());
        } catch(Exception ex){
            System.err.println("ERRO GERAL..." + ex.getMessage());
        }
        return lista;
    }
    
    public void remove(Loan l){
        try {
            String id = ""+l.getId();
            String SQL = "Select * from loans";
            PreparedStatement ps = dataSource.getConnection().prepareStatement(SQL);
            ps.executeUpdate("delete from loans where id="+id);

            ps.close();
            
        } catch (SQLException ex) {
            System.err.println("ERRO AO RECUPERAR " + ex.getMessage());
        } catch(Exception ex){
            System.err.println("ERRO GERAL..." + ex.getMessage());
        }
    }
    
    public void atualizarDados(int id, String dataDevolucao, String nomeSolicitante, int id_comic){
        try {
            String idStr= ""+id;
            String SQL = "Select * from loans";
            PreparedStatement ps = dataSource.getConnection().prepareStatement(SQL);
            ps.executeUpdate("update loans set "
            + "dataDevolucao='" + dataDevolucao + "',nomeSolicitante='" + nomeSolicitante
            + "',id_comic=" + id_comic + " where id=" + idStr);

            ps.close();
            
        } catch (SQLException ex) {
            System.err.println("ERRO AO RECUPERAR " + ex.getMessage());
        } catch(Exception ex){
            System.err.println("ERRO GERAL..." + ex.getMessage());
        }
 
    }
    
    public void adicionarDados(String dataDevolucao, String nomeSolicitante, int id_comic, int id_userLoan){
        try {
            String SQL = "Select * from loans";
            PreparedStatement ps = dataSource.getConnection().prepareStatement(SQL);
            ps.executeUpdate("insert into loans values (" + null + ", "
            + "'" + dataDevolucao + "', '" + nomeSolicitante
            + "', " + id_comic + ", " + id_userLoan + ")");

            ps.close();
            
        } catch (SQLException ex) {
            System.err.println("ERRO AO RECUPERAR " + ex.getMessage());
        } catch(Exception ex){
            System.err.println("ERRO GERAL..." + ex.getMessage());
        }
    }
}
