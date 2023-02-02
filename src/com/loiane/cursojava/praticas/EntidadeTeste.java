package com.loiane.cursojava.praticas;

import java.util.Date;
import java.util.List;

public class EntidadeTeste {

  public Integer id;
  private Integer codRelacionamento;
  private String nome;
  private String endereco;
  private Date data;
  private List<Object> lista;
  private boolean ativo;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getCodRelacionamento() {
    return codRelacionamento;
  }

  public void setCodRelacionamento(Integer codRelacionamento) {
    this.codRelacionamento = codRelacionamento;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public Date getData() {
    return data;
  }

  public void setData(Date data) {
    this.data = data;
  }

  public List<Object> getLista() {
    return lista;
  }

  public void setLista(List<Object> lista) {
    this.lista = lista;
  }

  public boolean isAtivo() {
    return ativo;
  }

  public void setAtivo(boolean ativo) {
    this.ativo = ativo;
  }

  @Override
  public String toString() {
    return "EntidadeTeste [id=" + id + ", codRelacionamento=" + codRelacionamento + ", nome=" + nome + ", endereco="
        + endereco + ", data=" + data + ", lista=" + lista + "]";
  }

}
