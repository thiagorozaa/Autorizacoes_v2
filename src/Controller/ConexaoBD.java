/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author thiagorozaa
 */
public class ConexaoBD {
    
    public Statement stm;
    public ResultSet rs;
    private final String driver="org.postgresql.Driver";
    private final String caminho="jdbc:postgresql://localhost:5432/autorizacoes";
    private final String usuario="postgres";
    private String senha="123456";
    public Connection conn;
    
    
    
    public void conexao(){
        
        try {
            System.setProperty("jdbc.Drivers", driver);
            conn=DriverManager.getConnection(caminho,usuario,senha);
            //JOptionPane.showMessageDialog(null, "Conexão realizada com sucesso");
            System.out.println("Conexão realizada com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar com banco de dados\n" + ex);
            System.out.println(ex);
        }
        
    }
    
    public void desconecta(){
        try {
            conn.close();
            //JOptionPane.showMessageDialog(null, "Desconectado com sucesso");
            System.out.println("Desconectado com sucesso");
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Não foi possível efetuar desconexão\n" + ex);
            System.out.println("Não foi possível efetuar desconexão\n" + ex);
            
        }
    }

    
    
}
