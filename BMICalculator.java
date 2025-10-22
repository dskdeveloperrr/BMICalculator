import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight (kg): "); 
        double weight = sc.nextDouble();
        System.out.print("Enter height (cm): "); 
        double height = sc.nextDouble();
        double bmi = weight / ((height/100)*(height/100));
        System.out.println("BMI: " + bmi);
        if(bmi<18.5) System.out.println("Underweight");
        else if(bmi<24.9) System.out.println("Normal weight");
        else if(bmi<29.9) System.out.println("Overweight");
        else System.out.println("Obese");
        sc.close();
    }
}
