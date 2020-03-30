public class test {
    public static void main(String[] args){
        Student st1 = new Student("contructor name",10);


        //st1.setId(2);
        System.out.println(st1.getId());
        System.out.println(st1.getName());
        //st1.setName("blablabla");


        //String st1Name = st1.getName();


        String job = Student.getJob();


        System.out.println(st1.getName());


        // static class.method()
        //non-static object.method()


        String demo = "abcdefg";

        for(int i = 0; i < demo.length();i++){
            System.out.println(demo.charAt(i));
        }

        int j = 0;
        while (demo.charAt(j) != 'e'){
            System.out.println(demo.charAt(j));
            j++;
        }



    }
}
