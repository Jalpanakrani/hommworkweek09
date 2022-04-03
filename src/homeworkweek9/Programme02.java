package homeworkweek9;

import java.util.Scanner;

public class Programme02 {

        public static void main(String[] args){
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner((System.in));
        System.out.println("/nEnter the Student Name       /t /t:/t ");
        String name = scanner.next();
        System.out.println("Enter Student Roll Number     /t/t:/t");
        int rollNum = scanner.nextInt();
        System.out.println("Enter Marks of Subject Maths   /t:/t");
        int mathsMarks = scanner.nextInt();
        if (mathsMarks < 0 || mathsMarks > 100) {
            System.out.println("/nInvalid input, Marks should between o to 100");
            System.out.println("/nPlese enter correct marks/t/t:/t");
            mathsMarks = scanner.nextInt();
        }
        System.out.println("Enter Marks of Subject Science/t:/t");
        int scienceMarks=scanner.nextInt();
        if(scienceMarks <0 || scienceMarks>100){
            System.out.println("/nInvalid input, Marks should between 0 to 100");
            System.out.println("/Please enter correct marks/t/t:/t");
            scienceMarks=scanner.nextInt();
        }
        System.out.println("Enter Marks of Subject English\t:\t");
        int englishMarks = scanner.nextInt();
        if (englishMarks < 0 || englishMarks > 100) {
            System.out.println("/nInvalid input ,Marks should between 0 to 100 ");
            System.out.println(" /nPlese enter correct marks/t/t:/t");
            englishMarks=scanner.nextInt();
        }
        int total=sum(mathsMarks,scienceMarks,englishMarks);
        int percentage =(total*100)/300;
        String result=calculateResult(mathsMarks,scienceMarks,englishMarks);
        String grade =calculateGrade(percentage , result);
        printTheMarkSheet(name, rollNum, mathsMarks, scienceMarks, englishMarks, total, percentage, result, grade);
        //Closing the scanner object
        scanner.close();
    }
        //calculating the sum
        public static int sum(int a,int b,int c) {
        return a + b + c;
    }
        //calculating the results on subjects marks
        public static String calculateResult(int mathsMarks, int scienceMarks,int englishMarks) {
        if (mathsMarks < 35 || scienceMarks < 35 || englishMarks < 35) {
            return "Fail";
        } else {
            return "Pass";
        }
    }
        //Calculating the grade on percentage and result
        public static String calculateGrade(int percentage,String result) {
        String grade = "  ";
        while ((percentage <= 100)) {
            if (percentage >= 80) {
                grade = "A+";

            } else if (percentage >= 60  && percentage <= 80) {
                grade = "A";
            } else if (percentage >= 50 && percentage <= 60) {
                grade = "B";
            } else if (percentage >= 35 && percentage <= 0) {
                grade = "C";

            }else {
                grade = "  ";
            }
            break;
        }
        return grade;
    }
        //Printing the Marks sheet

        public static void printTheMarkSheet(String name,int rollNum,int mathsMarks,int scienceMarks,int englishMarks,
        double total, double percentage,String result,String grade) {

        System.out.println("---------------------------------------");
        System.out.println("|                                      |");
        System.out.println("|     Mark Sheet                       |");
        System.out.println("|                                      |");
        System.out.println("|---------------------------------------|");
        System.out.println("|  Name:" + name + "                    | ");
        System.out.println("|  Roll No:" + rollNum + "                  |");
        System.out.println("|----------------------------------------|");
        System.out.println("| SUBJECTS : Marks                       |");
        System.out.println("|----------------------------------------|");
        System.out.println("|Math:" + mathsMarks + "                  |");
        System.out.println("| Science:" + scienceMarks + "             |");
        System.out.println("|English:" + englishMarks + "            |");
        System.out.println("|-----------------------------------------|");
        System.out.println("|Total:" + total + "                        |");
        System.out.println("|-----------------------------------------|");
        System.out.println("| Percentage:" + percentage + "               |");
        System.out.println("|Result:" + result + "                       |");
        System.out.println("| Grade:" + grade + "                        |");
        System.out.println("|-------------------------------------------|");
    }
    }

