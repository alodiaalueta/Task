package Task122;

public class DateTask {
    private int day;
    private int month;
    private int year;

    public DateTask() {
        this(1, 1, 1);
    }

    public DateTask(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int setDay(int day) {
        if (day >= 1 && day <= 31) {
            this.day = day;
            return day;
        } else {
            return 0;
        }
    }

    public int setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
            return month;
        } else {
            return 0;
        }
    }

    public int setYear(int year) {
        if (year >= 1) {
            this.year = year;
            return year;
        } else {
            return 0;
        }
    }

    public String toString() {
        return String.format("%02d/%02d/%04d", day, month, year);
    }

    public boolean isLeapYear() {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}