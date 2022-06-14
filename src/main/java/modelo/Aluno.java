/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author frank
 */
public class Aluno {
    private int id;
    private String nome;
    private String curso;
    private int periodo;

    public Aluno() {
    }

    public Aluno(int id, String nome, String curso, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.curso = curso;
        this.periodo = quantidade;
    }
    
    public Aluno(String nome, String curso, int quantidade) {
        this.nome = nome;
        this.curso = curso;
        this.periodo = quantidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }
    
}
