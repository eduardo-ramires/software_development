/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.class_04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Arquivo {
    private FileWriter arqW;
    private BufferedWriter escritor;
    
    private FileReader arqR;
    private BufferedReader leitor;
    
    private List<Aluno> listaAlunos;
    
    public String nomeArquivo;
    
    public Arquivo(String nomeArquivo){
        this.nomeArquivo = nomeArquivo;
        listaAlunos = new ArrayList<>();
    }
    
    public List<Aluno> lerArquivo(){
        listaAlunos.clear();
        try{
            arqR= new FileReader(nomeArquivo + ".txt");
            leitor = new BufferedReader(arqR);
            
            String linha;
            
            while((linha = leitor.readLine()) != null){
                String[] campos = linha.split(";");
                
                String nome = campos [0];
                String dt_nasc = campos [1];
                char sexo = campos[2].charAt(0);
                String matricula = campos[3];
                String curso = campos[4];
                String cpf = campos[5];
                String endereco = campos[6];
                String estado = campos[7];
                String celular = campos[8];
            }
        }catch(FileNotFoundException e){
            System.out.println("Arquivo n encontrado");
        }catch(IOException e){
            e.printStackTrace();
        }
        return listaAlunos;
    }
    
    public void gravarArquivo(){
        try{
            arqW = new FileWriter(nomeArquivo + ".txt", false);
            escritor = new BufferedWriter(arqW);
            
            for (Aluno a : listaAlunos){
                escritor.write(
                        a.nome + ";"+
                        a.dt_nasc + ";"+
                        a.sexo + ";"+
                        a.matricula + ";"+
                        a.curso + ";"+
                        a.cpf + ";"+
                        a.endereco + ";"+
                        a.estado + ";"+
                        a.celular + ";"
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
