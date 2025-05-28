/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.registro_assinatura.dao;

/**
 *
 * @author starrk
 */

import java.sql.*;
import br.com.registro_assinatura.dto.ProdutoDTO;


public class ProdutoDAO {
    
    public ProdutoDAO(){
        
    }
    
    
    private ResultSet rs = null;
    private Statement stmt = null;
    
    
public boolean inserirProduto(ProdutoDTO produtoDTO){
    try {
        ConexaoDAO.ConnectDB();
        stmt = ConexaoDAO.con.createStatement();
        
//            private String nome_prod, desc_prod, sku_prod;
//    private int custo_prod, venda_prod;
    
        String comando = "Insert into produto (nome_prod, desc_prod, sku_prod, "
                + "custo_prod, venda_prod ) values ( "
                + "'" + produtoDTO.getNome_prod()+ "', "
                + "'" + produtoDTO.getDesc_prod()+ "', "
                + "'" + produtoDTO.getEan_prod()+ "', "
                + produtoDTO.getCusto_prod()+ ", "
                + produtoDTO.getVenda_prod()+ ")";
        
        stmt.execute(comando.toUpperCase());
        ConexaoDAO.con.commit();
        stmt.close();
        return true;
    }catch (Exception e) {
        System.out.println(e.getMessage());
        return false;
    }finally{
        ConexaoDAO.CloseDB();
    }
}

public boolean alterarProduto(ProdutoDTO produtoDTO){
    try{
        stmt = ConexaoDAO.con.createStatement();
        
        String comando = "Update produto set "
                + "nome_prod = '" + produtoDTO.getNome_prod()+ "', "
                + "desc_prod = '" + produtoDTO.getDesc_prod()+ "', "
                + "sku_prod = '" + produtoDTO.getEan_prod()+ "', "
                + "custo_prod = " + produtoDTO.getCusto_prod()+ ", "
                + "venda_prod = " + produtoDTO.getVenda_prod()+ " "
                + "where id_prod = " + produtoDTO.getId_prod();
        
        stmt.execute(comando.toUpperCase());
        ConexaoDAO.con.commit();
        stmt.close();
        return true;
        
    }catch (Exception e){
        System.out.println(e.getMessage());
        return false;
    }finally{
        ConexaoDAO.CloseDB();
    }
}

public boolean excluirProduto(ProdutoDTO produtoDTO){
    try{
        ConexaoDAO.ConnectDB();
        
        stmt = ConexaoDAO.con.createStatement();
        String comando = "Delete from produto where id_prod = " + produtoDTO.getId_prod();
        stmt.execute(comando);
        ConexaoDAO.con.commit();
        stmt.close();
        return true;
    }catch (Exception e){
        System.out.println(e.getMessage());
        return false;
    }finally{
        ConexaoDAO.CloseDB();
    }
}

public ResultSet consultarProduto(ProdutoDTO produtoDTO, int opcao){
    try{
        ConexaoDAO.ConnectDB();
        stmt = ConexaoDAO.con.createStatement();
        String comando = "";
        
        switch (opcao){
            case 1:
                comando = "Select p.* "+
                        "from produto p "+
                        "where p.nome_prod ilike '" + produtoDTO.getNome_prod()+ "%' " +
                        "order by p.nome_prod";
            break;
            case 2:
                comando = "Select p.*, p.nome_for, p.id_for "+
                          "from produto p "+
                          "where p.id_for = "+produtoDTO.getId_prod();
            break;
        }
            rs = stmt.executeQuery(comando.toUpperCase());
            return rs;
        
    }catch (Exception e){
        System.out.println(e.getMessage());
        return rs;
        }
    }


}
    
   
