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
    
    // Método responsavel por conectar ao banco
    public static Connection conector () {
        java.sql.Connection conexao = null;
        
        // Executa o chamamento do Drive MySQL Conector
        String driver = "com.mysql.jdbc.Driver";
        
            // Armazenando informações do DB
            String url="jdbc:mysql://localhost:3306/dbinfox";
            String user="administrator";
            String password="25X86h@91";
            
            // Estabelecimento de conexão ao DB e ao Java
            try {
                class forName(driver);
                        conexao = DriverManager.getConnection(url, user, password);
                            return conexao;
        } catch (Exception e) {
                // Linha de apoio a erros
                // System.out.println("e");
            return null;
        }
    }
}
