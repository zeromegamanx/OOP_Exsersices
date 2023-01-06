package MyTime;

import MyTime.MyTime;

public class TestMyTime {
    public static void main(String[] args) {
        MyTime myTime1 = new MyTime();
        System.out.println("My default time is: " + myTime1);

        MyTime myTime2 = new MyTime(14, 4, 5);
        System.out.println("My first time is: " + myTime2);
        System.out.println("Next second of first time is: " + myTime2.nextSecond());
        System.out.println("Next minute of first time is: " + myTime2.nextMinute());
        System.out.println("Next hour of first time is: " + myTime2.nextHour());
        System.out.println("Previous second of first time is: " + myTime2.previousSecond());
        System.out.println("Previous minute of first time is: " + myTime2.previousMinute());
        System.out.println("Previous hour of first time is: " + myTime2.previousHour());
    }
}
