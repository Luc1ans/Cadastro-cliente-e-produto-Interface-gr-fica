/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.empresax.view;

import com.empresax.controller.ProdutoController;
import java.util.Scanner;

/**
 *
 * @author 1248874
 */
public class ProdutoView {

    private Scanner ler;
    private ProdutoController pc;

    public ProdutoView() {
        this.ler = new Scanner(System.in);
        this.pc = new ProdutoController();
    }

    public void cadastrarProduto() {
        System.out.println("Digite o nome do produto: ");
        String nome = ler.next();
        System.out.println("Digite o código de barras: ");
        String codBarras = ler.next();
        System.out.println("Digite o valor de custo: ");
        float valorCusto = ler.nextFloat();
        System.out.println("Digite o valor de venda: ");
        float valorVenda = ler.nextFloat();
        System.out.println("Digite a descrição detalhada do produto: ");
        String descricao = ler.next();
        pc.cadastrarProduto(nome, codBarras, valorCusto, valorVenda, descricao);
    }
    
    public void listarProdutos(){
        pc.listarProdutos();
    }
    
    public void menu(){
        int op;
        do {
            System.out.println("-----------MENU-----------");
            System.out.println("|1- Cadastrar Produto    |");
            System.out.println("|2- Listar Produto       |");
            System.out.println("|3- Sair                 |");
            System.out.println("--------------------------");
            op = ler.nextInt();
            if (op == 1) {
                cadastrarProduto();
            } else if (op == 2) {
                listarProdutos();
            }
        } while (op != 3);
    }

}
