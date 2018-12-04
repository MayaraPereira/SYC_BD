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
import model.Collection;

/**
 *
 * @author Mayara Medeiros
 */
public class CollectionDAO {
    private DataSource dataSource;
    
    public CollectionDAO(DataSource dataSource){
        this.dataSource = dataSource;
    }
    
    public ArrayList<Collection> readAll(){
        ArrayList<Collection> lista = new ArrayList<Collection>();
        try {
            String SQL = "Select * FROM colection";
            PreparedStatement ps = dataSource.getConnection().prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
                        
            while (rs.next()){
                Collection collection = new Collection();
                collection.setId(rs.getInt("id"));
                collection.setTitulo(rs.getString("titulo"));
                collection.setEditora(rs.getString("editora"));
                collection.setNumTotalComics(rs.getInt("numTotalComics"));
                collection.setNumAtualComics(rs.getInt("numAtualComics"));
                collection.setId_user(rs.getInt("id_user"));

                lista.add(collection);
            }
            ps.close();
        } catch (SQLException ex) {
            System.err.println("ERRO AO RECUPERAR " + ex.getMessage());
        } catch(Exception ex){
            System.err.println("ERRO GERAL..." + ex.getMessage());
        }
        return lista;
    }
    
    public void remove(int id){
         try {
            //String id = ""+c.getId();
            String SQL = "Select * from collection";
            PreparedStatement ps = dataSource.getConnection().prepareStatement(SQL);
            ps.executeUpdate("delete from collection where id="+id);

            ps.close();
            
        } catch (SQLException ex) {
            System.err.println("ERRO AO RECUPERAR " + ex.getMessage());
        } catch(Exception ex){
            System.err.println("ERRO GERAL..." + ex.getMessage());
        }
    }
    
    public void atualizarDados(int id, String titulo, String editora, int numTotalComics, int numAtualComics){
        try {
            String idStr= ""+id;
            String SQL = "Select * from collection";
            PreparedStatement ps = dataSource.getConnection().prepareStatement(SQL);
            ps.executeUpdate("update collection set "
            + "titulo='" + titulo + "',editora='" + editora
            + "',numTotalComics=" + numTotalComics + ",numAtualComics="
            + numAtualComics + " where id=" + idStr);

            ps.close();
            
        } catch (SQLException ex) {
            System.err.println("ERRO AO RECUPERAR " + ex.getMessage());
        } catch(Exception ex){
            System.err.println("ERRO GERAL..." + ex.getMessage());
        }
 
    }
    
    public void adicionarDados(int id_user, String titulo, String editora, int numTotalComics, int numAtualComics){
        try {
            String SQL = "Select * from collection";
            PreparedStatement ps = dataSource.getConnection().prepareStatement(SQL);
            ps.executeUpdate("insert into collection values (" + null + ", "
            + "'" + titulo + "', '" + editora
            + "', " + numTotalComics + ", "
            + numAtualComics + ", " + id_user + ")");

            ps.close();
            
        } catch (SQLException ex) {
            System.err.println("ERRO AO RECUPERAR " + ex.getMessage());
        } catch(Exception ex){
            System.err.println("ERRO GERAL..." + ex.getMessage());
        }
    }
}
