package com.unifsa.academus;

public class Aluno {
    private String nome;
    private int matricula;
    private double notaFinal;

    public Aluno(Aluno a) {

        if (a.nome == null ) {
            System.out.println("Nome inválido! Será definido valor padrão.");
            this.nome = "Aluno Desconhecido";
        } else {
            this.nome = a.nome;
        }

        this.matricula = a.matricula;

        if (a.notaFinal < 0 || a.notaFinal > 10) {
            System.out.println("Nota inválida! Será definido valor padrão (0.0).");
            this.notaFinal = 0.0;
        } else {
            this.notaFinal = a.notaFinal;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNota(double nota) {
        if (nota < 0 || nota > 10) {
            System.out.println("Nota inválida! Insira um valor entre 0 e 10.");
        } else {
            this.notaFinal = nota;
        }
    }


    public String exibirDados(Aluno a) {
        System.out.println("\n=========== DADOS DO ALUNO ===========");

        return "Dados do aluno\n" +
                "Nomw: " + a.nome +
                "Matricula: " + a.matricula +
                "Nota Final: " + a.notaFinal +
                "\n=========== FIM DO RELATÓRIO ===========";
    }

    public void ajustarNota(double novaNota) {
        setNota(novaNota);
    }
}