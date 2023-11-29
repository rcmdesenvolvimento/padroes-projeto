package com.info.grid.builder;

import com.info.grid.entity.Cliente;
import com.info.grid.entity.Pedido;
import com.info.grid.entity.Produto;
import com.info.grid.entity.Vendedor;

import java.math.BigDecimal;
import java.util.ArrayList;

public class PedidoBuilder {

    private Pedido pedido;

    public PedidoBuilder() {
        this.pedido = new Pedido();
    }

    public PedidoBuilder setPedido(String numeroPedido) {
        pedido.setNumeroPedido(numeroPedido);
        return this;
    }

    public PedidoBuilder setCliente(int codigo, String nome, String telefone) {
        Cliente cliente = new Cliente();
        cliente.setCodigo(codigo);
        cliente.setNome(nome);
        cliente.setTelefone(telefone);

        pedido.setCliente(cliente);
        return this;
    }

    public PedidoBuilder setVendedor(int codigo, String nome) {
        Vendedor vendedor = new Vendedor();
        vendedor.setCodigo(codigo);
        vendedor.setNome(nome);

        pedido.setVendedor(vendedor);
        return this;
    }

    public PedidoBuilder setProduto(String nome, int quantidade, BigDecimal valor) {
        Produto produto = new Produto();
        produto.setNome(nome);
        produto.setQuantidade(quantidade);
        produto.setValor(valor);

        if (pedido.getProdutos() == null) {
            pedido.setProdutos(new ArrayList<>());
        }

        pedido.getProdutos().add(produto);

        return this;
    }

    public Pedido builder() {
        return pedido;
    }

}
