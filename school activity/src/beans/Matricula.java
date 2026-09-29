/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

/**
 *
 * @author eduardoramires
 */
import java.sql.Date;

public class Matricula {
    private int id;
    private int alunoId;
    private int professorId;
    private Date data_matricula;

    public Matricula() {
    }

    public Matricula(int id, int alunoId, int professorId, Date data_matricula) {
        this.id = id;
        this.alunoId = alunoId;
        this.professorId = professorId;
        this.data_matricula = data_matricula;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(int alunoId) {
        this.alunoId = alunoId;
    }

    public int getProfessorId() {
        return professorId;
    }

    public void setProfessorId(int professorId) {
        this.professorId = professorId;
    }

    public Date getData_matricula() {
        return data_matricula;
    }

    public void setData_matricula(Date data_matricula) {
        this.data_matricula = data_matricula;
    }
    
}
