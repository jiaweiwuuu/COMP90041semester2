package week5;
public class AppointmentTime {
	private int hour;
	private int minute;
	private int second;
	
	/* Constructors */
	
	public AppointmentTime() {
		hour = 0;
		minute = 0;
		second = 0; 	
	}
	
	public AppointmentTime(int hr, int min, int sec) {
		hour = hr;
		minute = min;
		second = sec;
	}
	
	/* Accessors */
	public int getHour() {
		return hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public int getSecond() {
		return second;
	}
	
	/* Mutators */
	public void setTime(int hr, int min, int sec) {
		hour = hr;
		minute = min;
		second = sec;
	}
	
	public void setHour(int hr) {
		hour = hr;
	}
	
	public void setMinute(int min) {
		minute = min;
	}
	
	public void setSecond(int sec) {
		second = sec;
	}
	
	public String toString( ) {
        return (hour + ":" + minute + ":" + second);
    }
}
