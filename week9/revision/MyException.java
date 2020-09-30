package week9.revision;

public class MyException extends Exception{
    public MyException(){
        super("the default exception");
    }
    public MyException(String message){
        super(message);
    }
}
