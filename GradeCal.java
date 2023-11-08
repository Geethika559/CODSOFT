import java.util.*;
public class GradeCal {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int total_marks=0;
        double average_percentage;
        System.out.print("Enter total number of subjects :");
        int subjects=sc.nextInt();
        System.out.println("Enter marks obtained in each subject(out of 100)");
        for(int i=1;i<subjects+1;i++){
            System.out.print("Subject "+i+" :");
            int marks=sc.nextInt();
            total_marks=total_marks+marks;
        }   
        average_percentage=(double)total_marks/subjects;
        System.out.println("\nResults"+"\nTotal marks: " +total_marks);
        System.out.println("Average Percentage: "+String.format("%.2f",average_percentage));
        System.out.println("Grade: "+calGrade(average_percentage));

        sc.close();

    }
    
    public static String calGrade( double avg){
        if(avg>=90){
            return "A";
        }else if(avg>=80){
            return "B";
        }else if(avg>=70){
            return "C";
        }else if(avg>=60){
            return "D";
        }else if(avg>=50){
            return "E";
        }else{
            return "F";
        }
    }
    
}
