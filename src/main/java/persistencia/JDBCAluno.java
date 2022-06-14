/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import modelo.Aluno;

/**
 *
 * @author frank
 */
public class JDBCAluno {
    Connection conexao;

    public JDBCAluno(Connection conexao) {
        this.conexao = conexao;
    }
    
    public void inserirAlunos(Aluno p){
        String sql = "insert into Alunos (nome,curso,periodo) values (?,?,?)";
        PreparedStatement ps;
        try {
            ps = this.conexao.prepareStatement(sql);
            ps.setString(1, p.getNome());
            ps.setString(2, p.getCurso());
            ps.setInt(3, p.getPeriodo());
            ps.execute();
        } catch(SQLException e){
        }
    }
    
    public ArrayList<Aluno> listarAlunos() {
        ArrayList<Aluno> produtos = new ArrayList<>();
        String sql = "select * from Alunos";
        
        try {
            Statement declaracao = conexao.createStatement();
            ResultSet resposta = declaracao.executeQuery(sql);
            
            while(resposta.next()){
                int id = resposta.getInt("id");
                String nome = resposta.getString("nome");
                String curso = resposta.getString("curso");
                int quantidade = resposta.getInt("periodo");
                Aluno p = new Aluno(id,nome,curso,quantidade);
                produtos.add(p);
            }
        }catch(SQLException e){
        }
        
        return produtos;
    }
    
    public void apagarTudo() {
        String sql = "delete from Alunos";
        
        PreparedStatement ps;
        
        try {
            ps = this.conexao.prepareStatement(sql);
            ps.execute();
        } catch (SQLException e) {
        }
    }
}
