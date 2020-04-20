package demo;

public class Driver {
    public static void main(String[] args) {
        Appointment appointment = new Appointment(2020,4,20,15,16);
        System.out.println(appointment);


        int[] myArray = new int[100];


        Appointment[] myArray1 = new Appointment[100];
        for(int i = 0; i < 100; i++){
            myArray1[i] = new Appointment();
        }
    }
}
