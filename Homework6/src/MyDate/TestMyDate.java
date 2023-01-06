package MyDate;

import MyDate.MyDate;

public class TestMyDate {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(2012, 2, 28);
        System.out.println("Date 1 is: " + date1);
        System.out.println("Next day of date 2 is: " + date1.nextDay());
        System.out.println("Next month of date 2 is: " + date1.nextMonth());
        System.out.println("Next year of date 2 is: " + date1.nextYear());

        MyDate date2 = new MyDate(2012, 1, 2);
        System.out.println("Date 2 is: " + date2);
        System.out.println("Previous day of date 2 is: " + date2.previousDay());
        System.out.println("Previous month of date 2 is: " + date2.previousMonth());
        System.out.println("Previous year of date 2 is: " + date2.previousYear());

        MyDate date3 = new MyDate(2012, 14, 211);
        System.out.println("Date 3 is: " + date3);
    }
}
