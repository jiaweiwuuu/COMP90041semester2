package week5.revision;

public class CallByValueDemo {

    public static void primitiveCallByValue(int i){
        i = 6;
    }

    public static void classCallByValue(Student student){

    }


    public static void main(String[] args) {
        int i = 5;
        primitiveCallByValue(i);
        System.out.println(i);
    }
}
