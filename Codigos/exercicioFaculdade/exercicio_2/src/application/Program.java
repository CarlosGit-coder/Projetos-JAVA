package application;

import util.Video;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Video video1 = new Video();

        System.out.println("Insira o titulo");

        video1.title = sc.nextLine();

        System.out.println("Insira a duração");

        video1.duration = sc.nextDouble();

        video1.runStatus = true;

        Video video2 = new Video();

        System.out.println("Insira o titulo");

        sc.nextLine();

        video2.title = sc.nextLine();

        System.out.println("Insira a duração");

        video2.duration = sc.nextDouble();

        video2.runStatus = false;

        System.out.println();

        video1.modeStatus(video1.runStatus, video1.duration, video1.title);

        System.out.println();
        System.out.println("-----------------------------------------------");

        video2.modeStatus(video2.runStatus, video2.duration, video2.title);

        System.out.println(video2);

    }
}
