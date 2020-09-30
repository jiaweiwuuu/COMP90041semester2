package week9.revision;

public class ExceptionRevision {
    public static void main(String[] args){
        int a = -1;
        try{
            throwException(a);
        }
        catch (MyException e){
            System.out.println("caught in the main");
        }
        catch (Exception e){
            System.out.println("caught in the main 2");
        }
    }

    public static void throwException(int num) throws Exception{
        try{
            if(num <= 0){
                throw new MyException("the exception");
            }
        }
        catch (MyException e){
            System.out.println("caught in the method");
            throw new Exception("test");
        }

    }
}
