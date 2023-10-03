package com.trybe.acc.java.caixaeletronico;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transacao {
  private double quantia;
  private String instante;
  public String descricao;

  /**
   * Construtor.
   *
   * @param quantia - valor da transação.
   * @param descricao - tipo de transação.
   */
  public Transacao(double quantia, String descricao) {
    this.quantia = quantia;
    this.instante = retornarInstante();
    this.descricao = descricao;
  }

  public double getQuantia() {
    return quantia;
  }

  /**
   * Resumo da transação.
   *
   * @return - string com data/hora, valor e descrição da transação.
   */
  public String retornarResumoTransacao() {
    if (quantia >= 0) {
      return String.format("%s, %.0f, %s", retornarInstante(), getQuantia(), this.descricao);
    } else {
      return "A transação não foi feita por falta de valor maior ou igual a zero";
    }
  }

  /**
   * Gera data da transação.
   *
   * @return - string com data e hora formatadas para padrão br.
   */
  public String retornarInstante() {
    DateTimeFormatter formatoDeData = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    LocalDateTime instanteAgora = LocalDateTime.now();
    return instanteAgora.format(formatoDeData);
  }
}

