/**
 *AP-Workshop02
 *Mohammad Yarahmadi
 *40231059
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the number of students:......");
        int n = input.nextInt();
        Student[] labClass = new Student[n];
        Lab test1 = new Lab("Pouria Azizi", "Mondey", n);
        System.out.println("enter the students' information like following example :");
        System.out.println("ex --->>>> Mohammad Yarahmadi <idCode> <grade>");
        for (int i = 0; i < n; i++) {
            String s1 = input.next(), s2 = input.next(), s3 = input.next(), s4 = input.next();
            labClass[i] = new Student(s1, s2, s3, s4);
        }
        test1.setStudents(labClass);
        test1.setavgGrade(labClass);
//        Student std1 = new Student("Mohammad", "Yarahmadi", "1234567", "19.2");
//        Student std2 = new Student("Arsalan", "mousivand", "1234567", "2.6");
        for (int i = 0; i < n; i++) {
            labClass[i].printInfo();
        }
        /*System.out.println("............");
        std1.printInfo();
        std2.printInfo();*/
        test1.printLabInfo();
    }
}

