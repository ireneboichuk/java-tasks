package Lesson8.Task1;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        Musician.print1();
        String musicianName = sc.next();
        Musician musician1 = new Musician();
        musician1.setMusicianName(musicianName);

        Musician.print2();
        int a = sc.nextInt();
        switch (a) {
            case 1:
                musician1.melody1();
                break;
            case 2:
                musician1.melody2();
                break;
            default:
                out.println("Введене значення не відповідає вимогам");
        }
    }
}
