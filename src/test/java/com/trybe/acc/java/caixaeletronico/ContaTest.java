package com.trybe.acc.java.caixaeletronico;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Teste da classe Conta")
class ContaTest {

  @Test
  @DisplayName("5 - Testa o construtor da classe conta.")
  void construtorTest() {
    PessoaCliente pessoaCliente = new PessoaCliente("Felipe", "000000000", "senha123");
    Banco banco = new Banco();
    Conta conta = new Conta("poupança", pessoaCliente, banco);

    assertEquals("Felipe", pessoaCliente.getNomeCompleto());
    assertEquals("000000000", pessoaCliente.getCpf());
    assertEquals("senha123", pessoaCliente.getSenha());

  }

  @Test
  @DisplayName("6 - Testa o método adicionar transação e retornar saldo da conta.")
  void adicionarTransacaoTestRetornarSaldoTest() {
    fail("Não implementado");

  }

  @Test
  @DisplayName("7 - Testa o método retornar resumo está retornando uma string com os valores corretamente.")
  void retornarResumoContaTest() {
    fail("Não implementado");

  }

  @Test
  @DisplayName("8 - Testa o método retornar extrato está imprimindo os valores corretamente.")
  void retornarExtratoTest() {
    fail("Não implementado");

  }

  @Test
  @DisplayName("9 - Testa o método Getter do atributo idConta está retornando.")
  void getIdContaTest() {
    fail("Não implementado");

  }

  @Test
  @DisplayName("10 - Testa o método método Getter do atributo pessoaCliente está retornando.")
  void getPessoaClienteTest() {
    fail("Não implementado");
  }

}
