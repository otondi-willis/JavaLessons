package org.sajourney.JavaLessons.arrays;

class Student{
    public String name;
    public int age;
}
public class ObjectArrays {
    public static void main(String[] args){
        Student s1 = new Student();

        s1.name="otosh";
        s1.age=20;

        Student s2 = new Student();
        s2.name="otos";
        s2.age=29;

        Student s3 = new Student();
        s3.name="otsh";
        s3.age=2;

        Student students[]=new Student[3];

        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        for(Student m:students){

            System.out.println(m.name);
        }



    }

}
