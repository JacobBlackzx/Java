/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infox.dal;

import java.sql.*;

/**
 *
 * @author vicktorzx
 */
public class ModuloConexao {
    
// Metodo para conectar ao banco
    public static  Connection conector(){
        java.sql.Connection conexao = null;
        
    // Metodo para chamamento do drive mysql conector
        String driver = "com.mysql.jdbc.Driver";
    
    // Armazena dados do banco de dados
        String url="jdbc:mysql://localhost:3306/dbinfox";
        String user = "administrator";
        String password = "25X86h@91";
    
    // Estabelecimento de Conexão
        try {
            Class.forName(driver);
                conexao = DriverManager.getConnection(url, user, password);
                    return conexao;
        } catch (Exception e) {
    // Metodo erro de conexão
                    //System.out.println("e");
                    
                    return null;
        }
    }
}
