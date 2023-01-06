
public class DateUtil {
	public static String[] strMonths = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov",
			"Dec" };

	public static int[] daysInMonths = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

//	Returns true if the given year is a leap year

	public static boolean isLeapYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			return true;
		}
		return false;
	}

	public static boolean isValidDate(int year, int month, int day) {
		if (year < 1 || year > 9999){
			return false;
		}
		if (month < 1 || month > 12){
			return false;
		}
		if (isLeapYear(year)) {
			if (month == 2) {
				if (day < 1 || day > daysInMonths[1] + 1)
					return false;
				return true;
			}
			if (day < 1 || day > daysInMonths[month - 1])
				return false;
		}
		if (day < 1 || day > daysInMonths[month - 1]) {
			return false;
		}
		return true;
	}

	public static int getDayOfWeek(int year, int month, int day) {
		int[] digitOfCentury = { 4, 2, 0, 6 };
		int[] digitOfMonthNonLeapYear = { 0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5 };
		int[] digitOfMonthLeapYear = { 6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5 };
		int dayOfWeek = 0;
		if (isLeapYear(year)) {
			dayOfWeek = (digitOfCentury[((year - 100) / 100) % 4] + (year % 100) + (year % 100) / 4
					+ digitOfMonthLeapYear[month - 1] + day) % 7;
		} else {
			dayOfWeek = (digitOfCentury[((year - 100) / 100) % 4] + (year % 100) + (year % 100) / 4
					+ digitOfMonthNonLeapYear[month - 1] + day) % 7;
		}

		return dayOfWeek;
	}

	public static String printDate(int year, int month, int day) {
		String[] daysOfWeek = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
		String a = daysOfWeek[getDayOfWeek(year, month, day) - 1];

		return a + " " + day + " " + strMonths[month - 1] + " " + year;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isLeapYear(1900)); // false
		System.out.println(isLeapYear(2000)); // true
		System.out.println(isLeapYear(2011)); // false
		System.out.println(isLeapYear(2012)); // true
		System.out.println();
		System.out.println(isValidDate(2012, 2, 29)); // true
		System.out.println(isValidDate(2011, 2, 29)); // false
		System.out.println(isValidDate(2099, 12, 31)); // true
		System.out.println(isValidDate(2099, 12, 32)); // false
		System.out.println();
		System.out.println(getDayOfWeek(1982, 4, 24)); // 6 : Sat
		System.out.println(getDayOfWeek(2000, 1, 1)); // 6 : Sat
		System.out.println(getDayOfWeek(2054, 6, 19)); // 5 : Fri
		System.out.println(getDayOfWeek(2012, 2, 17)); // 5 : Fri
		System.out.println();
		System.out.println(printDate(2012, 2, 14)); // Tuesday 14 Feb 2012
	}

}
