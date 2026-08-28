```java

import java.util.Scanner;

class gradesystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student's name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks in Subject 1: ");
        int mark1 = sc.nextInt();

        System.out.print("Enter marks in Subject 2: ");
        int mark2 = sc.nextInt();

        System.out.print("Enter marks in Subject 3: ");
        int mark3 = sc.nextInt();

        int total = mark1 + mark2 + mark3;

        double average = (double) total / 3;

        boolean passed;

        if (mark1 >= 40 && mark2 >= 40 && mark3 >= 40) {
            passed = true;
        } else {
            passed = false;
        }

        boolean distinction;

        if (passed && average >= 75) {
            distinction = true;
        } else {
            distinction = false;
        }

        boolean specialAward;

        if (passed && average >= 90 && mark1 >= 85 && mark2 >= 85 && mark3 >= 85) {
            specialAward = true;
        } else {
            specialAward = false;
        }

        System.out.println("\n----- STUDENT RESULT -----");
        System.out.println("Student Name : " + name);
        System.out.println("Subject 1    : " + mark1);
        System.out.println("Subject 2    : " + mark2);
        System.out.println("Subject 3    : " + mark3);
        System.out.println("Total Marks  : " + total);
        System.out.println("Average      : " + average);

        if (passed) {
            System.out.println("Result       : PASS");
        } else {
            System.out.println("Result       : FAIL");
        }

        if (distinction) {
            System.out.println("Distinction  : YES");
        } else {
            System.out.println("Distinction  : NO");
        }

        if (specialAward) {
            System.out.println("Special Award: YES");
        } else {
            System.out.println("Special Award: NO");
        }

        sc.close();
    }
}
```
