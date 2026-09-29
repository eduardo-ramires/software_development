/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import beans.Aluno;
import conection.ConnectionUfn;
import dao.AlunoDao;

/**
 *
 * @author laboratorio
 */
public class Main {
    public static void main(String[] args){
        ConnectionUfn c = new ConnectionUfn();
        c.getConnection();
        Aluno a = new Aluno();
        a.setNome("Eduardo Ramires");
        a.setIdade(21);
        a.setCurso("SI");
        AlunoDao adao = new AlunoDao();
        adao.insert(a);
    }
}
