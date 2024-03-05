/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.empresax.view;

import java.util.Scanner;

/**
 *
 * @author 1248874
 */
public class Projeto01MVC {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ClienteView cv = new ClienteView();
        ProdutoView pv = new ProdutoView();
        int op;
        do {
            System.out.println("------MENU PRINCIPAL------");
            System.out.println("|1- Gerenciar Cliente    |");
            System.out.println("|2- Gerenciar Produto    |");
            System.out.println("|3- Sair                 |");
            System.out.println("--------------------------");
            op = ler.nextInt();
            if (op == 1) {
                cv.menu();
            } else if (op == 2) {
                pv.menu();
            }
        } while (op != 3);
    }
}
