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
public class ModelSaida {
    private int IdSaida;
    private LocalDate dataSaida;
    private double quantSaida;
    private String formaSaida;

    public int getIdSaida() {
        return IdSaida;
    }

    public void setIdSaida(int IdSaida) {
        this.IdSaida = IdSaida;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }

    public double getQuantSaida() {
        return quantSaida;
    }

    public void setQuantSaida(double quantSaida) {
        this.quantSaida = quantSaida;
    }

    public String getFormaSaida() {
        return formaSaida;
    }

    public void setFormaSaida(String formaSaida) {
        this.formaSaida = formaSaida;
    }
    
    
    
    
}
