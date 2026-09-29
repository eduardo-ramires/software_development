/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import beans.Matricula;
import conection.ConnectionUfn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author eduardoramires
 */
public class MatriculaDao {
    private ConnectionUfn connectionUfn;
    private Connection conn;
    
    public MatriculaDao(){
        this.connectionUfn = new ConnectionUfn();
        this.conn = this.connectionUfn.getConnection();
    }
    
    public void insert (Matricula matricula){
        try{
            String sql = "insert into matricula(id_aluno, id_profesor, data_matricula) VALUES(?, ?, ?);";
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, matricula.getAlunoId());
            stmt.setInt(2, matricula.getProfessorId());
            stmt.setDate(3, matricula.getData_matricula());
            
            stmt.execute();
            
        }catch(SQLException ex){
            System.out.println("Erro ao inserir matricula:" + ex.getMessage());
        }
    }
}
