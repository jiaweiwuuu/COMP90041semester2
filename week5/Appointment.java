package week5;

import week5.AppointmentDate;
import week5.AppointmentTime;

public class Appointment {
    private AppointmentDate date = new AppointmentDate();
    private AppointmentTime startTime = new AppointmentTime();
    private AppointmentTime endTime = new AppointmentTime();

    public void setDate(int day, int month, int year) {
        date.setDate(day, month, year);
    }

    public void setStartTime(int hr, int min, int sec) {
        startTime.setTime(hr,min,sec);
    }

    public void setEndTime(int hr, int min, int sec) {
        endTime.setTime(hr,min,sec);
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "date=" + date.toString() +
                ", startTime=" + startTime.toString() +
                ", endTime=" + endTime.toString() +
                '}';
    }
}
