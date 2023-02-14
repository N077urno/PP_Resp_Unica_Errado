/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pp_resp_unica_errado;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author nando
 */
public class CarrinhoDeCompras {
    private List<Item> itens = new ArrayList<>();

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public void removerItem(Item item) {
        itens.remove(item);
    }

    public void calcularTotal() {
        double total = 0.0;
        for (Item item : itens) {
            total += item.getPreco();
        }
        System.out.println("Total: " + total);
    }

    public void imprimirItens() {
        for (Item item : itens) {
            System.out.println(item.getNome() + " - " + item.getPreco());
        }
    }
}
