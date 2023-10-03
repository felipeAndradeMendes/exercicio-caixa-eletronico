package com.trybe.acc.java.caixaeletronico;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Testes dos métodos da classe Transação")
class TransacaoTest {


  @Test
  @DisplayName("1 - Testa o método construtor da classe Transação.")
  void construtorTest() {
    Transacao transacao = new Transacao(42, "saque");

    assertEquals(42, transacao.getQuantia());
    assertEquals("saque", transacao.descricao);
  }


  @Test
  @DisplayName("2 - Testa o método Getter do atributo quantia.")
  void getQuantiaTest() {
    Transacao transacao = new Transacao(42, "saque");
    assertEquals(42, transacao.getQuantia());
  }

  @Test
  @DisplayName("3 - Testa o método retornar resumo transação.")
  void retornarResumoTransacaoTest() {
    Transacao transacao = new Transacao(42, "saque");
    String result = String.format("%s, 42, saque", transacao.retornarInstante());
    assertEquals(result, transacao.retornarResumoTransacao());

  }

  @Test
  @DisplayName("4 - Testa o método instante está gerando o instante corretamente.")
  void retornarInstanteTest() {
    Transacao transacao = new Transacao(42, "saque");
    DateTimeFormatter instanteFormater = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    LocalDateTime instante = LocalDateTime.now();

    assertEquals(instanteFormater.format(instante), transacao.retornarInstante());

  }

}
