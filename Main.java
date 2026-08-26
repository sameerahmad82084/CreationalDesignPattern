
public class Main {
    public static void main(String[]args){
        Student s1=Student.getStudentBuilder().
                setName("sameer")
                .setContactNo("8732365791")
                .setEmail("sameer@gmail.com").build();
        System.out.println(s1);
    }


}
