package src.main.java.empresa.main;

import java.time.LocalDate;
import java.util.Scanner;

import src.main.java.empresa.avaliacao.Avaliacao;
import src.main.java.empresa.funcionario.Funcionario;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Coletando dados do funcionário
        System.out.println("Digite o nome do funcionário:");
        String nome = scanner.nextLine();

        System.out.println("Digite o cargo do funcionário:");
        String cargo = scanner.nextLine();

        System.out.println("Digite o salário do funcionário:");
        double salario = scanner.nextDouble();

        // Criando o funcionário
        Funcionario funcionario = new Funcionario(nome, cargo, salario);

        // Perguntando quantas avaliações o usuário deseja adicionar
        System.out.println("Quantas avaliações deseja adicionar?");
        int numAvaliacoes = scanner.nextInt();

        for (int i = 0; i < numAvaliacoes; i++) {
            System.out.println("\nAdicionando avaliação #" + (i + 1));

            // Coletando a nota
            System.out.println("Digite a nota (0-10):");
            double nota = scanner.nextDouble();

            // Coletando a data da avaliação
            System.out.println("Digite o ano da avaliação:");
            int ano = scanner.nextInt();

            System.out.println("Digite o mês da avaliação:");
            int mes = scanner.nextInt();

            System.out.println("Digite o dia da avaliação:");
            int dia = scanner.nextInt();

            // Criando a avaliação com a nota e data inseridas
            Avaliacao avaliacao = new Avaliacao(nota, LocalDate.of(ano, mes, dia));

            // Adicionando a avaliação ao funcionário
            funcionario.adicionarAvaliacao(avaliacao);
        }

        // Exibindo todas as avaliações do funcionário
        System.out.println("\nAvaliações do funcionário " + funcionario.getNome() + ":");
        funcionario.exibirAvaliacoes();

        scanner.close(); // Fechar o scanner
    }
}
