package kodekube.example;

public class EnumExampleWithValues {
    public enum Day {
        MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4),
        FRIDAY(5), SATURDAY(6), SUNDAY(7);

        private int value;

        Day(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public static void main(String[] args) {
        Day day = Day.MONDAY;
        /*
         * This method returns the position in its enum declaration.
         * The initial constant is assigned an ordinal of zero.
         * */
        int ordinal = day.ordinal();

        /*
         * This method returns the enum constant of the specified enum type
         *  with the specified name.
         * */
        Day tuesday = Day.valueOf("TUESDAY");
        /*
         * This method returns the enum constants.
         * */
        Day[] values = Day.values();

    }
}
