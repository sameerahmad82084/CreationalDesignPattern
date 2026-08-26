
public class Student {
    private String name;
    private String email;
    private String contactNo;
    private Student(StudentBuilder studentBuilder){
        this.name=studentBuilder.name;
        this.email=studentBuilder.email;
        this.contactNo=studentBuilder.contactNo;
    }
    public String getName(){
        return this.name;
    }

    public String getContactNo() {
        return this.contactNo;
    }

    public String getEmail() {
        return this.email;
    }

    public static StudentBuilder getStudentBuilder(){
        return new StudentBuilder();
    }

    public static class StudentBuilder{
        private String name;
        private String email;
        private String contactNo;
        public  StudentBuilder setName(String name){
            this.name=name;
            return this;
        }
        public StudentBuilder setEmail(String email){
            this.email=email;
            return this;
        }
        public StudentBuilder setContactNo(String contactNo){
            this.contactNo=contactNo;
            return this;
        }
        public Student build(){
            if(!this.validateEmail(this.email)){
                throw new RuntimeException("Enter correct email");
            }
            if(!this.validateContact(this.contactNo)){
                throw new RuntimeException("Enter correct contact number");
            }
            if(!this.validateName(this.name)){
                throw new RuntimeException("Enter correct Name");
            }
            return new Student(this);

        }
        private boolean validateName(String name){

            return name!=null&&!name.isBlank() &&(name.length()<50);
        }
        private boolean validateEmail(String email){
            return email!=null&&!email.isBlank() &&email.contains("@gmail.com");
        }
        private boolean validateContact(String contactNo){
             return contactNo != null &&!contactNo.isBlank() &&contactNo.matches("\\d{10}");
        }

    }
}
