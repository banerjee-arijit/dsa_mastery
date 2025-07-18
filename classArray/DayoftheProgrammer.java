package classArray;

public class DayoftheProgrammer {
    public static String dayOfProgrammer(int year) {
        if (year == 1918) {
            return "26.09.1918";
        }
        boolean isLeapYear;
         if (year < 1918) {
            isLeapYear = (year % 4 == 0);
        } else {
            isLeapYear = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
        }
        String day = isLeapYear ? "12" : "13";

        return day + ".09." + year;

    }

    public static void main(String[] args) {
        int year = 1800;
        System.out.println(dayOfProgrammer(year));
    }

}
