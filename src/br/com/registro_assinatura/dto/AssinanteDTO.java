/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.registro_assinatura.dto;


public class AssinanteDTO {
    private String bairro_ass, dataIni_ass, logra_ass, nome_ass, tipo_assinatura, telEmer_ass, tel_ass;
    private int id_ass;

    public int getId_ass() {
        return id_ass;
    }

    public void setId_ass(int id_ass) {
        this.id_ass = id_ass;
    }

    public String getBairro_ass() {
        return bairro_ass;
    }

    public void setBairro_ass(String bairro_ass) {
        this.bairro_ass = bairro_ass;
    }

    public String getDataIni_ass() {
        return dataIni_ass;
    }

    public void setDataIni_ass(String dataIni_ass) {
        this.dataIni_ass = dataIni_ass;
    }

    public String getLogra_ass() {
        return logra_ass;
    }

    public void setLogra_ass(String logra_ass) {
        this.logra_ass = logra_ass;
    }

    public String getTelEmer_ass() {
        return telEmer_ass;
    }

    public void setTelEmer_ass(String telEmer_ass) {
        this.telEmer_ass = telEmer_ass;
    }

    public String getTel_ass() {
        return tel_ass;
    }

    public void setTel_ass(String tel_ass) {
        this.tel_ass = tel_ass;
    }

    public String getNome_ass() {
        return nome_ass;
    }

    public void setNome_ass(String nome_ass) {
        this.nome_ass = nome_ass;
    }

    public String getTipo_assinatura() {
        return tipo_assinatura;
    }

    public void setTipo_assinatura(String tipo_assinatura) {
        this.tipo_assinatura = tipo_assinatura;
    }

}
