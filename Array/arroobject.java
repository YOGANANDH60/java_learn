class student {
    int roll;
    String name;
    int marks; 
    
}

public class arroobject {
    public static void main(String[] args) {
        student s1 = new student();
        s1.roll=01;
        s1.name="yoga";
        s1.marks=99;
        
        student s2 = new student();
        s2.roll=02;
        s2.name="funny";
        s2.marks=98;

        student s3 = new student();
        s3.roll=03;
        s3.name="cat";
        s3.marks=97;

        student students[]=new student[3];
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        // enhanced for loop
        for (student stud: students)
        {
            System.out.println(stud.name+" = "+stud.marks);
        }
    }
}
