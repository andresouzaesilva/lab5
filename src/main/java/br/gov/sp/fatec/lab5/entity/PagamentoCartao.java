package br.gov.sp.fatec.lab5.entity;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pag_pagamento_cartao")
public class PagamentoCartao extends Pagamento {

    private Integer parcelas;

    public Double getValorParcelas() {
        return this.valor / parcelas;
    }

    @Override
    public String toString() {
        return "PagamentoCartao{" +
                "parcelas=" + parcelas +
                ", valor=" + valor +
                ", pedido=" + pedido +
                ", id=" + id +
                '}';
    }
}
