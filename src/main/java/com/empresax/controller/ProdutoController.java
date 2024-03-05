/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.empresax.controller;

import com.empresax.model.Produto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 1248874
 */
public class ProdutoController {

    private List<Produto> produtos;

    public ProdutoController() {
        this.produtos = new ArrayList<Produto>();
    }

    public void cadastrarProduto(String nome, String codBarras, float valorCusto, float valorVenda, String descricao) {
        Produto p = new Produto();
        p.setNome(nome);
        p.setCodBarras(codBarras);
        p.setValorCusto(valorCusto);
        p.setValorVenda(valorVenda);
        p.setDescricao(descricao);
        produtos.add(p);
        System.out.println("Produto cadastrado com sucesso!");
    }

       public String listarProdutos() {
        StringBuilder lista = new StringBuilder();
        if (produtos.isEmpty()) {
            System.out.println("Não há produtos cadastrados!");
        } else {
            for (Produto p : produtos) {
                lista.append(p);
                lista.append("\n\n");
            }
        }
        return lista.toString();
    }
}
