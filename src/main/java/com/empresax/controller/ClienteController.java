/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.empresax.controller;

import com.empresax.model.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 1248874
 */
public class ClienteController {

    private List<Cliente> clientes;

    public ClienteController() {
        this.clientes = new ArrayList<Cliente>();
    }

    public void cadastrarCliente(String nome, String endereco, String telefone, String email, String cpf) {
        Cliente c = new Cliente();
        c.setNome(nome);
        c.setEndereco(endereco);
        c.setTelefone(telefone);
        c.setEmail(email);
        c.setCPF(cpf);
        clientes.add(c);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    public String listarClientes() {
        StringBuilder lista = new StringBuilder();
        if (clientes.isEmpty()) {
            System.out.println("Não há clientes cadastrados!");
        } else {
            for (Cliente c : clientes) {
                lista.append(c);
                lista.append("\n\n");
            }
        }
        return lista.toString();
    }
}
