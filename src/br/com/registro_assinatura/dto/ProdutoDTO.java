/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.registro_assinatura.dto;

/**
 *
 * @author starrk
 */
public class ProdutoDTO {

    public int getId_prod() {
        return id_prod;
    }

    public void setId_prod(int id_prod) {
        this.id_prod = id_prod;
    }

    private String nome_prod, desc_prod, ean_prod;
    private int id_prod;
    private double custo_prod, venda_prod;
    
    public String getNome_prod() {
        return nome_prod;
    }

    public void setNome_prod(String nome_prod) {
        this.nome_prod = nome_prod;
    }

    public String getDesc_prod() {
        return desc_prod;
    }

    public void setDesc_prod(String desc_prod) {
        this.desc_prod = desc_prod;
    }

    public String getEan_prod() {
        return ean_prod;
    }

    public void setEan_prod(String ean_prod) {
        this.ean_prod = ean_prod;
    }

    public double getCusto_prod() {
        return custo_prod;
    }

    public void setCusto_prod(double custo_prod) {
        this.custo_prod = custo_prod;
    }

    public double getVenda_prod() {
        return venda_prod;
    }

    public void setVenda_prod(double venda_prod) {
        this.venda_prod = venda_prod;
    }

}
