package Internship;

import java.util.Scanner;

public class GradeCalculator {

    static class Student{
        private String name;
        private int age;
        private float marks;

        Student(){
            name=null;
            age=0;
            marks=0;
        }

        Student(String name, int age, float marks ){
            this.name=name;
            this.age=age;
            this.marks=marks;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setAge(byte age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public float getMarks() {
            return marks;
        }

        public void setMarks(float marks) {
            this.marks = marks;
        }
    }

    public static void main(String[] args) {

        System.out.println("Student details are:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        String name=sc.nextLine();
        System.out.println("Enter age:");
        int age = sc.nextInt();
        System.out.println("Enter marks out of 500");
        int marks=sc.nextInt();
        Student s= new Student(name,age,marks);
        System.out.println("Name: "+s.getName()+",  "+"Age: "+ s.getAge()+",  "+"Marks: "+s.getMarks());
        System.out.println("Grade obtained:");
        float grade=s.getMarks()/5;
        char g=' ';
        if(grade>90 && grade<100){
            g='A';
        }

        else if(grade>80 && grade<90){
            g='B';
        }

        else if(grade>70 && grade<80){
            g='C';
        }

        else if(grade>60 && grade<70){
            g='D';
        }

        else{
            g='F';
        }

        System.out.println(g);
    }
}
