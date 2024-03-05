/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.empresax.view;

import com.empresax.controller.ClienteController;
import java.util.Scanner;

/**
 *
 * @author 1248874
 */
public class ClienteView {

    private Scanner ler;
    private ClienteController cc;

    public ClienteView() {
        this.ler = new Scanner(System.in);
        this.cc = new ClienteController();
    }

    public void cadastrarCliente() {
        System.out.println("Informe o nome: ");
        String nome = ler.next();
        System.out.println("Informe o endereço: ");
        String endereco = ler.next();
        System.out.println("Informe o telefone: ");
        String telefone = ler.next();
        System.out.println("Informe o e-mail: ");
        String email = ler.next();
        System.out.println("Informe o cpf: ");
        String CPF = ler.next();
        cc.cadastrarCliente(nome, endereco, telefone, email, CPF);
    }

    public void listarClientes() {
        cc.listarClientes();
    }

    public void menu() {
        int op;
        do {
            System.out.println("-----------MENU-----------");
            System.out.println("|1- Cadastrar Cliente    |");
            System.out.println("|2- Listar Cliente       |");
            System.out.println("|3- Sair                 |");
            System.out.println("--------------------------");
            op = ler.nextInt();
            if (op == 1) {
                cadastrarCliente();
            } else if (op == 2) {
                listarClientes();
            }
        } while (op != 3);
    }

}
