package com.example.demo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Lancamento")
public class Transaction {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_lancamento;

    private Double valor;

    private String tipo_conta;

    private String data_lancamento;

    private String tipo_lancamento;

    private Integer id_cnpj;

    private String forma_pagamento;

    private String observacao;

    private Boolean status_lancamento;

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getTipo_conta() {
        return tipo_conta;
    }

    public void setTipo_conta(String tipo_conta) {
        this.tipo_conta = tipo_conta;
    }

    public String getData_lancamento() {
        return data_lancamento;
    }

    public void setData_lancamento(String data_lancamento) {
        this.data_lancamento = data_lancamento;
    }

    public String getTipo_lancamento() {
        return tipo_lancamento;
    }

    public void setTipo_lancamento(String tipo_lancamento) {
        this.tipo_lancamento = tipo_lancamento;
    }

    public Integer getId_cnpj() {
        return id_cnpj;
    }

    public void setId_cnpj(Integer id_cnpj) {
        this.id_cnpj = id_cnpj;
    }

    public String getForma_pagamento() {
        return forma_pagamento;
    }

    public void setForma_pagamento(String forma_pagamento) {
        this.forma_pagamento = forma_pagamento;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Boolean getStatus_lancamento() {
        return status_lancamento;
    }

    public void setStatus_lancamento(Boolean status_lancamento) {
        this.status_lancamento = status_lancamento;
    }

    public Integer getId_lancamento() {
        return id_lancamento;
    }

    public void setId_lancamento(Integer id_lancamento) {
        this.id_lancamento = id_lancamento;
    }
    
}
