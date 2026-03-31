
package com.unifsa.logitech;

public class Rota {
    public String origem;
    public String destino;
    public double distanciaKm;
    public double precoCombustivel;

    public void iniciarViagem(Veiculo v, Carga c, Motorista m) {
        System.out.println("--- Iniciando Verificação de Viagem ---");

        if (v.capacidadeCarga < c.peso) {

            System.out.println("A viagem NÃO É POSSIVEL limite de peso EXCEDIDO!");
            System.out.println("Diminua o peso para nova verificação");

        } else {
            if (v.emManutencao == true) {
                System.out.println("Viagem NÃO AUTORIZADA !");
                System.out.println("O veiculo está em MANUTENÇAO");
                System.out.println("Espere op veiculo ficar pronto");

            } else {
                if (v.condutor == null || m.cnh == null){
                    System.out.println("A viagem NÃO PODE SER INICIADA!");
                    System.out.println("Não foi designado um motorista para esse veiculo");

                } else {
                    System.out.println("Tudo está nos conformes!");
                    System.out.println("Pode iniciar a viagem assim que desejar");
                }

            }

        }

    }

    public double calcularCustoViagem(double distanciaKm, double autonomiaKmPorLitro, double precoCombustivel) {
        double custoViagem = (distanciaKm / autonomiaKmPorLitro) * precoCombustivel;


        return custoViagem;
    }

    public String gerarManifesto(Veiculo v, Carga c, Motorista m, Rota r) {
        System.out.println("\n========== MANIFESTO DE CARGA ==========");

        return "Dados da rota\n" +
                "Origem :" + r.origem + "\n" +
                "Destino : " + r.destino + "\n" +
                "Distancia : " + r.distanciaKm + " Km\n" +
                "Preço do combustivel : R$ " + r.precoCombustivel + "\n" +
                "Peso : " + c.peso + " Kg\n" +
                "Nome da carga : " + c.descricao + "\n" +
                "\n========== FIM DO RELATORIO ==========";
    }

}
