/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmicategories;
import java.util.Scanner;
/**
 *
 * @author kendrabooker
 */
public class BMICategories {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             Scanner keyboard = new Scanner(System.in);
        
        int weight, inches, height;
        double heightInMeters, BMI;
        
        System.out.print("Your height in feet? ");
        height = keyboard.nextInt();
        
        System.out.print("any inches? ");
        inches = keyboard.nextInt();
        
        System.out.print("Your weight in pounds? ");
        weight = keyboard.nextInt();
        
        heightInMeters = (height / 3.28) * (height / 3.28);
        BMI = (weight / 2.2) / heightInMeters;
        
        if(BMI < 18.5){
            System.out.println("You're BMI is: " + BMI + " under weight");
        }else if(BMI >= 18.5 && BMI <= 24.9){
            System.out.println("You're BMI is: " + BMI + " normal weight");
        }else if(BMI >= 25.0 && BMI <= 29.9){
            System.out.println("You're BMI is: " + BMI + " over weight");
        }else{
            System.out.println("You're BMI is: " + BMI + " obese");
        }
        
        
    }
    
}
