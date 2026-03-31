package com.unifsa.academus;

public class AlunoGraduacao extends  Aluno {

    public AlunoGraduacao(Aluno a) {
        super(a);
    }
    public boolean verificarAprovacao() {
        return getNotaFinal() >=7;
    }
    public String exibirDados(Aluno a) {
        super.exibirDados(Aluno a);
        return "\n=========== DADOS DO ALUNO DE GRADUAÇÂO ===========" +
                "Tipo: Graduação" +
                "Situação: " + (verificarAprovacao() ? "APROVADO" : "REPROVADO");
    }
}
