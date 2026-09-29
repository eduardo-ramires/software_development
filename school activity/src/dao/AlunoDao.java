/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import beans.Aluno;
import conection.ConnectionUfn;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author laboratorio
 */
public class AlunoDao {
    private ConnectionUfn connectionUfn;
    private Connection conn;
    
    public AlunoDao(){
        this.connectionUfn = new ConnectionUfn();
        this.conn = this.connectionUfn.getConnection();
    }
    
    public void insert (Aluno aluno){
        try{
            String sql = "insert into aluno(nome, idade, curso) VALUES(?, ?, ?);";
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, aluno.getNome());
            stmt.setInt(2, aluno.getIdade());
            stmt.setString(3, aluno.getCurso());
            
            stmt.execute();
            
        }catch(SQLException ex){
            System.out.println("Erro ao inserir aluno:" + ex.getMessage());
        }
    }
    
    public List<String> listarAlunos() {
        List<String> nomes = new ArrayList<>();
        try {
            String sql = "SELECT nome FROM aluno";
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                nomes.add(rs.getString("nome"));
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao listar alunos: " + ex.getMessage());
        }
        return nomes;
    }
    
    public int buscarIdAluno(String nome) {
        int id = 0;
        try {
            String sql = "SELECT id FROM aluno WHERE nome = ?";
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                id = rs.getInt("id");
            }
        } catch (SQLException ex) {
            System.out.println("Erro ao buscar id do aluno: " + ex.getMessage());
        }
        return id;
    }
}
