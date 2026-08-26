/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.class_04;

/**
 *
 * @author eduardoramires
 */
public class Aluno {
    public String nome;
    public String dt_nasc;
    public char sexo;
    public String matricula;
    public String curso;
    public String cpf;
    public String endereco;
    public String estado;
    public String celular;

    public Aluno(String nome, String dt_nasc, char sexo, String matricula, String curso, String cpf, String endereco, String estado, String celular) {
        this.nome = nome;
        this.dt_nasc = dt_nasc;
        this.sexo = sexo;
        this.matricula = matricula;
        this.curso = curso;
        this.cpf = cpf;
        this.endereco = endereco;
        this.estado = estado;
        this.celular = celular;
    }

    @Override
    public String toString() {
        return nome + ";" + dt_nasc + ";" + sexo + ";" + matricula + ";" + curso + ";" + cpf + ";" + endereco + ";" + estado + ";" + celular;
    }
    
    public Object[] obterDados(){
        return new Object[] {nome, dt_nasc, sexo, matricula, curso, cpf, endereco,estado, celular};
    }
    
}
