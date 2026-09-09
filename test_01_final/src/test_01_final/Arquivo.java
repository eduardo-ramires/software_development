/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test_01_final;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author laboratorio
 */
public class Arquivo {
    private FileWriter arqW;
    private BufferedWriter escritor;
    
    private FileReader arqR;
    private BufferedReader leitor;
    
    private List<Livro> listaLivros;
    
    public String nomeArquivo;
    
    public Arquivo(String nomeArquivo){
        this.nomeArquivo = nomeArquivo;
        listaLivros = new ArrayList<>();
    }
    
    public List<Livro> lerArquivo(){
        listaLivros.clear();
        try{
            arqR= new FileReader(nomeArquivo + ".txt");
            leitor = new BufferedReader(arqR);
            
            String linha;
            
            while((linha = leitor.readLine()) != null){
                String[] campos = linha.split(";");
                
                String titulo = campos [0];
                String autor = campos [1];
                String anoPublicacao = campos[2];
                char tipo = campos[3].charAt(0);
                String categoria = campos[4];
                char situacao = campos[5].charAt(0);
                
                Livro l = new Livro(titulo, autor, anoPublicacao, tipo, categoria, situacao);
                listaLivros.add(l);
                
            }
        }catch(FileNotFoundException e){
            System.out.println("Arquivo n encontrado");
        }catch(IOException e){
            System.out.println("erro io "+e.getMessage());
            e.printStackTrace();
        }
        return listaLivros;
    }
    
    public void gravarArquivo(){
        try{
            arqW = new FileWriter(nomeArquivo + ".txt", false);
            escritor = new BufferedWriter(arqW);
            
            for (Livro l : listaLivros){
                escritor.write(
                        l.titulo + ";"+
                        l.autor + ";"+
                        l.anoPublicacao + ";"+
                        l.tipo + ";"+
                        l.categoria + ";"+
                        l.situacao + ";"
                );
                
                escritor.newLine();
            }
            escritor.close();
            arqW.close();
            System.out.println("Lista salva!");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
