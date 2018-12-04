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
import model.Comic;

/**
 *
 * @author Mayara Medeiros
 */
public class ComicDAO {
    private DataSource dataSource;
    
    public ComicDAO(DataSource dataSource){
        this.dataSource = dataSource;
    }
    
    public ArrayList<Comic> readAll(){
        ArrayList<Comic> lista = new ArrayList<Comic>();
        try {
            String SQL = "Select * FROM comic";
            PreparedStatement ps = dataSource.getConnection().prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
                        
            while (rs.next()){
                Comic comic = new Comic();
                comic.setId(rs.getInt("id"));
                comic.setTitulo(rs.getString("titulo"));
                comic.setEdicao(rs.getString("edicao"));
                comic.setSuperheroi(rs.getString("superheroi"));
                comic.setPreco(rs.getDouble("preco"));
                comic.setStatusEmprestimo(rs.getBoolean("statusEmprestimo"));
                //comic.setId_collection(rs.getInt("fk_colection"));
                comic.setId_user(rs.getInt("id_user"));

                lista.add(comic);
            }
            ps.close();
        } catch (SQLException ex) {
            System.err.println("ERRO AO RECUPERAR " + ex.getMessage());
        } catch(Exception ex){
            System.err.println("ERRO GERAL..." + ex.getMessage());
        }
        return lista;
    }
    
    public void remove(Comic c){
        try {
            String id = ""+c.getId();
            String SQL = "Select * from comic";
            PreparedStatement ps = dataSource.getConnection().prepareStatement(SQL);
            ps.executeUpdate("delete from comic where id="+id);

            ps.close();
            
        } catch (SQLException ex) {
            System.err.println("ERRO AO RECUPERAR " + ex.getMessage());
        } catch(Exception ex){
            System.err.println("ERRO GERAL..." + ex.getMessage());
        }
    }
    
    public void atualizarDados(int id, String titulo, String edicao, String superheroi, double preco){
        try {
            String idStr= ""+id;
            String SQL = "Select * from comic";
            PreparedStatement ps = dataSource.getConnection().prepareStatement(SQL);
            ps.executeUpdate("update comic set "
            + "titulo='" + titulo + "',edicao='" + edicao
            + "',superheroi='" + superheroi + "',preco='"
            + preco + "' where id=" + idStr);

            ps.close();
            
        } catch (SQLException ex) {
            System.err.println("ERRO AO RECUPERAR " + ex.getMessage());
        } catch(Exception ex){
            System.err.println("ERRO GERAL..." + ex.getMessage());
        }
 
    }
    
    public void atualizarDadosEmprestimo(int id, String titulo, String edicao, String superheroi, double preco, boolean statusEmprestimo){
        try {
            String idStr= ""+id;
            String SQL = "Select * from comic";
            PreparedStatement ps = dataSource.getConnection().prepareStatement(SQL);
            ps.executeUpdate("update comic set "
            + "titulo='" + titulo + "',edicao='" + edicao
            + "',superheroi='" + superheroi + "',preco='"
            + preco + "',statusEmprestimo="+ statusEmprestimo + " where id=" + idStr);

            ps.close();
            
        } catch (SQLException ex) {
            System.err.println("ERRO AO RECUPERAR " + ex.getMessage());
        } catch(Exception ex){
            System.err.println("ERRO GERAL..." + ex.getMessage());
        }
 
    }
    
    public void adicionarDados(int id_user, String titulo, String edicao, String superheroi, double preco){
        try {
            String SQL = "Select * from comic";
            PreparedStatement ps = dataSource.getConnection().prepareStatement(SQL);
            ps.executeUpdate("insert into comic values (" + null + ", "
            + "'" + titulo + "', '" + edicao
            + "', '" + superheroi + "', '"
            + preco + "', " + false + ", " + id_user + ")");

            ps.close();
            
        } catch (SQLException ex) {
            System.err.println("ERRO AO RECUPERAR " + ex.getMessage());
        } catch(Exception ex){
            System.err.println("ERRO GERAL..." + ex.getMessage());
        }
    }
    
}
