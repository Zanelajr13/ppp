/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import model.ModelFuncionario;

        

/**
 *
 * @author Usuario
 */
public class ModelEstoque {
    private int idEstoque;
    private int quantEstoque;
    private int quantMin;
    private int quantMax;
    private String statusProduto;

    // Chaves estrangeiras
    private ModelFuncionario funcionario;
    private ModelProdutos produto;
    private ModelEntrada entradaEstoque;
    private ModelSaida saidaEstoque;

    public ModelEstoque() {
        // Construtor vazio
    }

    // Getters e setters para os campos da tabela
    public int getIdEstoque() {
        return idEstoque;
    }

    public void setIdEstoque(int idEstoque) {
        this.idEstoque = idEstoque;
    }

    public int getQuantEstoque() {
        return quantEstoque;
    }

    public void setQuantEstoque(int quantEstoque) {
        this.quantEstoque = quantEstoque;
    }

    public int getQuantMin() {
        return quantMin;
    }

    public void setQuantMin(int quantMin) {
        this.quantMin = quantMin;
    }

    public int getQuantMax() {
        return quantMax;
    }

    public void setQuantMax(int quantMax) {
        this.quantMax = quantMax;
    }

    public String getStatusProduto() {
        return statusProduto;
    }

    public void setStatusProduto(String statusProduto) {
        this.statusProduto = statusProduto;
    }

    // Getters e setters para as chaves estrangeiras
    public ModelFuncionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(ModelFuncionario funcionario) {
        this.funcionario = funcionario;
    }

    public ModelProdutos getProduto() {
        return produto;
    }

    public void setProduto(ModelProdutos produto) {
        this.produto = produto;
    }

    public ModelEntrada getEntradaEstoque() {
        return entradaEstoque;
    }

    public void setEntradaEstoque(ModelEntrada entradaEstoque) {
        this.entradaEstoque = entradaEstoque;
    }

    public ModelSaida getSaidaEstoque() {
        return saidaEstoque;
    }

    public void setSaidaEstoque(ModelSaida saidaEstoque) {
        this.saidaEstoque = saidaEstoque;
    }
}
