/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import com.google.gson.Gson;
import javax.swing.JOptionPane;

/**
 *
 * @author thiagorozaa
 */
public class Requisicao {
    public int idade;
    public int codigoProcedimento;
    public char sexo;
    public String cpf;
    
    public boolean validaRequisicao(String aux){
        String retorno="";
        Integer tipoRetorno=2;
        Gson gson = new Gson();
        Requisicao req = gson.fromJson(aux ,Requisicao.class);
        
        switch (req.codigoProcedimento) {
        case 1234:
            if ((req.idade==10 || req.idade==20) && (req.sexo == 'M')){
                retorno = "Autorizado!";
                tipoRetorno = 1;
            }
            break;
        case 4567:
            if ((req.idade==20 && sexo == 'M') || (req.idade==30  && req.sexo == 'F')){
                retorno = "Autorizado!";
                tipoRetorno = 1;
            }
            break;
        case 6789:
            if ((req.idade==10) && (req.sexo == 'M' || req.sexo == 'F')){
                retorno = "Autorizado!";
                tipoRetorno = 1;
            }
            break;
        default:
          retorno = "Negado! Código inválido do procedimento";
          tipoRetorno = 2;
          break;
        }
        
        if (req.idade != 10 && req.idade != 20 && req.idade != 30) { 
            retorno += "\nNegado! Idade inválida";
            tipoRetorno = 2;
        }
                          
        return tipoRetorno == 1;
       
    }
    
}


