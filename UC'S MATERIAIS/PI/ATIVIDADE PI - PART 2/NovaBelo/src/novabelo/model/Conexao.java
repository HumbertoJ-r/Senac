/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package novabelo.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {
    
    private Connection conexao;

    public Connection getConexao() {
        return conexao;
    }
    
    public void conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost/novabelo_bd", "root", "erick031119");
            System.out.println("SUCESSO DE CONEXAO!");
        } catch (ClassNotFoundException e) {
            System.out.println("Falha ao carregar a classe de conexAo. Classe nao encontrada!");
        } catch (SQLException e) {
            System.out.println("Falha ao conectar com o banco. Erro de SQL.");
        }
    }
    
    public void desconectar() {
        try {
            if(conexao != null && !conexao.isClosed()) {
                conexao.close();
                System.out.println("DESCONECTADO COM SUCESSO!");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao desconectar");
        }
    }
    
}
