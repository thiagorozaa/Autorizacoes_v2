/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Requisicao;
import com.google.gson.Gson;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author thiagorozaa
 */
public class ControllerRequisicao {
    
    ConexaoBD con = new ConexaoBD();
    
    public void consultar(Integer codigoProcedimento){
        con.conexao();
        try {
            PreparedStatement pst = con.conn.prepareStatement("SELECT * FROM requisicao WHERE CODIGO_PROCEDIMENTO = ?");
            pst.setInt(1,codigoProcedimento);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados consultados com sucesso.");
        } catch (SQLException ex) {
            Logger.getLogger(ControllerRequisicao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Não foi possível consultar os dados\n" + ex);
        }
        con.desconecta();
    }
    
    public void inserir(String dados){
        con.conexao();
        Gson gson = new Gson();
        Requisicao req = gson.fromJson(dados ,Requisicao.class);
        
        try {
            PreparedStatement pst = con.conn.prepareStatement("INSERT INTO requisicao(CPF,CODIGO_PROCEDIMENTO,IDADE,SEXO) VALUES (?,?,?,?)");
            pst.setString(1,req.cpf);
            pst.setInt(2,req.codigoProcedimento);
            pst.setInt(3,req.idade);
            pst.setString(4,Character.toString(req.sexo));
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso.");
        } catch (SQLException ex) {
            Logger.getLogger(ControllerRequisicao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Não foi possível inserir os dados\n" + ex);
        }
        con.desconecta();
    }
    
    public void atualizar(String cpf, Integer idade,char sexo){
        
        con.conexao();
        
        try {
            PreparedStatement pst = con.conn.prepareStatement("UPDATE requisicao SET IDADE=?,SEXO=? WHERE CPF =?");
            pst.setInt(1,idade);
            pst.setString(2,Character.toString(sexo));
            pst.setString(3,cpf);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso.");
        } catch (SQLException ex) {
            Logger.getLogger(ControllerRequisicao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Não foi possível atualizar os dados\n" + ex);
        }
        con.desconecta();
        
    }
    
    public void deletar(Integer codigoProcedimento,String cpf){
        
        con.conexao();
        try {
            PreparedStatement pst = con.conn.prepareStatement("DELETE FROM requisicao WHERE CPF =? AND CODIGO_PROCEDIMENTO=?");
            pst.setString(1,cpf);
            pst.setInt(2,codigoProcedimento);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados deletados com sucesso.");
        } catch (SQLException ex) {
            Logger.getLogger(ControllerRequisicao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Não foi possível deletar os dados\n" + ex);
        }
        con.desconecta();
        
    }
    
}
