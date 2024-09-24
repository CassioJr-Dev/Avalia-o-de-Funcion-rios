package src.main.java.empresa.avaliacao;

import java.time.LocalDate;

public class Avaliacao {
    private double nota;
    private LocalDate data;
    private String nivelAvaliacao;

    public Avaliacao(double nota, LocalDate data) {
        setNota(nota);
        this.data = data;
        this.nivelAvaliacao = determinarNivelAvaliacao(this.nota);
    }

    @SuppressWarnings("resource")
    public void setNota(double nota) {
        while (nota < 0 || nota > 10) {
            System.out.println("Nota inválida! Digite uma nota entre 0 e 10.");
            nota = new java.util.Scanner(System.in).nextDouble();
        }
        this.nota = nota;
        this.nivelAvaliacao = determinarNivelAvaliacao(this.nota);
    }

    private String determinarNivelAvaliacao(double nota) {
        switch ((int) nota) {
            case 9:
            case 10:
                return "Excelente";
            case 7:
            case 8:
                return "Bom";
            case 5:
            case 6:
                return "Regular";
            default:
                return "Insatisfatório";
        }
    }

    public void exibirAvaliacao() {
        System.out.println("Nota: " + this.nota + " | Data: " + this.data + " | Nível: " + this.nivelAvaliacao);
    }
}
