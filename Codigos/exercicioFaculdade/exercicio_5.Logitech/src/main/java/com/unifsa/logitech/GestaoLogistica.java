package com.unifsa.logitech;

import java.util.Scanner;

public class GestaoLogistica {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // Exemplo de como eles devem começar:
        
        Motorista mot1 = new Motorista();
        mot1.nome = "Joaquim";
        mot1.cnh = "123456-A";

        Veiculo caminhao = new Veiculo();
        caminhao.modelo = "Volvo FH";
        caminhao.capacidadeCarga = 15000.0;
        caminhao.condutor = mot1; // Atribuindo o objeto motorista ao veículo
        caminhao.autonomiaKmPorLitro = 10;

        Carga carga = new Carga();
        carga.descricao = "Batata";
        carga.peso = 1000;

        Rota fortal = new Rota();
        fortal.destino = "Fortaleza";
        fortal.origem = "Terehell";
        fortal.distanciaKm = 200;
        fortal.precoCombustivel = 6.30;
        fortal.calcularCustoViagem(fortal.distanciaKm, caminhao.autonomiaKmPorLitro, fortal.precoCombustivel);
        fortal.iniciarViagem(caminhao, carga, mot1);

        System.out.println(fortal.gerarManifesto(caminhao, carga, mot1, fortal));



    }
}
