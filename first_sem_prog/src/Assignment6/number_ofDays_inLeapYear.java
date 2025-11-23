package Assignment6;

public class number_ofDays_inLeapYear {
    public static void main(String[] args) {

        for (int year = 2000; year <= 2020; year++) {
            System.out.println(year + " has " + numberOfDaysInAYear(year) + " days");
        }
    }

    public static int numberOfDaysInAYear(int year) {
        if (year % 4 != 0) {
            return 365;
        } else if (year % 100 != 0) {
            return 366;
        } else if (year % 400 != 0) {
            return 365;
        } else {
            return 366;
        }
    }
}



