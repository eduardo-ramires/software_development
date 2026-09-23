/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import beans.Pessoa;
import conection.ConnectionUfn;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.*;

/**
 *
 * @author laboratorio
 */
public class PessoaDao {
    private ConnectionUfn connectionUfn;
    private Connection conn;
    
    public PessoaDao(){
        this.connectionUfn = new ConnectionUfn();
        this.conn = this.connectionUfn.getConnection();
    }
    
    public void insert (Pessoa pessoa){
        try{
            String sql = "insert into pessoa(nome, sexo, idioma) VALUES(?, ?, ?);";
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, pessoa.getNome());
            stmt.setString(2, pessoa.getSexo());
            stmt.setString(3, pessoa.getIdioma());
            
            stmt.execute();
            
        }catch(SQLException ex){
            System.out.println("Erro ao inserir pessoa:" + ex.getMessage());
        }
    }
}
