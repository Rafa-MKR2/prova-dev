package br.com.codarts.model;

import org.springframework.format.annotation.NumberFormat;

import javax.validation.constraints.*;

public class Cliente {


    @NotNull
    @Size(max=40)
    @NotEmpty
    private String  nome;

    @NotNull
    @NotEmpty
    @Pattern(regexp="(?<=\\D|^)(\\d{2}\\.?\\d{3}\\.?\\d{3}\\/?\\d{4}-?\\d{2}|\\d{3}\\.?\\d{3}\\.?\\d{3}-?\\d{2})(?=\\D|$)",message = "Formato do CPF estar inválido")
    private String cpf ;
    @NotNull
    @Min(value = 18,  message = "Idade deve ser maior que 18")
    private  int idade;
    @NotNull
    @Size(max=2, min = 2, message = "UF formato inválido")
    private  String uf;

    @NotNull
    @Min(value = 1, message = "Salario deve ser valor positivo")
    private  long salario;


    public String getNome() {
        return nome;
    }

    public void setNome( String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public long getSalario() {
        return salario;
    }

    public void setSalario(long salario) {
        this.salario = salario;
    }
}
