package com.info.grid.entity;

import javax.swing.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class Pedido {

    private String numeroPedido;

    private List<Produto> produtos;
    private Cliente cliente;
    private Vendedor vendedor;

    public BigDecimal getValorTotal() {
        BigDecimal total = BigDecimal.ZERO;
        for (Produto produto : produtos) {
            total = total.add(produto.getValor().multiply(new BigDecimal(produto.getQuantidade())));
        }
        total = total.setScale(2, RoundingMode.HALF_EVEN);
        return total;
    }

    public int getTotalProdutos() {
        int total = 0;
        for (Produto produto : produtos) {
            total += produto.getQuantidade();
        }
        return total;
    }

    public void informacoes() {
        // TODO Auto-generated method stub
        String mensagem = "Nº Pedido: " + this.getNumeroPedido() + "\n" + "Cliente: " + this.getCliente().getNome()
                + "\n" + "Vendedor: " + this.getVendedor().getNome() + "\n" + "Produto(s): " + this.getTotalProdutos()
                + "\n" + "Valor total: R$ " + this.getValorTotal();
        JOptionPane.showMessageDialog(null, mensagem);
    }

    /************************************************/

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
}
