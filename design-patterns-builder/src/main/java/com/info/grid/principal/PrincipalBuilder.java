package com.info.grid.principal;

import com.info.grid.builder.PedidoBuilder;
import com.info.grid.entity.Pedido;

import java.math.BigDecimal;

public class PrincipalBuilder {

    public static void main(String[] args) {
        Pedido pedido = new PedidoBuilder()
                .setPedido("A001-RJ")
                .setCliente(100, "Paula da Silva Miranda", "21973875220")
                .setVendedor(1585, "Fernanda da Silva Oliveira")
                .setProduto("Caneta Esferográfica Azul", 1, new BigDecimal(1.80))
                .setProduto("Caixa de Láis de Cor", 2, new BigDecimal(10.00))
                .setProduto("Borracha", 2, new BigDecimal(2.50))
                .builder();
        pedido.informacoes();
    }
}
