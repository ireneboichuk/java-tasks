package Lesson8.Task1;

public class Musician implements Drum, Piano, Violin {
    private String musicianName;
    private static String printAddName = "Введіть ім'я музиканта, який буде грати сьогодні:";
    private static String printMelodies = "Введіть номер мелодії, яка буде виконуватись (з доступних: №1 та №2)";

    public String getMusicianName() {
        return musicianName;
    }

    public void setMusicianName(String name) {
        this.musicianName = name;
    }

    public static void print1 () {
        System.out.println(printAddName);
    }
    public static void print2 () {
        System.out.println(printMelodies);
    }

    @Override
    public void melody1() {
        System.out.println (
            Drum.drumPlaying() + "\n" +
            Drum.drumPlaying() + "\n" +
            Piano.pianoPlaying() + "\n" +
            Violin.violinPlaying() + "\n" +
            Drum.drumPlaying()
                );
    }

    @Override
    public void melody2() {
        System.out.println (
                Violin.violinPlaying() + "\n" +
                Drum.drumPlaying() + "\n" +
                Violin.violinPlaying() + "\n" +
                Drum.drumPlaying() + "\n" +
                Piano.pianoPlaying() + "\n" +
                Drum.drumPlaying() + "\n" +
                Drum.drumPlaying()
        );
    }
}
