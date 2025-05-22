/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.registro_assinatura.ctr;

import java.sql.ResultSet;
import br.com.registro_assinatura.dto.AssinanteDTO;
import br.com.registro_assinatura.dao.AssinanteDAO;
import br.com.registro_assinatura.dao.ConexaoDAO;
/**
 *
 * @author starrk
 */
public class AssinanteCTR {
    AssinanteDAO assinanteDAO = new AssinanteDAO();
    
    public AssinanteCTR(){    
    }
    
    public String inserirAssinante(AssinanteDTO assinanteDTO){
        try{
            if(assinanteDAO.inserirAssinante(assinanteDTO)){
                return "Assinante Cadastrado com sucesso";
            }else{
                return "Assinante nao cadastrado!";
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
            return "Assinante não cadastrado";
        }
    }
    public ResultSet consultarAssinante(AssinanteDTO assinanteDTO, int opcao){
        ResultSet rs = null;
        rs = assinanteDAO.consultarAssinante(assinanteDTO, opcao);
        return rs;
    }
    public void CloseDB(){
        ConexaoDAO.CloseDB();
    }
    public String alterarAssinante(AssinanteDTO assinanteDTO){
        try{
            if(assinanteDAO.alterarAssinante(assinanteDTO)){
                return"Assinante alterado com Sucesso!!";
            }else{
                return "Assinante não alterado";
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
            return "Assinante não alterado";
        }
    }
    public String excluirAssinante(AssinanteDTO assinanteDTO){
        try{
            if(assinanteDAO.excluirAssinante(assinanteDTO)){
                return "cliente excluido com sucesso!";
            }else{
                return "Cliente não excluido!";
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
            return "Cliente não excluido!";
        }
    }
    
}
