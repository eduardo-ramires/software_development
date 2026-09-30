/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import beans.Professor;
import conection.ConnectionUfn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eduardoramires
 */
public class ProfessorDao {
      private ConnectionUfn connectionUfn;
    private Connection conn;
    
    public ProfessorDao(){
        this.connectionUfn = new ConnectionUfn();
        this.conn = this.connectionUfn.getConnection();
    }
    
    public void insert (Professor professor){
        try{
            String sql = "insert into profesores(nome, idade, disciplina) VALUES(?, ?, ?);";
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, professor.getNome());
            stmt.setInt(2, professor.getIdade());
            stmt.setString(3, professor.getDisciplina());
            
            stmt.execute();
            
        }catch(SQLException ex){
            System.out.println("Erro ao inserir professor:" + ex.getMessage());
        }
    }
    
       
    public List<String> listaProfessores() {
        List<String> nomes = new ArrayList<>();
        try {
            String sql = "SELECT nome FROM profesores";
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                nomes.add(rs.getString("nome"));
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao listar professores: " + ex.getMessage());
        }
        return nomes;
    }
    
    public int buscarIdProfessor(String nome) {
        int id = 0;
        try {
            String sql = "SELECT id FROM profesores WHERE nome = ?";
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                id = rs.getInt("id");
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao buscar id do professor: " + ex.getMessage());
        }
        return id;
    }
}
    
