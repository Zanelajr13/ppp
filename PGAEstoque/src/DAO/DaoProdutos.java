/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import conexoes.Conexao;
import java.util.ArrayList;
import model.ModelProdutos;
import java.sql.SQLException;
import java.sql.PreparedStatement;


public class DaoProdutos extends Conexao {
    
/*Cadastrar um produto no banco*/
public int salvarProdutosDAO(ModelProdutos pModelProdutos) {
    try {
        this.conectar();
        String query = "INSERT INTO produto (nomeProduto, "
                + "descricao, "
                + "referencia, "
                + "fabricante, "
                + "quantidadeAdquirida, "
                + "precoVenda, "
                + "precoCusto, "
                + "categoria"
                + ") VALUES ("
                + "?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = this.getCon().prepareStatement(query);
        preparedStatement.setString(1, pModelProdutos.getProNome());
        preparedStatement.setString(2, pModelProdutos.getProDescricao());
        preparedStatement.setString(3, pModelProdutos.getProReferencia());
        preparedStatement.setString(4, pModelProdutos.getProFabricante());
        preparedStatement.setDouble(5, pModelProdutos.getProQuantidade());
        preparedStatement.setDouble(6, pModelProdutos.getProPrecoVenda());
        preparedStatement.setDouble(7, pModelProdutos.getProPrecoCusto());
        preparedStatement.setString(8, pModelProdutos.getProCategoria());

        int rowsInserted = preparedStatement.executeUpdate();

        return rowsInserted;
    } catch (SQLException e) {
        e.printStackTrace();
        return 0;
    } finally {
        this.fecharConexao();
    }
}

    
/*Excluir um produto do banco*/
public boolean excluirProdutoDAO(int pIdProduto) {
    try {
        this.conectar();
        return this.executarUpdateDeleteSQL(
                "DELETE FROM produto WHERE ID_produto = " + pIdProduto
        );
    } catch (Exception e) {
        e.printStackTrace();
        return false;
    }finally{
        this.fecharConexao();
    }
}

/*Alterar dados do produto*/
public boolean alterarProdutoDAO(ModelProdutos pModelProdutos) {
    try {
        this.conectar();
        return this.executarUpdateDeleteSQL(
            "UPDATE produto SET " +
            "nomeProduto = '" + pModelProdutos.getProNome() + "', " +
            "descricao = '" + pModelProdutos.getProDescricao() + "', " +
            "referencia = '" + pModelProdutos.getProReferencia() + "', " +        
            "fabricante = '" + pModelProdutos.getProFabricante() + "', " +
            "quantidadeAdquirida = " + pModelProdutos.getProQuantidade() + ", " +
            "precoVenda = " + pModelProdutos.getProPrecoVenda() + ", " +
            "precoCusto = " + pModelProdutos.getProPrecoCusto() + ", " +
            "categoria = '" + pModelProdutos.getProCategoria() + "' " +
            "WHERE ID_Produto = " + pModelProdutos.getIdProduto()
        );
    } catch (Exception e) {
        return false;
    }
}

/*Retornar um produto pelo código*/
public ModelProdutos retornarProdutoDAO(int pIdProduto) {
    ModelProdutos modelProdutos = new ModelProdutos();
    try {
        this.conectar();
        this.executarSQL("SELECT "
                + "ID_Produto, "
                + "nomeProduto, "
                + "descricao, "
                + "referencia, "
                + "fabricante, "
                + "quantidadeAdquirida, "
                + "precoVenda, "
                + "precoCusto, "
                + "categoria "
                + "FROM produto WHERE ID_Produto = '" + pIdProduto + "'");
        while (this.getResultSet().next()) {
            modelProdutos.setIdProduto(this.getResultSet().getInt(1));
            modelProdutos.setProNome(this.getResultSet().getString(2));
            modelProdutos.setProDescricao(this.getResultSet().getString(3));
            modelProdutos.setProReferencia(this.getResultSet().getString(4));
            modelProdutos.setProFabricante(this.getResultSet().getString(5));
            modelProdutos.setProQuantidade(this.getResultSet().getDouble(6));
            modelProdutos.setProPrecoVenda(this.getResultSet().getDouble(7));
            modelProdutos.setProPrecoCusto(this.getResultSet().getDouble(8));
            modelProdutos.setProCategoria(this.getResultSet().getString(9));
        }
    } catch (Exception e) {
        
    }finally{
        this.fecharConexao();
    }
    return modelProdutos;
}

/*Retornar uma lista completa de produtos*/
public ArrayList<ModelProdutos> retornarListaProdutosDAO() {
ArrayList<ModelProdutos> listaModelProdutos = new ArrayList<>();
ModelProdutos modelProdutos = new ModelProdutos();
try {
    this.conectar();
    this.executarSQL("SELECT "
                + "ID_Produto, "
                + "nomeProduto, "
                + "descricao, "
                + "referencia, "
                + "fabricante, "
                + "quantidadeAdquirida, "
                + "precoVenda, "
                + "precoCusto, "
                + "categoria "
                + "FROM produto;");
    while (this.getResultSet().next()) {
        modelProdutos = new ModelProdutos();
        modelProdutos.setIdProduto(this.getResultSet().getInt(1));
        modelProdutos.setProNome(this.getResultSet().getString(2));
        modelProdutos.setProDescricao(this.getResultSet().getString(3));
        modelProdutos.setProReferencia(this.getResultSet().getString(4));
        modelProdutos.setProFabricante(this.getResultSet().getString(5));
        modelProdutos.setProQuantidade(this.getResultSet().getDouble(6));
        modelProdutos.setProPrecoVenda(this.getResultSet().getDouble(7));
        modelProdutos.setProPrecoCusto(this.getResultSet().getDouble(8));
        modelProdutos.setProCategoria(this.getResultSet().getString(9));
        listaModelProdutos.add(modelProdutos);
    }
    
    }catch(Exception e) {
        e.printStackTrace();
    }finally{
        this.fecharConexao();
    }
    return listaModelProdutos;
    }

/*Buscar gerando uma lista de produtos pelo nome**/

    /**
     *
     * @param pnomeProduto
     * @return
     */

public ModelProdutos retornarProdutoPeloNomeDAO(String pnomeProduto) {
ModelProdutos modelProdutos = new ModelProdutos();
    try {
        this.conectar();
        this.executarSQL("SELECT * FROM produto WHERE nomeProduto like '" + pnomeProduto + "%' ORDER BY nomeProduto");
        while (this.getResultSet().next()) {
         modelProdutos.setProNome(this.getResultSet().getString(2));
        }
    } catch (Exception e) {
        
    }finally{
        this.fecharConexao();
    }
    return modelProdutos;
}

}






