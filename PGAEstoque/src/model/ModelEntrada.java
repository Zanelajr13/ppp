/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author Usuario
 */
public class ModelEntrada {
    private int IdEntrada;
    private LocalDate dataEntrada;
    private double quantEntrada;
    private String formaEntrada;
    private String numNotaEntrada;
    
    // Chaves estrangeiras //
    private ModelFornecedor fornecedor;

    public int getIdEntrada() {
        return IdEntrada;
    }

    public void setIdEntrada(int IdEntrada) {
        this.IdEntrada = IdEntrada;
    }

    public LocalDate getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(LocalDate dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public double getQuantEntrada() {
        return quantEntrada;
    }

    public void setQuantEntrada(double quantEntrada) {
        this.quantEntrada = quantEntrada;
    }

    public String getFormaEntrada() {
        return formaEntrada;
    }

    public void setFormaEntrada(String formaEntrada) {
        this.formaEntrada = formaEntrada;
    }

    public String getNumNotaEntrada() {
        return numNotaEntrada;
    }

    public void setNumNotaEntrada(String numNotaEntrada) {
        this.numNotaEntrada = numNotaEntrada;
    }
    
    //Chave estrangeira //
    
    public ModelFornecedor getFornecedor() {
        return fornecedor;
    }
    
    public void setFornecedor(ModelFornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    
    
}
