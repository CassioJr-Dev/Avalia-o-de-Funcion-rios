package src.main.java.empresa.funcionario;

import java.util.ArrayList;
import java.util.List;

import src.main.java.empresa.avaliacao.Avaliacao;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;
    private List<Avaliacao> avaliacoes;

    // Construtor completo
    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.avaliacoes = new ArrayList<>();
    }

    // Construtor apenas com nome e cargo, salário padrão
    public Funcionario(String nome, String cargo) {
        this(nome, cargo, 1000.00); // Definindo salário padrão de 1000.00
    }

    // Método para adicionar uma avaliação
    public void adicionarAvaliacao(Avaliacao avaliacao) {
        this.avaliacoes.add(avaliacao);
    }

    // Método para exibir todas as avaliações do funcionário
    public void exibirAvaliacoes() {
        System.out.println("Avaliações de " + this.nome + ":");
        for (Avaliacao avaliacao : avaliacoes) {
            avaliacao.exibirAvaliacao();
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
