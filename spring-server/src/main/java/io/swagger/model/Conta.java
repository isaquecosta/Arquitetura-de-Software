package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Conta
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-09-09T16:43:29.646Z")




public class Conta   {
  @JsonProperty("numConta")
  private Integer numConta = null;

  @JsonProperty("agencia")
  private Integer agencia = null;

  @JsonProperty("titular")
  private String titular = null;

  @JsonProperty("cpf")
  private Long cpf = null;

  @JsonProperty("saldo")
  private BigDecimal saldo = null;

  public Conta numConta(Integer numConta) {
    this.numConta = numConta;
    return this;
  }

  /**
   * Get numConta
   * @return numConta
  **/
  @ApiModelProperty(value = "")


  public Integer getNumConta() {
    return numConta;
  }

  public void setNumConta(Integer numConta) {
    this.numConta = numConta;
  }

  public Conta agencia(Integer agencia) {
    this.agencia = agencia;
    return this;
  }

  /**
   * Get agencia
   * @return agencia
  **/
  @ApiModelProperty(value = "")


  public Integer getAgencia() {
    return agencia;
  }

  public void setAgencia(Integer agencia) {
    this.agencia = agencia;
  }

  public Conta titular(String titular) {
    this.titular = titular;
    return this;
  }

  /**
   * Get titular
   * @return titular
  **/
  @ApiModelProperty(value = "")


  public String getTitular() {
    return titular;
  }

  public void setTitular(String titular) {
    this.titular = titular;
  }

  public Conta cpf(Long cpf) {
    this.cpf = cpf;
    return this;
  }

  /**
   * Get cpf
   * @return cpf
  **/
  @ApiModelProperty(value = "")


  public Long getCpf() {
    return cpf;
  }

  public void setCpf(Long cpf) {
    this.cpf = cpf;
  }

  public Conta saldo(BigDecimal saldo) {
    this.saldo = saldo;
    return this;
  }

  /**
   * Get saldo
   * @return saldo
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BigDecimal getSaldo() {
    return saldo;
  }

  public void setSaldo(BigDecimal saldo) {
    this.saldo = saldo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Conta conta = (Conta) o;
    return Objects.equals(this.numConta, conta.numConta) &&
        Objects.equals(this.agencia, conta.agencia) &&
        Objects.equals(this.titular, conta.titular) &&
        Objects.equals(this.cpf, conta.cpf) &&
        Objects.equals(this.saldo, conta.saldo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numConta, agencia, titular, cpf, saldo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Conta {\n");
    
    sb.append("    numConta: ").append(toIndentedString(numConta)).append("\n");
    sb.append("    agencia: ").append(toIndentedString(agencia)).append("\n");
    sb.append("    titular: ").append(toIndentedString(titular)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    saldo: ").append(toIndentedString(saldo)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

