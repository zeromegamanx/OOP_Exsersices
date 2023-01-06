package MyDate;

public class MyDate {
    private int year;
    private int month;
    private int day;
    private static String[] months;
    private static String[] days;
    private static int[] dayInMonths;

    public MyDate(int year, int month, int day) {
        setDate(year, month, day);
    }

    public static boolean isLeapYear(int year) {
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        } else return false;
    }
    public static boolean isValidDate(int year, int month, int day) {
        if((year > 0 && year < 10000) && (month > 0 && month < 13)) {
            switch(month) {
                case 1: if (day > 0 && day < 32) {
                    return true;
                }
                    break;
                case 2: if ((isLeapYear(year) && day > 0 && day < 30)
                        || (!isLeapYear(year) && day > 0 && day < 29)) {
                    return true;
                }
                    break;
                case 3: if (day > 0 && day < 32) {
                    return true;
                }
                    break;
                case 4: if (day > 0 && day < 31) {
                    return true;
                }
                    break;
                case 5: if (day > 0 && day < 32) {
                    return true;
                }
                    break;
                case 6: if (day > 0 && day < 31) {
                    return true;
                }
                    break;
                case 7: if (day > 0 && day < 32) {
                    return true;
                }
                    break;
                case 8: if (day > 0 && day < 32) {
                    return true;
                }
                    break;
                case 9: if (day > 0 && day < 31) {
                    return true;
                }
                    break;
                case 10: if (day > 0 && day < 32) {
                    return true;
                }
                    break;
                case 11: if (day > 0 && day < 31) {
                    return true;
                }
                    break;
                case 12: if (day > 0 && day < 32) {
                    return true;
                }
                    break;
            }
        } else {
            return false;
        }
        return false;
    }

    public static int getDayOfWeek(int year, int month, int day) {
        //Gauss's algorithm for determining the day of the week
        if((day += month) < 3) {
            year--;
        } else {
            year = year - 2;
        }
        return (23 * month / 9 + day + 4 + year/4 - year/100 + year/400) % 7;
    }

    public void setDate(int year, int month, int day) {
        try {
            if(isValidDate(year, month, day)) {
                this.year = year;
                this.month = month;
                this.day = day;
            }
        } catch(IllegalArgumentException e) {
            System.out.println("Invalid year, month, or day!");
        }
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        try {
            if(year > 0 && year < 10000) {
                this.year = year;
            }
        } catch(IllegalArgumentException e) {
            System.out.println("Invalid year!");
        }
    }

    public void setMonth(int month) {
        try {
            if(month > 0 && month < 13) {
                this.month = month;
            }
        } catch(IllegalArgumentException e) {
            System.out.println("Invalid month!");
        }
    }
    public void setDay(int day) {
        int dayMax = 31;
        switch(this.getMonth()) {
            case 1: dayMax = 31;
                break;
            case 2: if(isLeapYear(this.year)) dayMax = 29; else dayMax = 28;
                break;
            case 3: dayMax = 31;
                break;
            case 4: dayMax = 30;
                break;
            case 5: dayMax = 31;
                break;
            case 6: dayMax = 30;
                break;
            case 7: dayMax = 31;
                break;
            case 8: dayMax = 31;
                break;
            case 9: dayMax = 30;
                break;
            case 10: dayMax = 31;
                break;
            case 11: dayMax = 30;
                break;
            case 12: dayMax = 31;
                break;
        }
        try {
            if(day > 0 && day <= dayMax) {
                this.day = day;
            }
        } catch(IllegalArgumentException e) {
            System.out.println("Invalid month!");
        }
    }

    public String toString() {
        if(isValidDate(this.getYear(),this.getMonth(),this.getDay())) {
            String pre = "";

            switch(getDayOfWeek(this.year,this.month,this.day)) {
                case 0: pre = "Sun";
                    break;
                case 1: pre = "Mon";
                    break;
                case 2: pre = "Tues";
                    break;
                case 3: pre = "Wednes";
                    break;
                case 4: pre = "Thurs";
                    break;
                case 5: pre = "Fri";
                    break;
                case 6: pre = "Satur";
                    break;
            }
            String month = "";
            switch(this.getMonth()) {
                case 1: month = "Jan";
                    break;
                case 2: month = "Feb";
                    break;
                case 3: month = "Mar";
                    break;
                case 4: month = "Apr";
                    break;
                case 5: month = "May";
                    break;
                case 6: month = "Jun";
                    break;
                case 7: month = "Jul";
                    break;
                case 8: month = "Aug";
                    break;
                case 9: month = "Sep";
                    break;
                case 10: month = "Oct";
                    break;
                case 11: month = "Nov";
                    break;
                case 12: month = "Dec";
                    break;
            }
            return pre + "day " + this.day + " " + month + " " + this.year;
        } else {
            return "Invalid Date!";
        }
    }

    public int dayMax() {
        int dayMax = 31;
        switch(this.getMonth()) {
            case 1: dayMax = 31;
                break;
            case 2: if(isLeapYear(this.year)) dayMax = 29; else dayMax = 28;
                break;
            case 3: dayMax = 30;
                break;
            case 4: dayMax = 30;
                break;
            case 5: dayMax = 31;
                break;
            case 6: dayMax = 30;
                break;
            case 7: dayMax = 31;
                break;
            case 8: dayMax = 31;
                break;
            case 9: dayMax = 30;
                break;
            case 10: dayMax = 31;
                break;
            case 11: dayMax = 30;
                break;
            case 12: dayMax = 31;
                break;
        }
        return dayMax;
    }

    public MyDate nextDay() {
        if(this.getDay() != this.dayMax()) {
            day++;
        } else {
            this.day = 1;
            if(this.month == 12) {
                this.month = 1;
                year++;
            } else {
                month++;
            }
        }
        return this;
    }

    public MyDate nextMonth() {
        int tempMonth = this.getMonth() + 1;
        if (this.getMonth() == 12) {
            tempMonth = 1;
        }
        MyDate temp = new MyDate(this.getYear(),tempMonth,1);
        if (this.dayMax() > temp.dayMax()) {
            this.setDay(this.dayMax());
        }
        if (this.month == 12) {
            this.setMonth(1);
            year++;
        } else {
            month++;
        }
        return this;
    }

    public MyDate nextYear() {
        try {
            if (this.year<10000) {
                year++;
                return this;
            }
            if (isLeapYear(this.getYear())) {
                if((this.getMonth() == 2) && (this.getDay() == 29)) {
                    this.setDay(28);
                }
            }
        } catch (IllegalStateException e) {
            System.out.println("Year out of range!");
        }
        return this;
    }

    public MyDate previousDay() {
        if (this.day != 1) {
            day--;
        } else {
            if (this.getMonth() != 1) {
                this.day = this.dayMax();
                month--;
            } else {
                this.day = 31;
                this.month = 12;
                year--;
            }
        }
        return this;
    }

    public MyDate previousMonth() {
        int tempMonth = this.getMonth() - 1;
        if (this.getMonth() == 1) {
            tempMonth = 12;
        }
        MyDate temp = new MyDate(this.getYear(),tempMonth,1);
        if(this.dayMax() > temp.dayMax()) {
            this.setDay(this.dayMax());
        }
        if(this.getMonth() != 1) {
            month--;
        } else {
            month = 12;
        }
        return this;
    }

    public MyDate previousYear() {
        try {
            if(this.year > 0) {
                year--;
            }
            if (isLeapYear(this.getYear())) {
                if ((this.getMonth() == 2) && (this.getDay() == 29)) {
                    this.setDay(28);
                }
            }
        } catch (IllegalStateException e) {
            System.out.println("Year out of range!");
        }
        return this;
    }
}
