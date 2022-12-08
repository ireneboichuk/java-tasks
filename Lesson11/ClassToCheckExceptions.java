package Lesson11;

public class ClassToCheckExceptions {

    //Task 1:

    public enum WeekDays {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static class CheckValueFromTask1 {
        private String day;
        private static final String print = "Введіть значення дня тижня: ";

        public CheckValueFromTask1(String day) {
            this.day = day;
        }

        public String getDay() {
            return day;
        }

        public void setDay(String str) {
            this.day = str;
        }

        public static void print() {
            System.out.println(print);
        }

        public void checkDay() throws InvalidValueException {
            try {
                for (WeekDays weekDays : WeekDays.values()) {
                    if (weekDays.name().equals(day)) {
                        System.out.println("Ваше значення прийнято!");
                    } else {
                        throw new InvalidValueException("Значення не відповідає вимогам!");
                    }
                }
            } catch (InvalidValueException e) {
                throw new InvalidValueException("Будь ласка, перевірте введене значення!");
            } finally {
                System.out.println("Finally block");
            }
        }
    }


    // Task 2:
    public static class CheckValueFromTask2 {
        private Integer value;
        private static final String print = "Введіть значення години (від 1 до 12): ";

        public void setValue(Integer value) {
            this.value = value;
        }

        public static void print () {
            System.out.println(print);
        }

        public void checkValue() throws InvalidValueException {
            if (12 >= this.value && this.value > 0) {
                System.out.println("Hour value is valid");
            } else {
                throw new InvalidValueException("Hour value is not valid!");
            }
        }
    }


    // Task 3:

    public static class CheckValueFromTask3 {
        private int value;
        private static final String print = "Введіть значення дня року (від 1 до 365): ";


        public void setValue(int value) {
            this.value = value;
        }

        public static void print () {
            System.out.println(print);
        }

        public void checkValue() throws InvalidValueException {
            if (366 > this.value && this.value > 0) {
                System.out.println("Day number is valid");
            } else {
                throw new InvalidValueException("Day number is not valid!");
            }
        }
    }
}
