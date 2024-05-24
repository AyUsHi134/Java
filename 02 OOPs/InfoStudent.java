public class InfoStudent extends PersonInfo { // by extending person class we can use everything in person class
    private String collegeName;
    private int year;

    public InfoStudent(String name, String collegeName){
        super(name);
        this.collegeName = collegeName;
    }
    
    public String getCollegeName() {
        return collegeName;
    }
    
    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
    
    public int getYear() {
        return year;
    }
    
    public void setYear(int year) {
        this.year = year;
    }

    public static void main(String[] args) {
        InfoStudent student = new InfoStudent("Ayushi", "CEO");
        //student.setName("Ayushi");
        student.setEmail("ayushisingh9453@gmail.com");
       
        /* 
        PersonInfo person = new PersonInfo();
        person.setName("Ayushi");
        person.setEmail("ayushisingh9453@gmail.com");
        person.setPhoneNumber("9369577506");
        String value = person.toString();
        System.out.println(value);
        System.out.println(person);

        */

        EmployeeInfo employee = new EmployeeInfo("Ayushi", "CEO");
        //employee.setName("Ayushi");
        employee.setEmail("ayushisingh9453@gmail.com");
        employee.setPhoneNumber("9369577506");
        employee.setEmployeGrade('A');
        employee.setTitle("CEO");

        System.out.println(employee);


    }
    

    
}
