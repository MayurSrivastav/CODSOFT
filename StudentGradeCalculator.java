import java.util.*;
public class StudentGradeCalculator {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int totalMarks=0;
        String grade;
        System.out.println("Enter the number of subjects:");
        int n=sc.nextInt();
        for(int i=1;i<n+1;i++){
            System.out.println("Enter the "+i+" subject marks out of 100:");
            int a=sc.nextInt();
            totalMarks=totalMarks+a;
        }
        double avgper = (double)totalMarks/n;
        if (avgper >=90){
            grade="A+";
        }
        else if(avgper >=80 && avgper <90){
            grade="A";
        }
        else if(avgper >=70 && avgper <80){
            grade="B";
        }
        else if(avgper >=60 && avgper <70){
            grade="C";
        }   
        else if(avgper >=50 && avgper <60){
            grade="D";
        }
        else if(avgper >=40 && avgper <50){
            grade="E";
        }
        else{
            grade="F";
        }
        System.out.println("********************************************************");
        System.out.println("******************** STUDENT RESULT ********************");
        System.out.println("Total marks obtained by student is: "+totalMarks+"/"+(n*100));
        System.out.println("Average percentage of student is: "+avgper+"%");
        System.out.println("Grade obtained by student is: "+grade);
        System.out.println("********************************************************");
        System.out.println("********************************************************");

    }
}