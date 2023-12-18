

import java.text.DecimalFormat;
import java.util.ArrayList;
import  java.util.List;
import java.util.Scanner;
public class GradeCalculator {

    public double calculateTotalMarks(Student s1)
    {
        double totalMarks=0;
        List <Double> marksList=s1.getMarks();
        for(int i=0;i<marksList.size();i++){
            totalMarks=totalMarks+marksList.get(i);
        }
        return totalMarks;
    }
    public double calculatePerc(double totalMarks,int totalSubjects){
        double percentage=totalMarks/totalSubjects;

        return percentage;
    }
    public String calculateGrade(double percentage){


        if(percentage>=85 && percentage<=100){
            return  " A+";
        }
        else if(percentage >=75 && percentage <85){
            return " A ";

        } else if ( percentage >=65 && percentage <75) {
            return " B ";
        } else if (percentage >=55 && percentage <65) {
            return " C ";
        } else if (percentage >=45 && percentage <55) {
            return " D ";
        } else if (percentage >=35 && percentage <45) {
            return " E ";

        }
        else {
            return "Fail";
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        DecimalFormat defactor=new DecimalFormat("0.00");
        System.out.println("Welcome to The Student Grade Calculator !");
        System.out.println();
        System.out.println("Enter number of Subjects:");
        int numberOfSubjects=sc.nextInt();
        ArrayList<Double> marksList=new ArrayList();
        Student s1=new Student();
        for(int i=1;i<=numberOfSubjects;i++){
            System.out.print("Enter marks of subject "+i+" (out of 100) :");

            double marks=sc.nextDouble();
            marksList.add(marks);

        }
        s1.setMarks(marksList);
        GradeCalculator gc=new GradeCalculator();
        double totalMarks= gc.calculateTotalMarks(s1);

        double percentage= gc.calculatePerc(totalMarks,numberOfSubjects);
        String grade=gc.calculateGrade(percentage);
        System.out.println("-----------------||------------||----------------||-------------||-------------------");
        System.out.println("Total Marks:"+totalMarks);
        System.out.println("Percentage:"+defactor.format(percentage) +"%");
        System.out.println("Your grade:"+grade);
        System.out.println("Thank You !");
    }
}
