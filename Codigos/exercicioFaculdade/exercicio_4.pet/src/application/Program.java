package application;

import utilities.Pet;

import java.util.Random;

public class Program {

    public static void main(String[] args) {

        Random random = new Random();

        int numero = random.nextInt(101);

        Pet pet = new Pet();
        pet.fome = numero;

        pet.alimentarPet(pet.fome);
        System.out.println("Número aleatorio gerado pra testar; " + numero);

    }
}