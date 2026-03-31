package com.unifsa.academus;

public class AlunoPosGraduacao extends Aluno{

    public AlunoPosGraduacao(Aluno a) {
        super(a);
    }
    public boolean verificaraprovacao() {
        return getNotaFinal() >=6;
    }
    public void publicarArtigo() {
        System.out.println(getNome() + "publicou um artigo científico:");
    }
    public String exibirDados(Aluno a) {
        super.exibirDados(Aluno a);
        return "\n=========== DADOS DO ALUNO DE PÓS ===========" +
                "Tipo: Pós-Graduação" +
                "Situação: " + (verificaraprovacao() ? "APROVADO" : "REPROVADO");
    }
}
