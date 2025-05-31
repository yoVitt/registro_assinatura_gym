/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.registro_assinatura.ctr;

import java.sql.ResultSet;
import br.com.registro_assinatura.dto.FuncionarioDTO;
import br.com.registro_assinatura.dao.FuncionarioDAO;
import br.com.registro_assinatura.dao.ConexaoDAO;

/**
 *
 * @author starrk
 */
public class FuncionarioCTR {
    FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
    
    public FuncionarioCTR(){
    }
    
    public String inserirFuncionario(FuncionarioDTO funcionarioDTO){
        try{
            if (funcionarioDAO.inserirFuncionario(funcionarioDTO)){
                return "Funcionario cadastrado com sucesso!";
            }else{
                return "Funcionario não cadastrado!";
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
            return "Funcionario nao Cadastrado";
        }
    }
    
    public String alterarFuncionario(FuncionarioDTO funcionarioDTO){
        try{
            if (funcionarioDAO.alterarFuncionario(funcionarioDTO)){
                return "Funcionario alterado com sucesso!";
            }else{
                return "Funcionario não cadastrado!";
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
            return "Funcionario não alterado";
        }
    }
    
    public String excluirFuncionario(FuncionarioDTO funcionarioDTO){
        try{
            if(funcionarioDAO.excluirFuncionario(funcionarioDTO)){
                return "Funcionario excluido com sucesso!";
            }else{
                return "Funcionario não excluido!";
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
            return "Funcionario não excluido";
        }
    }
    
    public ResultSet consultarFuncionario(FuncionarioDTO funcionarioDTO, int opcao) {
        ResultSet rs = null;
        rs = funcionarioDAO.consultarFuncionario(funcionarioDTO, opcao);
        return rs;
    }
    
    public String logarFuncionario(FuncionarioDTO funcionarioDTO) {
        return funcionarioDAO.logarFuncionario(funcionarioDTO);
        
    }
    
    public void CloseDB(){
        ConexaoDAO.CloseDB();
    }
    
    
}

