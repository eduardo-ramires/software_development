/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import beans.Pessoa;
import conection.ConnectionUfn;
import dao.PessoaDao;

/**
 *
 * @author laboratorio
 */
public class Main {
    public static void main(String[] args){
        ConnectionUfn c = new ConnectionUfn();
        c.getConnection();
        Pessoa p = new Pessoa();
        p.setNome("Eduardo Ramires");
        p.setIdioma("Alemão");
        p.setSexo("M");
        PessoaDao pdao = new PessoaDao();
        pdao.insert(p);
    }
}
