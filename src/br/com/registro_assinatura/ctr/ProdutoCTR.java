/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.registro_assinatura.ctr;

import java.sql.ResultSet;
import br.com.registro_assinatura.dto.ProdutoDTO;
import br.com.registro_assinatura.dao.ProdutoDAO;
import br.com.registro_assinatura.dao.ConexaoDAO;

/**
 *
 * @author starrk
 */
public class ProdutoCTR {
    
    ProdutoDAO produtoDAO = new ProdutoDAO();
    
    public ProdutoCTR(){
    }
    
    public String inserirProduto(ProdutoDTO produtoDTO){
        try{
            if(produtoDAO.inserirProduto(produtoDTO)){
                return "Produto Cadastrado com Sucesso!!";
            }else{
                return "Produto não cadastrado!";
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
            return "Produto não Cadastrado";
        }
    }
    
    public String alterarProduto(ProdutoDTO produtoDTO){
        try{
            if (produtoDAO.alterarProduto(produtoDTO)){
                return "Produto alterado com sucesso";
            }else{
                return "Falha ao alterar produto";
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
            return "Produto Não Alterado!";
        }
    }
    
    public String excluirProduto(ProdutoDTO produtoDTO){
        try{
            if (produtoDAO.excluirProduto(produtoDTO)){
                return "Produto excluido com sucesso!";
            }else{
                return "Produto não Excluido!";
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
            return "Falha ao excluir produto!";
        }
    }
    
    public ResultSet consultarProduto(ProdutoDTO produtoDTO, int opcao){
        ResultSet rs = null;
        rs = produtoDAO.consultarProduto(produtoDTO, opcao);
        return rs;
    }
    
    public void CloseDB(){
        ConexaoDAO.CloseDB();
    }
    
}
