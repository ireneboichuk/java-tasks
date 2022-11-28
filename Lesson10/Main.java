package Lesson10;

public class Main {
    public static void main(String[] args) {

        //Task 1:
        GenericModule.SaveObject<String> object1 = new GenericModule.SaveObject<>();
        object1.setObj("Трохи тексту");
        System.out.println(object1.getObj());

        GenericModule.SaveObject<Object> object2 = new GenericModule.SaveObject<>();
        object2.setObj(12345);
        System.out.println(object2.getObj());

        //Task 2:
        GenericModule.SaveAverageMinMaxValue object3 = new GenericModule.SaveAverageMinMaxValue<>();
        System.out.println(object3.compareNumbers(10, 40, 21));

        //Task 3:
        GenericModule.ConverterClass<String, Character> converter1 = new GenericModule.ConverterClass<>();
        String a = String.valueOf('a');
        System.out.println(converter1.toConvert(a));

        //Task 4:
        GenericModule.MaxValue<Integer> maxvalue1 = new GenericModule.MaxValue<>(3);
        maxvalue1.putMaxValue(10);
        maxvalue1.putMaxValue(30);
        maxvalue1.putMaxValue(2);
        System.out.println(maxvalue1.getMaxValue());

    }
}
