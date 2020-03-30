public class Student {
    private int id; //attribute, instance variable of class Student

    private String name; // private for encapsulation and safety


    private static String job = "student";

    public Student(String newName, int newId){  // constructor
        id = newId;
        name = newName;
    }


    public static String getJob(){  // accessor or getter
        return job;
    }

    public void setName(String newName){ //mutator or setter
        name = newName;
    }

    public void setId(int newId){  //setter or mutator
        id = newId;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }


}
