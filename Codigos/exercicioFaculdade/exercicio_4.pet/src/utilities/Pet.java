package utilities;

public class Pet {
    public int fome;

    public float alimentarPet (int fomw) {
        if (this.fome >= 10) {
            fome -= 10;
            System.out.println("Seu animal está se alimentando...");
            System.out.println("A fome do seu animal é: " + fome);

        } else {
            System.out.println("Seu animal não está com fome suficiente para se alimentar");
            System.out.println("A fome do seu animal é: " + fome);
        }
        return fome;
    }
}
