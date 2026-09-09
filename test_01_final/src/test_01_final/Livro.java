/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test_01_final;

/**
 *
 * @author laboratorio
 */
public class Livro {
    public String titulo;
    public String autor;
    public String anoPublicacao;
    public char tipo;
    public String categoria;
    public char situacao;

    public Livro(String titulo, String autor, String anoPublicacao, char tipo, String categoria, char situacao) {
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
