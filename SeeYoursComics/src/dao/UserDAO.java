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
import model.UserSyc;

/**
 *
 * @author Mayara Medeiros
 */
public class UserDAO {
    private DataSource dataSource;
    
    public UserDAO(DataSource dataSource){
        this.dataSource = dataSource;
    }
    
    public ArrayList<UserSyc> readAll(){
        ArrayList<UserSyc> lista = new ArrayList<UserSyc>();
        try {
            String SQL = "Select * FROM usersyc";
            PreparedStatement ps = dataSource.getConnection().prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
                        
            while (rs.next()){
                UserSyc user = new UserSyc();
                user.setId(rs.getInt("id"));
                user.setNome(rs.getString("nome"));
                user.setEmail(rs.getString("email"));
                user.setSenha(rs.getString("senha"));
                lista.add(user);
            }
            ps.close();
        } catch (SQLException ex) {
            System.err.println("ERRO AO RECUPERAR " + ex.getMessage());
        } catch(Exception ex){
            System.err.println("ERRO GERAL..." + ex.getMessage());
        }
        return lista;
    }
    
    public void remove(int idUser){
         try {
            String id = ""+idUser;
            String SQL = "Select * from loans";
            PreparedStatement ps = dataSource.getConnection().prepareStatement(SQL);
            ps.executeUpdate("delete from loans where id_userLoan="+id);
            
            SQL = "Select * from collection";
            ps = dataSource.getConnection().prepareStatement(SQL);
            ps.executeUpdate("delete from collection where id_user="+id);
            
            SQL = "Select * from comic";
            ps = dataSource.getConnection().prepareStatement(SQL);
            ps.executeUpdate("delete from comic where id_user="+id);
                
            SQL = "Select * from usersyc";
            ps = dataSource.getConnection().prepareStatement(SQL);
            ps.executeUpdate("delete from usersyc where id="+id);
            
            ps.close();
            
        } catch (SQLException ex) {
            System.err.println("ERRO AO RECUPERAR " + ex.getMessage());
        } catch(Exception ex){
            System.err.println("ERRO GERAL..." + ex.getMessage());
        }
    }
    
    public void adicionarDados(String nome, String email, String senha){
        try {
            String SQL = "Select * from usersyc";
            PreparedStatement ps = dataSource.getConnection().prepareStatement(SQL);
            ps.executeUpdate("insert into usersyc values (" + null + ", "
            + "'" + nome + "', '" + email
            + "', '" + senha + "')");

            ps.close();
            
        } catch (SQLException ex) {
            System.err.println("ERRO AO RECUPERAR " + ex.getMessage());
        } catch(Exception ex){
            System.err.println("ERRO GERAL..." + ex.getMessage());
        }
    }
    
    public void atualizarDados(int id, String nome, String email, String senha){
        try {
            String idStr= ""+id;
            String SQL = "Select * from usersyc";
            PreparedStatement ps = dataSource.getConnection().prepareStatement(SQL);
            ps.executeUpdate("update usersyc set "
            + "nome='" + nome + "',email='" + email
            + "',senha='" + senha + "' where id=" + idStr);

            ps.close();
            
        } catch (SQLException ex) {
            System.err.println("ERRO AO RECUPERAR " + ex.getMessage());
        } catch(Exception ex){
            System.err.println("ERRO GERAL..." + ex.getMessage());
        }
 
    }
}
