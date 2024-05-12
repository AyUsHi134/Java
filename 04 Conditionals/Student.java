public class Student {
    private int marks;
    
    public Student(int marks) {
        this.marks = marks;
    }

    public char assignGrade() {
        if (marks > 100 || marks < 0) {
            return 'X';
        }

        if(marks >= 90) {
            return 'A';
        }

        if(marks >= 80) {
            return 'B';
        }

        if(marks >= 70) {
            return 'C';
        }

        if(marks >= 60) {
            return 'D';
        }

        if(marks >= 50) {
            return 'E';
        }

         return 'F';
        
    }

    public static void main(String[] args) {
        Student student = new Student(92);
        System.out.println(student.assignGrade());
    }



    
}
