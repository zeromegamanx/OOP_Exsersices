package MyTime;

public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime(){
        hour = 0;
        minute = 0;
        second = 0;
    }

    public MyTime(int hour, int minute, int second){
        setTime(hour, minute, second);
    }

    public void setTime(int hour, int minute, int second){
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour <= 23){
            this.hour = hour;
        } else {
            throw new IllegalArgumentException("Invalid hour!");
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 59){
            this.minute = minute;
        } else {
            throw new IllegalArgumentException("Invalid minute!");
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second >= 0 && second <= 59){
            this.second = second;
        } else {
            throw new IllegalArgumentException("Invalid second!");
        }
    }

    @Override
    public String toString() {
        //Return the description of the format "hh:mm:ss" with leading zeros
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public MyTime nextSecond() {
        second++;
        if (second == 60){
            second = 0;
            minute++;
        }
        if (minute == 60) {
            minute =0;
            ++ hour;
        }
        if (hour == 24) {
            hour = 0;
        }
        return this;
    }

    public MyTime previousSecond() {
        if (hour == 0 && minute == 0 && second == 0) {
            hour = 23;
            minute = 59;
            second = 59;
        }
        if (minute == 0 && second == 0) {
            hour--;
            minute = 59;
            second = 59;
        }
        if (second == 0) {
            minute--;
            second = 59;
        }
        second-- ;
        return this;
    }

    public MyTime nextMinute(){
        minute++;
        if (minute == 60) {
            minute =0;
            ++ hour;
        }
        if (hour == 24) {
            hour = 0;
        }
        return this;
    }

    public MyTime previousMinute(){
        if (hour == 0 && minute == 0) {
            hour = 23;
            minute = 59;
        }
        if (minute == 0) {
            hour--;
            minute = 59;
        }
        minute-- ;
        return this;
    }

    public MyTime nextHour(){
        hour++;
        if (hour == 23) {
            hour = 0;
        }
        return this;
    }

    public MyTime previousHour(){
        if (hour == 0){
            hour = 23;
        }
        hour--;
        return this;
    }
}
