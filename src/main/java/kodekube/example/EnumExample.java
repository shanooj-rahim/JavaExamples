package kodekube.example;

public class EnumExample {

    public enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {

        Day day = Day.SUNDAY;

        switch (day) {
            case MONDAY:
                System.out.println("Monday is a working day");
                break;
            case TUESDAY:
                System.out.println("Tuesday is a working day");
                break;
            case WEDNESDAY:
                System.out.println("Wednesday is a working day");
                break;
            case THURSDAY:
                System.out.println("Thursday is a working day");
                break;
            case FRIDAY:
                System.out.println("Friday is a working day");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Saturday and Sunday are holidays");
                break;
        }

        for (Day d : Day.values()) {
            System.out.println(d);
        }
    }
}
