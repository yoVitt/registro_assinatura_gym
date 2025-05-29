/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.registro_assinatura.ctr;

import br.com.registro_assinatura.dao.ConexaoDAO;
import br.com.registro_assinatura.dao.VendaDAO;
import br.com.registro_assinatura.dto.VendaDTO;
import br.com.registro_assinatura.dto.AssinanteDTO;
import javax.swing.JTable;

/**
 *
 * @author starrk
 */

public class VendaCTR {
    VendaDAO vendaDAO = new VendaDAO();
    
    public VendaCTR(){
        
    }
    
    public String inserirVenda(VendaDTO vendaDTO, AssinanteDTO assinanteDTO, JTable produtos){
        try{
            if(vendaDAO.inserirVenda(vendaDTO, assinanteDTO, produtos)){
                return"Venda cadastrada com sucesso!";
            }else{
                return "Venda n";
            }
            
        }catch (Exception e){
            System.out.println(e.getMessage());
            return "Venda não cadastrada";
        }
    }
    
    public void CloseDB(){
        ConexaoDAO.CloseDB();
    }
    
}
