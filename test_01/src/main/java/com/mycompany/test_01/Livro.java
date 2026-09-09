/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test_01;

/**
 *
 * @author laboratorio
 */
public class Livro {
    public String titulo;
    public String autor;
    public String anoPublicacao;
    public String tipo;
    public String categoria;
    public String situacao;

    public Livro(String titulo, String autor, String anoPublicacao, String tipo, String categoria, String situacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.tipo = tipo;
        this.categoria = categoria;
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        return  titulo + ";" + autor + ";" + anoPublicacao + ";" + tipo + ";" + categoria + ";" + situacao;
    }
    
    public Object[] obterDados(){
        return new Object[] {titulo, autor, anoPublicacao, tipo, categoria, situacao };
    }  
}
