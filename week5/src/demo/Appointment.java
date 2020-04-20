package demo;

public class Appointment {
    private int year;
    private int month;
    private int day;
    private int startTime;
    private int endTime;

    //2
    public Appointment(){

    }
    //2
    public Appointment(int year, int month, int day, int startTime, int endTime){
        // this: 4
        this.year = year;
        this.month = month;
        this.day = day;
        this.startTime = startTime;
        this.endTime = endTime;
    }
    //1
    public String toString(){
        return "year: "+year+"month: "+month +"day: "+day+ "startTime: "+startTime+"endTime: "+endTime;
    }
    //6
    private boolean endTimePre(int startTime, int endTime){
        return (endTime > startTime);
    }
    //1
    public void setStartTime(int startTime){
        if(validateTime(startTime)){
            if(endTimePre(startTime,this.endTime)){
                this.startTime = startTime;
            }
        }
    }
    //1
    public void setEndTime(int endTime){
        if(validateTime(endTime)){
            if(endTimePre(this.startTime,endTime)){
                this.endTime = endTime;
            }
        }
    }
    //5
    private boolean validateYear(int year){
        if (year < 1000 || year > 9999) {
            return false;
        }
        return true;
    }
    //1
    public void setYear(int year){
        if(validateYear(year)){
            this.year = year;
        }
    }
    //5
    private boolean validateMonthAndDay(int month,int day){
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12 ) {
            // Months having 31 days
            if (day > 31) {
                return false;
            }
        }
        else if (month == 4 || month == 6 || month == 9 || month == 11 ) {
            // Months having 30 days
            if (day > 30) {
                return false;
            }
        }
        else {
            // February
            if (isLeapYear(year)) {
                if (day > 29) {
                    return false;
                }
            } else {
                if (day > 28) {
                    return false;
                }
            }
        }
        return true;
    }

    // Check if a given year is a leap year
    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    //1
    public void setMonth(int newMonth){
        if (validateMonthAndDay(newMonth,this.day)){
            month = newMonth;
        }
    }
    //1
    public void setDay(int newDay){
        if(validateMonthAndDay(this.month,newDay)){
            day = newDay;
        }
    }
    //5
    private boolean validateTime(int time){
        if (time < 0 || time >23) {
            return false;
        }
        return true;
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

    public int getStartTime(){
        return startTime;
    }
    public int getEndTime(){
        return endTime;
    }



























}



















































//    private boolean isValidDate(int day, int month, int year) {
//        // Validate year (we assume four-digit year)

//
//        // Validate month
//        if (month < 1 || month > 12) {
//            return false;
//        }
//
//        // Validate day
//        if (day < 1) {
//            return false;
//        }

//
//        return true;
//    }
//
//    // Check if a given year is a leap year
//    private boolean isLeapYear(int year) {
//        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
//    }