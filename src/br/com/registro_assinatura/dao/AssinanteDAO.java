/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.registro_assinatura.dao;

import java.sql.*;
import br.com.registro_assinatura.dto.AssinanteDTO;

/**
 *
 * @author starrk
 */
public class AssinanteDAO {
    
    public AssinanteDAO(){
        
    }
    
    private ResultSet rs = null;
    private Statement stmt = null;
    
    
public boolean inserirAssinante(AssinanteDTO assinanteDTO){
    try{
        ConexaoDAO.ConnectDB();
        
        stmt=ConexaoDAO.con.createStatement();
        
        String comando = "Insert into assinante (nome_ass, logra_ass, bairro_ass, "+
                    "dataIni_ass, tipo_assinatura, telEmer_ass, tel_ass) values ( "+
                    "'" + assinanteDTO.getNome_ass() + "', "+
                    "'" + assinanteDTO.getLogra_ass()+ "', "+
                    "'" + assinanteDTO.getBairro_ass()+ "', "+
                    "'" + assinanteDTO.getDataIni_ass()+ "', "+
                    "'" + assinanteDTO.getTipo_assinatura()+ "', "+
                    "'" + assinanteDTO.getTelEmer_ass()+ "', "+
                    "'" + assinanteDTO.getTel_ass()+ "') ";
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
public ResultSet consultarAssinante(AssinanteDTO assinanteDTO, int opcao){
    try{
        ConexaoDAO.ConnectDB();
        stmt = ConexaoDAO.con.createStatement();
        String comando ="";
        
        switch (opcao){
            case 1:
                comando = "Select c.* "+
                        "from assinante c "+
                        "where nome_ass like '" +assinanteDTO.getNome_ass()+ "%' "+
                        "order by c.nome_ass";
            break;
            case 2:
                comando = "Select c.* from assinante c where c.id_ass = " + assinanteDTO.getId_ass();
            break;     
            case 3:
                comando = "Select c.id_ass, c.nome_ass from assinante c";
            break;
        }
        rs=stmt.executeQuery(comando.toUpperCase());
        return rs;
        
    }catch (Exception e){
        System.out.println(e.getMessage());
        return rs;
    }
}

public boolean alterarAssinante(AssinanteDTO assinanteDTO){
    try{
        ConexaoDAO.ConnectDB();
        stmt = ConexaoDAO.con.createStatement();
        String comando = "Update assinante set "+
                    "nome_ass = '" + assinanteDTO.getNome_ass() + "', "+
                    "logra_ass = '" + assinanteDTO.getLogra_ass()+ "', "+
                    "bairro_ass = '" + assinanteDTO.getBairro_ass()+ "', "+
                    "dataIni_ass = '" + assinanteDTO.getDataIni_ass()+ "', "+
                    "tipo_assinatura = '" + assinanteDTO.getTipo_assinatura()+ "', "+
                    "telEmer_ass = "+ assinanteDTO.getTelEmer_ass()+ ", "+
                    "tel_ass = " + assinanteDTO.getTel_ass()+ " "+
                    "where id_ass = "+ assinanteDTO.getId_ass();
                    
       
        stmt.execute(comando.toUpperCase());
        ConexaoDAO.con.commit();
        stmt.close();
        return true;
    }catch(Exception e){
        System.out.println(e.getMessage());
        return false;
    }finally{
        ConexaoDAO.CloseDB();
    }
}
    public boolean excluirAssinante(AssinanteDTO assinanteDTO){
        try{
            ConexaoDAO.ConnectDB();
            stmt = ConexaoDAO.con.createStatement();
            String comando = "Delete from assinante where id_ass = "+assinanteDTO.getId_ass();
            stmt.execute(comando);
            
            ConexaoDAO.con.commit();
            stmt.close();
            return true;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }finally{
            ConexaoDAO.CloseDB();
        }
    }
    
}
