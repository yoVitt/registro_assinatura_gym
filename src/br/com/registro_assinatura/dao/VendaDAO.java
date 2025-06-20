/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.registro_assinatura.dao;

import br.com.registro_assinatura.dto.AssinanteDTO;
import br.com.registro_assinatura.dto.VendaDTO;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JTable;

/**
 *
 * @author starrk
 */
public class VendaDAO {
    

    public VendaDAO(){
    }
    

    private ResultSet rs = null;
    Statement stmt = null;
    Statement stmt1 = null;
    SimpleDateFormat date = new SimpleDateFormat ("dd/MM/yyyy");
    

    public boolean inserirVenda(VendaDTO vendaDTO, AssinanteDTO assinanteDTO, JTable produtos){
        try{
            ConexaoDAO.ConnectDB();
            stmt = ConexaoDAO.con.createStatement();
            stmt1 = ConexaoDAO.con.createStatement();
            
            
            String comando1 = "Insert into Venda (dat_vend, val_vend, "
                    + "id_ass) values ( "
                    + "to_date('" + date.format(vendaDTO.getDat_vend()) + "', 'DD/MM/YYYY'), "
                    + vendaDTO.getVal_vend() + ", "
                    + assinanteDTO.getId_ass() + ")";
            

            stmt.execute(comando1.toUpperCase(), Statement.RETURN_GENERATED_KEYS);
            rs = stmt.getGeneratedKeys();
            rs.next();
            
            for(int cont=0; cont < produtos.getRowCount(); cont++){
                String comando2 = "Insert into produto_venda (id_vend, id_prod, "
                        + "val_prod, qtd_prod) Values ( "
                        + rs.getInt("id_vend") + ", "
                        + produtos.getValueAt(cont, 0) + ", "
                        + produtos.getValueAt(cont, 2) + ", "
                        + produtos.getValueAt(cont, 3) + "); ";
                
                stmt1.execute(comando2);
            }
            ConexaoDAO.con.commit();
            stmt.close();
            stmt1.close();
            rs.close();
            return true;
        }

        catch(Exception e){
            System.out.println(e.getMessage());
            return false;
        }
        finally{

            ConexaoDAO.CloseDB();
        }
    }
}
