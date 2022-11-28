package Lesson10;

public class GenericModule<T,S> {

    // Task 1: створити статичний вкладений клас-контейнер, який дозволяє зберігати будь-які об’єкти разом із джерелом цих даних
    public static class SaveObject<T> {
        private T obj;

        public T getObj() {
            return obj;
        }

        public void setObj(T obj) {
            this.obj = obj;
        }
    }


    /* Task 2: створити статичний вкладений клас-контейнер, який дозволяє зберігати фактичне значення разом із можливими
     мінімальним і максимальним значеннями. Це особлива форма трійки. Усі три значення мають загальний тип, який має
     бути підкласом Number */
    public static class SaveAverageMinMaxValue<Number extends Comparable<Number>> {
        private Number averageValue;
        private Number minValue;
        private Number maxValue;

        public SaveAverageMinMaxValue(Number midValue, Number minValue, Number maxValue) {
            this.averageValue = midValue;
            this.minValue = minValue;
            this.maxValue = maxValue;
        }

        public SaveAverageMinMaxValue() {
        }

        public Number getAverageValue() {
            return averageValue;
        }

        public Number getMinValue() {
            return minValue;
        }

        public Number getMaxValue() {
            return maxValue;
        }

        public String compareNumbers(Number num1, Number num2, Number num3) {
            if (((num1.compareTo(num2)) > 0 && (num2.compareTo(num3)) > 0)) {
                this.maxValue = num1;
                this.averageValue = num2;
                this.minValue = num3;
            } else if ((num2.compareTo(num1)) > 0  && (num1.compareTo(num3)) > 0) {
                this.maxValue = num2;
                this.averageValue = num1;
                this.minValue = num3;
            } else if ((num3.compareTo(num2)) > 0 && (num2.compareTo(num1)) > 0) {
                this.maxValue = num3;
                this.averageValue = num2;
                this.minValue = num1;
            } else if ((num1.compareTo(num3)) > 0 && (num3.compareTo(num2)) > 0) {
                this.maxValue = num1;
                this.averageValue = num3;
                this.minValue = num2;
            } else if ((num2.compareTo(num3)) > 0 && (num3.compareTo(num1)) > 0) {
                this.maxValue = num2;
                this.averageValue = num3;
                this.minValue = num1;
            } else {
                this.maxValue = num3;
                this.averageValue = num1;
                this.minValue = num2;
            }
            return ("Max value: " + this.maxValue + ". Average value: " + this.averageValue +
                                ". Min value: " + this.minValue);
        }
    }


    /* Task 3: створити вкладений інтерфейс який оголошує типовий контракт конвертера. Він працює з двома незалежними загальними
    типами.  Він визначає метод перетворення, який приймає один параметр одного типу та повертає перетворений результат
    іншого типу */
    public interface ConverterInterface<T, S> {
        public S toConvert(T value1);
    }

    public static class ConverterClass<T, S> implements ConverterInterface<T, S> {
        private T value1;

        public T getValue1() {
            return value1;
        }

        public void setValue1(T value1) {
            this.value1 = value1;
        }

        @Override
        public S toConvert(T value1) {
            return (S) value1;
        }
    }


        /* Task 4: cтворити статичний вкладений клас-контейнер, який відстежує лише максимальне значення. Він працює з
        порівнюваними об'єктами і дозволяє вводити нові значення. Щоразу, коли ви вводите значення, воно зберігається, лише
        якщо нове значення більше ніж поточний макс. (Створити конструктор, методи put, getMax) */
    public static class MaxValue<T extends Comparable<T>> {
        private T maxValue;

        public MaxValue(T maxValue) {
            this.maxValue = maxValue;
        }

        public T getMaxValue() {
            return maxValue;
        }

        public void setMaxValue(T maxValue) {
            this.maxValue = maxValue;
        }

        public T putMaxValue(T valueToCompare) {
            if ((this.maxValue.compareTo(valueToCompare)) < 0) {
                this.maxValue = valueToCompare;
            }
            return this.maxValue;
        }
    }
}