
public class ReferenceTypeArray {



    public static void main(String[] args) {

        Student[] student = new Student[3];
        student[0] = new Student(11,"AAB");
        student[1]=new Student(22,"BBB");
        student[2]=null;

        System.out.println(student[0].name +" "+ student[0].rollNo);
        System.out.println(student[1].name +" "+ student[1].rollNo);
    //    System.out.println(student[2].name +" "+ student[2].rollNo);


        int[] number= new int[5];

        number[0]=10;
        number[1]=20;
        number[2]=30;
        number[3]=40;

        System.out.println(number[4]);

        int[] rollNo= {11,22,33,44,55};
        System.out.println(rollNo[4]);







    }




    }

    class Student {
    int rollNo;
    String name;

    Student(int rollNo,String name){
        this.rollNo= rollNo;
        this.name=name;
    }
    }
