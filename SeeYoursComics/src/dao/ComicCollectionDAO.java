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
import javax.swing.JOptionPane;
import model.Comic;
import model.ComicCollection;

/**
 *
 * @author Mayara Medeiros
 */
public class ComicCollectionDAO {
    private DataSource dataSource;
    
    public ComicCollectionDAO(DataSource dataSource){
        this.dataSource = dataSource;
    }
    
    public ArrayList<ComicCollection> readAll(){
        ArrayList<ComicCollection> lista = new ArrayList<ComicCollection>();
        try {
            String SQL = "Select * FROM comic_collection";
            PreparedStatement ps = dataSource.getConnection().prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
                        
            while (rs.next()){
                ComicCollection comicCol = new ComicCollection();
                comicCol.setId_collection(rs.getInt("id_collection"));
                comicCol.setId_comic(rs.getInt("id_comic"));
                
                lista.add(comicCol);
            }
            ps.close();
        } catch (SQLException ex) {
            System.err.println("ERRO AO RECUPERAR " + ex.getMessage());
        } catch(Exception ex){
            System.err.println("ERRO GERAL..." + ex.getMessage());
        }
        return lista;
    }
    
    public void remove(int id_collection, Comic c){
        try {
            System.out.println("dao remover");
            String id1 = ""+id_collection;
            String id2 = ""+c.getId();
            System.out.println(id1 + " " + id2);
            String SQL = "Select * from comic_collection";
            PreparedStatement ps = dataSource.getConnection().prepareStatement(SQL);
            ps.executeUpdate("DELETE FROM comic_collection WHERE id_collection="+id1+" && id_comic="+id2);
           
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
    
    public void adicionarDados(int id_collection, int id_comic){
        try {
            String SQL = "Select * from comic_collection";
            PreparedStatement ps = dataSource.getConnection().prepareStatement(SQL);
            ps.executeUpdate("insert into comic_collection values (" + id_collection + ", " + id_comic + ")");

            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Revista Selecionada ja esta na colecao");
            System.err.println("ERRO AO RECUPERAR " + ex.getMessage());
        } catch(Exception ex){
            System.err.println("ERRO GERAL..." + ex.getMessage());
        }
    }
}
